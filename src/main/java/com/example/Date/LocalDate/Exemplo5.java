package com.example.Date.LocalDate;

import java.time.LocalDateTime;

/**Exemplo de como manipular Local Date Time*/
public class Exemplo5 {
    public static void main(String[]args){
        LocalDateTime agora = LocalDateTime.now();
        System.out.println (agora);
        //2020-05-18T14:15:22.180259900
        LocalDateTime futuro = agora.plusHours (1).plusDays (2).plusSeconds (12);
        System.out.println (futuro);
        //2020-05-20T15:15:34.180259900
    }
}
