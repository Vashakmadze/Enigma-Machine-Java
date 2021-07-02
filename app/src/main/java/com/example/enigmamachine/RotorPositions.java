package com.example.enigmamachine;

public class RotorPositions {
    private String name;
    private int value;

    public RotorPositions(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public  int getValue() {
        return value;
    }

    public  void setValue(int value) {
        this.value = value;
    }


}
