package com.example.Date.LocalDate;

import java.time.LocalTime;
/**Exemplo de como manipular Local Time*/
public class Exemplo4 {
    public static void main(String[]args){
    LocalTime agora = LocalTime.now();
    System.out.println (agora);
    //14:10:24.081428400
    LocalTime maisUmaHora = agora.plusHours (1);
    System.out.println (maisUmaHora);
    //15:10:24.081428400
    }
}
