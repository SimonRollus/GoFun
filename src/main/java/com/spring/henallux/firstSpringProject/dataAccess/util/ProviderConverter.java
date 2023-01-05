package com.spring.henallux.firstSpringProject.dataAccess.util;

import com.spring.henallux.firstSpringProject.dataAccess.entity.*;
import com.spring.henallux.firstSpringProject.model.*;
import org.springframework.stereotype.Component;

@Component
public class ProviderConverter {


    //CATEGORY
    public Category categoryEntityToCategoryModel(CategoryEntity categoryEntity){
        Category category = new Category();
        category.setCategory_id(categoryEntity.getCategory_id());
        return category;
    }

    public CategoryEntity categoryModelToCategoryEntity(Category category){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategory_id(category.getCategory_id());
        return categoryEntity;
    }

    //DISCOUNT
    public Discount discountEntityToDiscountModel(DiscountEntity discountEntity){
        Discount discount = new Discount();

        if(discountEntity != null){
            discount.setDiscount_id(discountEntity.getDiscount_id());
            discount.setPercentage_discount(discountEntity.getPercentage_discount());
            discount.setStart_date(discountEntity.getStart_date());
            discount.setEnd_date(discountEntity.getEnd_date());
        }

        return discount;
    }

    public DiscountEntity discountModelToDiscountEntity(Discount discount){
        DiscountEntity discountEntity = new DiscountEntity();
        discountEntity.setDiscount_id(discount.getDiscount_id());
        discountEntity.setPercentage_discount(discount.getPercentage_discount());
        discountEntity.setStart_date(discount.getStart_date());
        discountEntity.setEnd_date(discount.getEnd_date());
        return discountEntity;
    }

    //GAME
    public GameEntity gameModelToGameEntity(Game game){
        GameEntity gameEntity = new GameEntity();
        gameEntity.setGame_id(game.getGameId());
        gameEntity.setName(game.getName());
        gameEntity.setDescription(game.getDescription());
        gameEntity.setPrice(game.getPrice());
        gameEntity.setCategory(categoryModelToCategoryEntity(game.getCategory()));
        gameEntity.setDiscount(discountModelToDiscountEntity(game.getDiscount()));
        gameEntity.setImage(game.getImage());
        gameEntity.setMinimum_age(game.getMinimum_age());
        gameEntity.setMinimum_number_players(game.getMinimum_number_players());
        gameEntity.setMaximum_number_players(game.getMaximum_number_players());

        return gameEntity;
    }

    public Game gameEntityToGameModel(GameEntity gameEntity){
        Game game = new Game();
        game.setGame_id(gameEntity.getGame_id());
        game.setName(gameEntity.getName());
        game.setDescription(gameEntity.getDescription());
        game.setPrice(gameEntity.getPrice());
        game.setCategory(categoryEntityToCategoryModel(gameEntity.getCategory()));
        game.setDiscount(discountEntityToDiscountModel(gameEntity.getDiscount()));
        game.setImage(gameEntity.getImage());
        game.setMinimum_age(gameEntity.getMinimum_age());
        game.setMinimum_number_players(gameEntity.getMinimum_number_players());
        game.setMaximum_number_players(gameEntity.getMaximum_number_players());
        return game;
    }

    // CUSTOMER
    public CustomerEntity customerModelToCustomerEntity(Customer customer){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(customer.getCustomer_id());
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setUsername(customer.getUsername());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setPassword(customer.getPassword());
        customerEntity.setPhoneNumber(customer.getPhone_number());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setStatut(customer.getStatut());
        customerEntity.setAuthorities(customer.getAuthorities().toString());
        customerEntity.setCredentialsNonExpired(customer.isCredentialsNonExpired());
        customerEntity.setEnabled(customer.isEnabled());
        customerEntity.setNonLocked(customer.isAccountNonLocked());
        customerEntity.setAccountNonExpired(customer.isAccountNonExpired());
        return customerEntity;
    }

