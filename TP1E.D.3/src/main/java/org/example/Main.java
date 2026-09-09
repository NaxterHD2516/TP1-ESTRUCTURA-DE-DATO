package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n=0,cont=0;
        System.out.println("Ingrese la cantidad de productos que desea cargar");
        n= entrada.nextInt();

        float Cant[]= new float[n];
        float Precio[]= new float[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad del producto");
            Cant[i]= entrada.nextInt();
            System.out.println("Ingrese el precio unitario del producto");
            Precio[i]= entrada.nextFloat();

        }
        for (int i = 0; i < n; i++) {
            if ((Cant[i]*Precio[i])>1000){
                cont=cont+1;

            }
        }
        System.out.println("La cantidad de productos que superan los 1000 pesos es de "+cont);




    }
}