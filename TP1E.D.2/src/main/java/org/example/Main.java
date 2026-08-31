package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int  n, i=0,apr=0,des=0;
        float Notas[];
        System.out.println("Ingrese la cantidad de notas");
        n = entrada.nextInt();

        Notas = new float[n];

        for (i=0;i<n;i++){
            System.out.println("Ingrese la nota "+(i+1)+":");
            Notas[i] = entrada.nextFloat();
        }

        for (i=0;i<n;i++){
            if (Notas[i]>=6){
                apr=apr+1;
            }
            else{
                des=des+1;
            }
        }

        System.out.println("La cantidad de alumnos aprobados es de "+apr);
        System.out.println("La cantidad de alumnos desaprobados es de "+des);




    }
}
