/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycom.mytest1.model;

import java.util.Date;

/**
 *
 * @author kaushika
 */
public class Invoice {
    private int invoice_number;
    private Date invoice_date;
    private int invoice_id;
    private Category category;
    private String cus_details;
    private double total;

    /**
     * @return the invoice_number
     */
    public int getInvoice_number() {
        return invoice_number;
    }

    /**
     * @param invoice_number the invoice_number to set
     */
    public void setInvoice_number(int invoice_number) {
        this.invoice_number = invoice_number;
    }

    /**
     * @return the invoice_date
     */
    public Date getInvoice_date() {
        return invoice_date;
    }

    /**
     * @param invoice_date the invoice_date to set
     */
    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    /**
     * @return the invoice_id
     */
    public int getInvoice_id() {
        return invoice_id;
    }

    /**
     * @param invoice_id the invoice_id to set
     */
    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the cus_details
     */
    public String getCus_details() {
        return cus_details;
    }

    /**
     * @param cus_details the cus_details to set
     */
    public void setCus_details(String cus_details) {
        this.cus_details = cus_details;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
}
