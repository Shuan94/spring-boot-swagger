/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatronic.simulador.dto;

/**
 *
 * @author jvalencia
 */
public class ConsultaData {

    private String customerName;
    private String accountReference;
    private Double accountBalance;
    private Double lastBillAmount;
    private Long lastBillDueDate;
    private Integer currencyId;
    private String currencyIsoCode;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String accountReference) {
        this.accountReference = accountReference;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getLastBillAmount() {
        return lastBillAmount;
    }

    public void setLastBillAmount(Double lastBillAmount) {
        this.lastBillAmount = lastBillAmount;
    }

    public Long getLastBillDueDate() {
        return lastBillDueDate;
    }

    public void setLastBillDueDate(Long lastBillDueDate) {
        this.lastBillDueDate = lastBillDueDate;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

}
