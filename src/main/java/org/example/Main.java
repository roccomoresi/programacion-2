package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 8;
        int mayor = a;

        if(a >= b && a >= c){
            mayor = a;
        }

        if(b >= c && b >= a){
            mayor = b;
        }

        if(c >= b && c >= a){
            mayor = c;
        }
        System.out.println("El mayor es ---> " + mayor);



    }
}