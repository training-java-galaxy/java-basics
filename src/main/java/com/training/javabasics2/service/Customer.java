package com.training.javabasics2.service;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;

    public Customer(){
        super();
    }

    public Customer(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
