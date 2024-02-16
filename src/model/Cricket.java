package model;

public class Cricket extends Booking {

    private String cricketType;
    private Booking bookingDetails;

    public Cricket(Customer customer, String date, int duration, int amount) {
        super(customer, date, duration, amount);
    }


    public void bookCricket(){
        amount(8000);
    }


}
