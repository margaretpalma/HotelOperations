package com.pluralsight;

public class Hotel {

     public int numberOfSuites;
     private int numberOfBasicRooms;
     private int bookedSuites;
     private int bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfBasicRoomsnt) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    public Hotel(int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfBasicRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
