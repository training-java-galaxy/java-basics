package com.training.javabasics2.service;

public class Example {

    void hola(){

        String bankName = AccountProperties.BANK_NAME;

        AccountProperties accountProperties = new AccountProperties();

        accountProperties.getAccountHolder();

        int value = Integer.parseInt("123");

        Integer value2 = Integer.parseInt("999");

        Integer value3 = value + value2;


        AccountProperties accountPropertiesWithConstructorValue = new AccountProperties("000289",100d);

        AccountProperties accountPropertiesWithConstructorValue2 = new AccountProperties("German","Hernandez","Lopez");

        System.out.println("nombre clase hija:" + null); // Debe imprimir Angel

        System.out.println("nombre clase padre:" + null); // Debe imprimir German

    }
}
