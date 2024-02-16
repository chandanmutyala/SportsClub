package model;

import javax.xml.crypto.Data;
import java.util.Date;

public class Booking {

    private  Customer customer;

    

    private String date ;
    private int duration ;
    private int amount;

    public Booking(Customer customer, String date, int duration, int amount) {
        this.customer = customer;
        this.date = date;
        this.duration = duration;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "customer=" + customer +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", amount=" + amount +
                '}';
    }

    public int amount(int amount){
        return amount;
    }

    public int amount(int amount,String withKit){
        this.amount=amount+100;
        return amount*duration;
    }
    public int amount(int amount,String withKit,boolean memberShip){
        this.amount=amount-75;
        return this.amount*duration;
    }


    public String booked(){
        return "Booking Successful";
    }

    public String notBooked(){
        return "Booking UnSuccessful";
    }




}
