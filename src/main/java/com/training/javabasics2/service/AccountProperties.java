package com.training.javabasics2.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountProperties extends Customer {

    // Propiedad estática constante
    public static final String BANK_NAME = "Banco Fintech";

    // Propiedad de instancia
    private String accountHolder;

    // Propiedad primitiva
    private double balance;

    // Propiedad wrapper
    private Double balance2;

    // Propiedad volátil (podría ser usada en un contexto multihilo para asegurar la visibilidad)
    private volatile boolean isActive;

    // Propiedad transitoria (no se serializa, útil para datos temporales o sensibles)
    private transient String sessionToken;

    private String firstName;

    private String lastName;

    private String email;

    // Constructor parametrizado
    public AccountProperties(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.isActive = true; // por defecto
        this.sessionToken = generateSessionToken();//por defecto

        String h = "";
    }


    // Constructor vacio
    public AccountProperties() {
        super();
    }

    public AccountProperties(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
        this.firstName = "Angel";
    }

    // Métodos de instancia para manejar el balance
    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
    }

    // Método estático
    public static String getBankName() {

        return BANK_NAME;
    }

    // Método privado para generar un token de sesión
    private String generateSessionToken() {

        if (this.isActive){

            String h="";


            return this.sessionToken;
        }

        if (this.isActive){

        String h="";


        }


        return "TK" + System.currentTimeMillis();
    }

    // Getters y Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Cuenta de " + accountHolder + " con balance: $" + balance + " - " + (isActive ? "Activa" : "Inactiva");
    }
}
