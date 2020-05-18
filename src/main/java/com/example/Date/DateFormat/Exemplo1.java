package com.example.Date.DateFormat;
import java.text.DateFormat;
import java.util.Date;
/**Exemplo de formatação de data com DateFormat*/
public class Exemplo1 {
    public static void main(String[] args){
        Date agora = new Date();
        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println (dateToStr);
        //18/05/2020 13:41
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println (dateToStr);
        //18 de maio de 2020 13:39
        dateToStr = DateFormat.getDateTimeInstance (DateFormat.LONG,DateFormat.LONG).format (agora);
        System.out.println (dateToStr);
        //18 de maio de 2020 13:39:43 BRT
    }
}
