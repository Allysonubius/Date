package com.example.Date.Array;

public class Array {
    public static void main(String[]args){
        //Conceitos e declaração de arrays
        int[] meuArray = new int[7];
        int[] meuArray2 = {12,32,54,6,8,89,64};

        System.out.println (meuArray[1]);
        //0
        System.out.println (meuArray2[3]);
        //6

        //Alterando o valor de um elemento
        meuArray2[2] =10;
        //10
        System.out.println (meuArray2[2]);
        //Comprimento do array
        System.out.println (meuArray.length);
        //7
    }
}
