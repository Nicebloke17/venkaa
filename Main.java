package com.company;

class car {
    int year;
    String name;


    public car(int year, String name) {
       // this.name = name;
        //this.year = year;
    }
    void get(){
        System.out.println("name = " + name + "  year = " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        car c = new car(1890, "audi");
        // int year;
       // System.out.println(c.name + "   " +c.year);
c.get();

    }
}


