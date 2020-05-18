package com.example.Date.LocalDate;

import java.time.LocalDate;

/**Exemplo de como manipular Local Date*/
public class Exemplo2 {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(hoje);
        //2020-05-18
        System.out.println(ontem);
        //2020-05-17
    }
}
