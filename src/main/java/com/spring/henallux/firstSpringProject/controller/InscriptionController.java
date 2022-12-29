package com.spring.henallux.firstSpringProject.controller;

import com.spring.henallux.firstSpringProject.Constants;
import com.spring.henallux.firstSpringProject.model.Customer;
import com.spring.henallux.firstSpringProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.Locale;


@Controller
@RequestMapping(value="/inscription")
@SessionAttributes({Constants.CURRENT_USER})

public class InscriptionController {

    private CustomerService customerService;

    private MessageSource messageSource;

    @Autowired
    public InscriptionController(CustomerService customerService, MessageSource messageSource) {
        this.customerService = customerService;
        this.messageSource = messageSource;
    }

    @ModelAttribute(Constants.CURRENT_USER)
    public Customer customer(){
        return new Customer();
    }

    @RequestMapping (method = RequestMethod.GET)
    public String userInscription (Model model) {
        model.addAttribute("inscriptionForm", new Customer());
        return "integrated:inscription";
    }

    @RequestMapping (method = RequestMethod.POST)
    public String postUser (Model model, Locale locale, @Valid @ModelAttribute(value = Constants.CURRENT_USER) Customer customer, final BindingResult errors){
        if(!errors.hasErrors()){
            boolean isRegistered = customerService.saveCustomer(customer);
            if(isRegistered){
                return "redirect:/home";
            }else{
                model.addAttribute("customerExists", messageSource.getMessage("customerAlreadyExist", new Object[0], locale));
                return "integrated:inscription";
            }
        }
        model.addAttribute("errors",errors);
        return "integrated:inscription";
    }


}
