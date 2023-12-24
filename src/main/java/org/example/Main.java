package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// behaviour is tightly coupled to the class and to the data and value.

        TellDntAsk tellDntAsk = new TellDntAsk(2,4,"Trigger X", false);

        tellDntAsk.setValue(345);

    }



}