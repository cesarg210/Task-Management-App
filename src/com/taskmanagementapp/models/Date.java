package com.taskmanagementapp.models;

public class Date {
    int yy;
    int mm;
    int dd;

    public Date(int mm, int dd, int yy) {
        this.yy = yy;
        this.mm = mm;
        this.dd = dd;
    }
    public String getDate(){
        return this.mm + "-" + this.dd + "-" + this.yy;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    @Override
    public String toString() {
        return "Date{" +
                "yy=" + yy +
                ", mm=" + mm +
                ", dd=" + dd +
                '}';
    }
}
