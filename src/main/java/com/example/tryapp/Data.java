package com.example.tryapp;


import java.time.LocalDateTime;

public class Data {
    public int i;
    public int getData() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getDayOfMonth();
        return this.i;
    }

    public int getMonth() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getMonthValue();
        return this.i;
    }

    public int getYear() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getYear();
        return this.i;
    }
    public int getMinute() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getMinute();
        return this.i;
    }
    public int getHour() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getHour();
        return this.i;
    }
    public int getSecond() {
        LocalDateTime now = LocalDateTime.now();
        this.i = now.getSecond();
        return this.i;
    }
    public int getFData() {
        final int I = 24;
        return I;
    }

    public int getFMonth() {
        final int I = 10;
        return I;
    }

    public int getFYear() {
        final int I = 2022;
        return I;
    }

    public int getFMinute() {
        final int I = 34;
        return I;
    }

    public int getFHour() {
        final int I = 11;
        return I;
    }

    public int getFSecond() {
        final int I = 0;
        return I;
    }
}