/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycom.mytest1.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kaushika
 */
public class Constants {
    
    public static final int INVOICE_TYPE_CASH = 1;
    public static final int INVOICE_TYPE_CHEQUE = 2;
    public static final int INVOICE_TYPE_CREDIT = 3;
    
    public static final String PHONE_STATUS_SOLD = "Sold";
    public static final String PHONE_STATUS_RETURNED = "Return";
    public static final String PHONE_STATUS_INSTOCK = "In Stock";
    
    
    public static final String WARRANTY_TYPE_NO = "NO_WARRANTY";
    public static final String WARRANTY_TYPE_SIX_MONTHS = "SIX_MONTHS";
    public static final String WARRANTY_TYPE_ONE_YEAR = "ONE_YEAR";
    public static final String WARRANTY_TYPE_TWO_YEAR = "TWO_YEARS";
    
    public static final Map<String, String> WARRANTY_MAP = new HashMap<String, String>();
    
    static {
        WARRANTY_MAP.put(WARRANTY_TYPE_NO, "No Warranty");
        WARRANTY_MAP.put(WARRANTY_TYPE_SIX_MONTHS, "6 Months");
        WARRANTY_MAP.put(WARRANTY_TYPE_ONE_YEAR, "1 Year");
        WARRANTY_MAP.put(WARRANTY_TYPE_TWO_YEAR, "2 Years");
    }
    
}
