package com.example.Date.Date;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

import java.util.Date;
/**Exemplo de utilização dos metodos comparefp e equals*/
public class Exemplo4 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1513124807691L);  //Tuesday Dezember 12 22:26:47 BRST 2017
        Date dataNoFuturo = new Date(16131248607691L);  //Friday February 00:16:27 BRST 2021
        Date mesmaDataNoFuturo = new Date(16131248607691L);//Friday February 00:16:27 BRST 2021

    /**Comparando se as datas são iguais*/
    boolean isEquals = dataNoFuturo.equals (mesmaDataNoFuturo);
    System.out.println (isEquals);
    //true
    /**Comparando uma data com a outra*/
        int compareCase1 = dataNoPassado.compareTo (dataNoFuturo);
        // passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo (dataNoPassado);
        // futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo (mesmaDataNoFuturo);
        // Datas equivalentes

        System.out.println (compareCase1);
        // -1
        System.out.println (compareCase2);
        // 1
        System.out.println (compareCase3);
        // 0
    }
}
