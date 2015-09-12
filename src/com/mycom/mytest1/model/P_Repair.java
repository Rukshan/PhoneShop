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
public class P_Repair {
    
    private Date received_date;
    private Date handover_date;
    private int repair_id;
    private String owner_name;
    private double price;
    private String status;
    private String comments;

    /**
     * @return the received_date
     */
    public Date getReceived_date() {
        return received_date;
    }

    /**
     * @param received_date the received_date to set
     */
    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }

    /**
     * @return the handover_date
     */
    public Date getHandover_date() {
        return handover_date;
    }

    /**
     * @param handover_date the handover_date to set
     */
    public void setHandover_date(Date handover_date) {
        this.handover_date = handover_date;
    }

    /**
     * @return the repair_id
     */
    public int getRepair_id() {
        return repair_id;
    }

    /**
     * @param repair_id the repair_id to set
     */
    public void setRepair_id(int repair_id) {
        this.repair_id = repair_id;
    }

    /**
     * @return the owner_name
     */
    public String getOwner_name() {
        return owner_name;
    }

    /**
     * @param owner_name the owner_name to set
     */
    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
