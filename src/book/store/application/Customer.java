/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.store.application;


public class Customer {
    private String username;
    private String password;
    private String status;
    private double points;
    
    public Customer(){
        this.username = "";
        this.password = "";
        this.points = 0;
        this.status = "Silver";
    }

    public void setStatus() {
        if(points >= 1000){
            status = "Gold";
        }else if(points < 1000){
            status = "Silver";
        }
    }

    public String getStatus() {
        return status;
    }

    public Customer(String username, String password, double points) {
        this.username = username;
        this.password = password;
        this.points = points;
        this.status = "Silver";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getPoints() {
        return points;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPoints(double points) {
        this.points = points;
    }
    
    
}

