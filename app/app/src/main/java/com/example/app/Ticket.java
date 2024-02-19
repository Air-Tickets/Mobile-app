package com.example.app;

public class Ticket {
    String start;
    String stop;
    String date;
    String boatman;


    public Ticket(String start, String stop, String date, String boatman) {
        this.start = start;
        this.stop = stop;
        this.date = date;
        this.boatman = boatman;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBoatman() {
        return boatman;
    }

    public void setBoatman(String boatman) {
        this.boatman = boatman;
    }
}
