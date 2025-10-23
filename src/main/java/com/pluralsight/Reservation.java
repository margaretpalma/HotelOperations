package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

                        //parameters used in main
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        //local variables to the constructor ^
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
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
            //todo: throw exception instead
        }

        if (isWeekend) {
            return basePrice * 1.10;
        } else {
            return basePrice;
        }
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", numberOfNights=" + numberOfNights +
                ", isWeekend=" + isWeekend +
                ", getPrice()=" + getPrice() +
                ", getReservationTotal()=" + getReservationTotal() +
                '}';
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;







    }

}