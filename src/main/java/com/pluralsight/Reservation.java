package com.pluralsight;

public class Reservation {

    private String roomType;
    private int roomPrice;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int roomPrice, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;


    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getnumberOfNights() {
        return numberOfNights;
    }

    public void setnumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double basePrice;
        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124;
        } else {
            return 0;
        }

        if (isWeekend){
            return basePrice * 1.10;
        }
        else{
            return basePrice;
        }
        //    public double getPrice(){
//        //room type (King, $139.00) (Double, $124.00) (Weekend 10% increase)
//
//        double basePrice;
//        if (roomType.equalsIgnoreCase("king")) {
//            basePrice = 139;
//        } else if (roomType.equalsIgnoreCase("double")) {
//            basePrice = 124;
//        } else {
//            throw new IllegalArgumentException("Invalid room type");
//            //throw exception
//        }
//        return basePrice;
}

    public double getReservationTotal(){
        return getPrice() * numberOfNights;
    }

    @Override
    public String toString(){
        return "Reservation{" +
                "roomType=" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + getPrice() +
                ", getReservationTotal()=" + getReservationTotal() +
                '}';
    }

    }
