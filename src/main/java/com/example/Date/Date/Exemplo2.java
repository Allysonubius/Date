package com.example.Date.Date;

import java.util.Date;

/*
* Exemplo de utilização do construtor com passagem de parametro em millisegundos;
* */

public class Exemplo2 {
    public static void main(String[] args){
        long currentTimeMillis = System.currentTimeMillis ();
        System.out.println (currentTimeMillis);
        //1589813197313
        Date novaData = new Date(currentTimeMillis);
        System.out.println (novaData);
        //Mon May 18 11:46:37 BRT 2020
    }
}
