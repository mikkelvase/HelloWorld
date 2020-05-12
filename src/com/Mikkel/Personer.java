package com.Mikkel;

public class Personer {

    private String name;
    private int alder;

    public Personer(String name, int alder) {
        this.name = name;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return
              "\n" +  "navn: '" + name + '\'' +
                  alder + " år ";
    }
}
