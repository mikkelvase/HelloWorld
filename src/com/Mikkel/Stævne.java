package com.Mikkel;

import java.util.ArrayList;

public class Stævne {

    private ArrayList stævne;
    private String navn;

    public Stævne (ArrayList stævne , String navn) {

        this.stævne = stævne;
        this.navn = navn;
    }

    public void tilføkaktivtet(Svømmere svøm , String[] aktivteter ) {




    }

    public void tilføjSvømmere(Svømmere svømmer1 , Svømmere svømmer2 , Svømmere svømmer3) {


        stævne.add(svømmer1);
        stævne.add(svømmer2);
        stævne.add(svømmer3);


    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return " Stævne navn " + navn + " \n Deltagere " + stævne;
    }
}
