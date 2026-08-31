package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  n, i=0;
        float Notas[], aux=0, prom=0;
        System.out.println("Ingrese la cantidad de notas");
        n = entrada.nextInt();

        Notas = new float[n];

        for (i=0;i<n;i++){
            System.out.println("Ingrese la nota"+(i+1)+":");
            Notas[i] = entrada.nextFloat();
            prom = prom + Notas[i];


        }
        for (i=1;i<n;i++){
            if (Notas[0]>Notas[i]){
                aux = Notas[0];
            }
            else {
                aux = Notas[i];
            }
        }

        System.out.println("La nota mas alta es "+aux+" y el promedio es "+(prom/5));

    }
}
