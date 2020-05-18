package com.example.Date.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**Exemplo de formatação de data com Simple Data Format*/
public class Exemplo2 {
    public static void main(String[]args){
        Date agora = new Date ();
        SimpleDateFormat formatter =new SimpleDateFormat ("dd/m/yyyy");
        String dataFormatada = formatter.format (agora);
        System.out.println (dataFormatada);
        //18/46/2020
    }
}
