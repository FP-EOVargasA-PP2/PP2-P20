/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p20;

import java.util.Scanner;

/**
 *
 * @author osiri
 */
public class PP2P20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int a, b, c, d;
        //Proceso
        a = pedir ("primer");
        b = pedir ("segundo");
        c = calcular(a);
        d = calcular(b);
        mostrar (a,b,c,d);
    }
    public static int pedir (String a){
        int b;
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el "+a+" numero");
        b = teclado.nextInt();
        return b;
    }
    public static int calcular (int a){
        int b = 0;
        //Se suman todos los divisores
        for (int c = 1; c < a; c++){
            if (a % c == 0){
                b = b + c;
            }
        }
        return b;
    }
    public static void mostrar (int a,int b,int c,int d){
        //Se comparan los divisores de un numero con el otro
        if (a == d && b == c){
            System.out.println("Los numeros "+a+" y "+b+" son amigos");
        }else{
            System.out.println("Los numeros "+a+" y "+b+" no son amigos");
        }
    }
}
