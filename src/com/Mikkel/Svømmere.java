package com.Mikkel;
import java.time.LocalTime;
import java.util.Locale;

public class Svømmere {

    int tid;
    int placering;
    Personer p;

    public Svømmere(Personer p , int tid , int placering ) {

        this.p = p;
        this.tid = tid;
        this.placering = placering;
    }

    @Override
    public String toString() {
        return  p  +
                " tid:  " + tid +
                ", placering:  " + placering + "\n"
                ;
    }
}
