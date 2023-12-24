package org.example;

public class TellDntAsk {

    private int value;
    private int limit;
    private boolean isTooHigh;
    private String name;

    public TellDntAsk(int value, int limit, String name, Boolean isTooHigh) {
        this.value = value;
        this.limit = limit;
        this.name = name;
        this.isTooHigh = isTooHigh;
    }

    public TellDntAsk() {
    }

    public int getValue() {
        return value;
    }

    /*
    * Data and behaviour are tightly coupled to the method
    * */
    public void setValue(int value) {
        if(value> this.limit) {
            throw new IllegalStateException("An alarm state has exceeded");
        }
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean isTooHigh() {
        return isTooHigh;
    }

    public void setTooHigh(boolean tooHigh) {
        isTooHigh = tooHigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}
