package com.Mikkel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Personer steffen = new Personer("Steffen" , 22 );
        Svømmere steffenRekord = new Svømmere(steffen , 20 , 1);


        Personer louise = new Personer("Louise" , 27 );
        Svømmere louiseRekord = new Svømmere(louise , 18 , 4);

        Personer magnus = new Personer("Magnus" , 36 );
        Svømmere magnusRekord = new Svømmere(magnus , 12 , 1);

        ArrayList<Svømmere> timo = new ArrayList<>();
        Stævne holbækDM = new Stævne(timo  , "Holbæk Dm" );

        String[] aktivtiter = {"1" , "3" , "5"};

        System.out.println();holbækDM.tilføkaktivtet(magnusRekord ,aktivtiter );

        holbækDM.tilføjSvømmere(steffenRekord , louiseRekord , magnusRekord);

        System.out.println(holbækDM);




    }
}
