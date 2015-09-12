/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycom.mytest1.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kaushika
 */
public class DB {
    
    
    static Connection conn=null;
     String userName="root";
    public static Connection getCon() throws Exception{      
        if(conn==null){
        
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/phone_house";
            String username="root";
            String password="123";
            conn=DriverManager.getConnection(url,username,password);
        }
        
        return conn;
    
    }
}
