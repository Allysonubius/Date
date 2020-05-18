package com.example.Date.Calendar;
import java.util.Calendar;
/**Exemplo de utilizando da classe Calendar*/
public class Exemplo1 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance ();
        System.out.println ("A data corrente é:"+ agora.getTime());
        //A data corrente é :Mon May 18 13:11:45 BRT 2020
        agora.add(Calendar.DATE,-15);
        System.out.println ("15 dias atrás:"+ agora.getTime ());
        //15 dias atrás é :Sun May 03 13:11:45 BRT 2020
        agora.add(Calendar.MONTH,4);
        System.out.println ("4 meses depois:"+ agora.getTime ());
        //4 meses depois é :Thu Sep 03 13:11:45 BRT 2020
        agora.add(Calendar.YEAR,2);
        System.out.println ("2 anos depois: "+ agora.getTime ());
        //2 anos depois é :Sat Sep 03 13:11:45 BRT 2022
    }
}
