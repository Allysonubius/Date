package com.example.Date.Date;

import java.util.Date;

/*
* Exemplo de utilização dos metodos after e before
* */

public class Exemplo3 {
    public static void main(String[] args){
        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613127087681L);
        /**Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after (dataNoFuturo);
        System.out.println (isAfter);
        //False
        /**Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before (dataNoFuturo);
        System.out.println (isBefore);
        //True
    }
}
