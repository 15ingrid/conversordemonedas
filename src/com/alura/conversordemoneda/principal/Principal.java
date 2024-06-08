package com.alura.conversordemoneda.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int option  = 0 ;
        String menu  = """
             **************************************
             Bienvenido al conversor de monedas\n
             1.) Dólar =>> Peso argentino
             2.) Peso argentino = >> Dólar
             3.) Dólar = >> Real brasileño
             4.) Real brasileño = >> dólar
             5.) Dólar = >> Peso colombiano
             6.) Peso colombiano = >> Dólar
             7.) Salir

             **************************************
            """ ;

        while (option != 7) {
            System . out . println(menu);
            System . out . println ( "Elija una opción" );
            option = sc.nextInt();

         switch (option){
                case 1 :
                case 2 :
                case 3 :
                case 4 :

                case 5 :
                case 6 :


            }

        }
    }

}