    public Customer customerEntityToCustomerModel(CustomerEntity customerEntity) {
        Customer customer = new Customer();
        customer.setCustomer_id(customerEntity.getCustomerId());
        customer.setFirstName(customerEntity.getFirstName());
        customer.setLastName(customerEntity.getLastName());
        customer.setUsername(customerEntity.getUsername());
        customer.setEmail(customerEntity.getEmail());
        customer.setPassword(customerEntity.getPassword());
        customer.setPhone_number(customerEntity.getPhoneNumber());
        customer.setAddress(customerEntity.getAddress());
        customer.setStatut(customerEntity.getStatut());
        customer.setAuthorities(customerEntity.getAuthorities());
        customer.setCredentials_non_expired(customerEntity.getCredentialsNonExpired());
        customer.setEnabled(customerEntity.getEnabled());
        customer.setAccount_non_locked(customerEntity.getNonLocked());
        customer.setAccount_non_expired(customerEntity.getAccountNonExpired());
        return customer;
    }


    //ORDER
        public OrderEntity orderModelToOrderEntity(Order order){
            OrderEntity orderEntity = new OrderEntity();
            orderEntity.setOrder_id(order.getOrder_id());
            orderEntity.setOrder_date(order.getOrder_date());
            orderEntity.setOrderPaid(order.getIs_order_paid());
            orderEntity.setCustomer(customerModelToCustomerEntity(order.getCustomer()));
            return orderEntity;
        }

        public Order orderEntityToOrderModel(OrderEntity orderEntity){
            Order order = new Order();
            order.setOrder_id(orderEntity.getOrder_id());
            order.setOrder_date(orderEntity.getOrder_date());
            order.setIs_order_paid(order.getIs_order_paid());
            order.setCustomer(customerEntityToCustomerModel(orderEntity.getCustomer()));
            return order;

        }

        //ORDER_LINE

        public OrderLineEntity orderLineModelToOrderLineEntity(OrderLine orderLine){
            OrderLineEntity orderLineEntity = new OrderLineEntity();
            orderLineEntity.setOrder_line_id(orderLine.getOrder_line_id());
            orderLineEntity.setReal_price(orderLine.getReal_price());
            orderLineEntity.setQuantity(orderLine.getQuantity());
            orderLineEntity.setOrder(orderModelToOrderEntity(orderLine.getOrder()));
            orderLineEntity.setGame(gameModelToGameEntity(orderLine.getGame()));
            return orderLineEntity;
        }

        public OrderLine orderLineEntityToOrderLineModel(OrderLineEntity orderLineEntity){
            OrderLine orderLine = new OrderLine();
            orderLine.setOrder_line_id(orderLineEntity.getOrder_line_id());
            orderLine.setReal_price(orderLineEntity.getReal_price());
            orderLine.setQuantity(orderLineEntity.getQuantity());
            orderLine.setOrder(orderEntityToOrderModel(orderLineEntity.getOrder()));
            orderLine.setGame(gameEntityToGameModel(orderLineEntity.getGame()));
            return orderLine;

        }

        // LANGUAGE

        public Language languageEntityToLanguageModel(LanguageEntity languageEntity){
            Language language = new Language();
            language.setLanguage_id(languageEntity.getLanguage_id());
            return language;
        }

        public LanguageEntity languageModelToLanguageEntity(Language language){
            LanguageEntity languageEntity = new LanguageEntity();
            languageEntity.setLanguage_id(language.getLanguage_id());
            return languageEntity;
        }

        // TRANSLATION

        public Translation translationEntityToTranslationModel(TranslationEntity translationEntity){
            Translation translation = new Translation();
            translation.setTranslation_id(translationEntity.getTranslation_id());
            translation.setLabel(translationEntity.getLabel());
            translation.setLanguage(languageEntityToLanguageModel(translationEntity.getLanguage()));
            translation.setCategory(categoryEntityToCategoryModel(translationEntity.getCategory()));
            return translation;
        }

        public TranslationEntity translationModelToTranslationEntity(Translation translation){
            TranslationEntity translationEntity = new TranslationEntity();
            translationEntity.setTranslation_id(translation.getTranslation_id());
            translationEntity.setLabel(translation.getLabel());
            translationEntity.setCategory(categoryModelToCategoryEntity(translation.getCategory()));
            translationEntity.setLanguage(languageModelToLanguageEntity(translation.getLanguage()));
            return translationEntity;

        }
















}
