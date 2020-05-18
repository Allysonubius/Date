package com.example.Date.Calendar;
import java.util.Calendar;
/**Algumas conversões de data*/
public class Exemplo2 {
    public static void main(String[]args){
        Calendar agora = Calendar.getInstance ();
        System.out.printf ("%tC\n",agora);//data
        //20
        System.out.printf ("%tF\n",agora);//ano-mes-data
        //2020-05-18
        System.out.printf ("%tD\n",agora);//data-mes-ano
        //05/18/20
        System.out.printf ("%tR\n",agora);//hora-minutos
        //13:20
        System.out.printf ("%tT\n",agora);//hora-minutos-segundos
        //13:20:18
    }
}
