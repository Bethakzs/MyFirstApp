package com.example.tryapp;

public class Calc2 {

    Data dt = new Data();
    int[] bo = new int[6];
    int[] bo2 = new int[6];
    public String var;


    public String mathSec(int var2) {
        int num = bo[5];
        bo[5] = dt.getSecond() - var2;
        bo[5] += num;
        if (bo[5] < 0) {
            bo[5] += 60;
            bo[4] -= 1;
        }
        return String.valueOf(bo[5]);
    }

    public String mathMinute(int var2) {
        int num = bo[4];
        bo[4] = dt.getMinute() - var2;
        bo[4] += num;
        if (bo[4] < 0) {
            bo[4] += 60;
            bo[3] -= 1;
        }
        return String.valueOf(bo[4]);
    }

    public String mathHour(int var2) {
        int num = bo[3];
        bo[3] = dt.getHour() - var2;
        bo[3] += num;
        if (bo[3] < 0) {
            bo[3] += 24;
            bo[2] -= 1;
        }
        return String.valueOf(bo[3]);
    }

    public String mathDayy(int var2) {
        int num = bo[2];
        bo[2] = dt.getData() - var2;
        bo[2] += num;
        if (bo[2] < 0) {
            bo[2] += 30;
            bo[1] -= 1;
        }
        return String.valueOf(bo[2]);
    }

    public String mathMonth(int var2) {
        int num = bo[1];

        bo[1] = dt.getMonth() - var2;
        bo[1] += num;
        if (bo[1] < 0) {
            bo[1] += 12;
            bo[0] -= 1;
        }
        //bo[1] -= 1;  //wtf
        return String.valueOf(bo[1]);
    }

    public String mathYear(int var2) {
        int num = bo[0];
        bo[0] = dt.getYear() - var2;
        bo[0] += num;
        //bo[1]-=1;   //wtf
        return String.valueOf(bo[0]);
    }


    public String math2Sec() {
        int num = bo2[5];
        bo2[5] = dt.getSecond() - dt.getFSecond();
        bo2[5] += num;
        if (bo2[5]<0){
            bo2[5] += 60;
            bo2[4] -= 1;
        }
        return String.valueOf(bo2[5]);
    }
    public String math2Minute() {
        int num = bo2[4];
        bo2[4] = dt.getMinute() - dt.getFMinute();
        bo2[4] += num;
        if (bo2[4]<0){
            bo2[4] += 60;
            bo2[3] -= 1;
        }
        return String.valueOf(bo2[4]);
    }
    public String math2Hour() {
        int num = bo2[3];
        bo2[3] = dt.getHour() - dt.getFHour();
        bo2[3] += num;
        if (bo2[3]<0){
            bo2[3] += 24;
            bo2[2] -= 1;
        }
        return String.valueOf(bo2[3]);
    }

    public String math2Dayy() {
        int num = bo2[2];
        bo2[2] = dt.getData() - dt.getFData();
        bo2[2] += num;
        if (bo2[2]<0){
            bo2[2] += 30;
            bo2[1] -= 1;
        }
        return String.valueOf(bo2[2]);
    }
    public String math2Month() {
        int num = bo2[1];
        bo2[1] = dt.getMonth() - dt.getFMonth();
        bo2[1] += num;
        if (bo2[1]<0){
            bo2[1] += 12;
            bo2[0] -= 1;
        }
        return String.valueOf(bo2[1]);
    }
    public String math2Year() {
        int num = bo2[0];
        bo2[0] = dt.getYear() - dt.getFYear();
        bo2[0] += num;
        return String.valueOf(bo2[0]);
    }
}