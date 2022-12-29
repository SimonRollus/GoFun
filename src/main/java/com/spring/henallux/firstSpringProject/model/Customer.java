package com.spring.henallux.firstSpringProject.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Customer implements UserDetails {
    @Min(value = 1)
    private Integer customer_id;

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 50)
    private String lastName;

    @NotNull
    @Size(min = 5, max = 50)
    private String username;
    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min = 5, max = 50)
    private String password;

    @NotNull
    @Size(max = 15)
    private String phone_number;

    @NotNull
    @Size(min = 5, max = 50)
    private String address;

    private String statut;

    private String authorities;

    private Boolean credentials_non_expired;

    private Boolean enabled;

    private Boolean account_non_locked;

    private Boolean account_non_expired;


    public Customer() {
    }



    public Integer getCustomer_id() {
        return customer_id;
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


    public String getPhone_number() {
        return phone_number;
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
        return credentials_non_expired;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAccountNonLocked() {
        return account_non_locked;
    }

    public boolean isAccountNonExpired() {
        return account_non_expired;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
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


    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public void setCredentials_non_expired(Boolean credentials_non_expired) {
        this.credentials_non_expired = credentials_non_expired;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccount_non_locked(Boolean account_non_locked) {
        this.account_non_locked = account_non_locked;
    }

    public void setAccount_non_expired(Boolean account_non_expired) {
        this.account_non_expired = account_non_expired;
    }
}
