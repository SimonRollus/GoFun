package com.spring.henallux.firstSpringProject.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.Transient;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Customer implements UserDetails {

    @Min(value = 1)
    private Integer customerID;

    @NotEmpty(message="Not empty firstName !")
    @Size(min = 2, max = 50)
    private String firstName;

    @NotEmpty(message="Not empty lastName!")
    @Size(min = 2, max = 50)
    private String lastName;

    @NotEmpty (message="Not empty username!")
    @Size(min = 5, max = 50)
    private String username;

    @NotEmpty (message="Not empty password!")
    @Email (message="Not valid email!")
    private String email;

    @NotEmpty (message="Not empty password!")
    @Size(min = 5, max = 50)
    private String password;

    @NotEmpty
    @Size(max = 15)
    private String phoneNumber;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String address;

    private String statut;

    private String authorities;

    private Boolean credentialsNonExpired;

    private Boolean enabled;

    private Boolean accountNonLocked;

    private Boolean accountNonExpired;

    public Customer() {
    }



    public Integer getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getStatut() {
        return statut;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if (authorities != null && !authorities.isEmpty()) {
            String[] authoritiesAsArray = authorities.split(",");

            for (String authority : authoritiesAsArray) {
                if (authority != null && !authority.isEmpty()) {
                    grantedAuthorities.add(new SimpleGrantedAuthority(authority));
                }
            }
        }

        return grantedAuthorities;
    }

    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    // ToString
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
