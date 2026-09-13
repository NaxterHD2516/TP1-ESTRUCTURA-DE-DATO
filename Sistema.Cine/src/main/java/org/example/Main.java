package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        boolean[][] asientos = new boolean[10][10];
        String[][] nombres =  new  String[10][10];
        String[][] telefonos =  new  String[10][10];
        int opcion;


        do{
            System.out.println("\n====== Sistema de Reserva de Cine =====");
            System.out.println("1. Mostrar Sala");
            System.out.println("2. Reservar Asiento");
            System.out.println("3. Eliminar Reserva");
            System.out.println("4. Salir");
            System.out.println("Seleccione una Opcion");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("===== MAPA DE LA SALA =====");
                    //Muestra el mapa del cine
                    for (int i  =  0; i < 10; i++){
                        System.out.println("Fila "+(i + 1)+ ": ");
                        for (int j = 0; j < 10; j++){
                            if (asientos[i][j]){
                                System.out.println("[X] ");
                            }else {
                                System.out.println("[O]");
                            }

                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    //Carga la fila y asiento que desea el usuario
                    System.out.println("Ingrese la fila (1-10): ");
                    int fila = entrada.nextInt();
                    System.out.println("Ingrese el asiento (1-10): ");
                    int asiento = entrada.nextInt();

                    //hacer esto  para que java interprete la fila y asiento que el usuario escribio
                    fila--;
                    asiento--;

                    //Muestra si el asiento ya esta reservado
                    if (asientos[fila][asiento]){
                        System.out.println("El asiento ya esta reservado.");
                        System.out.println("Reserva a nombre de: "+ nombres[fila][asiento]);
                        System.out.println("Telefono: "+ telefonos[fila][asiento]);

                    //Carga de datos para reservar el asiento
                    }else {
                        System.out.print("Ingrese el nombre del cliente: ");
                        entrada.nextLine();
                        String nombre = entrada.nextLine();

                        System.out.print("Ingrese el telefono: ");
                        String telefono = entrada.nextLine();

                        asientos[fila][asiento] =  true;
                        nombres[fila][asiento] =  nombre;
                        telefonos[fila][asiento] = telefono;


                    }

                    break;
                case 3:
                    System.out.println("===== ELIMINAR RESERVA =====");

                    System.out.print("Ingrese la fila (1-10): ");
                    int filaEliminar = entrada.nextInt();

                    System.out.print("Ingrese el asiento (1-10): ");
                    int asientoEliminar = entrada.nextInt();

                    // Pasamos de las posiciones que utiliza el usuario
                    // a las posiciones que utiliza Java
                    filaEliminar--;
                    asientoEliminar--;

                    // Verifica que los asientos y fila sean validos
                    if (filaEliminar < 0 || filaEliminar >= 10 || asientoEliminar < 0 || asientoEliminar >= 10) {

                        System.out.println("Fila o asiento invalido.");

                        // esta  parte verifica si el asiento está disponible
                    } else if (!asientos[filaEliminar][asientoEliminar]) {

                        System.out.println("Ese asiento no tiene ninguna reserva.");

                        // Si llegó acá, significa que el asiento está reservado
                    } else {

                        System.out.println(
                                "Reserva encontrada a nombre de: " + nombres[filaEliminar][asientoEliminar]
                        );

                        // Liberar el asiento
                        asientos[filaEliminar][asientoEliminar] = false;

                        // Elimina los datos del cliente
                        nombres[filaEliminar][asientoEliminar] = null;
                        telefonos[filaEliminar][asientoEliminar] = null;

                        System.out.println("Reserva eliminada correctamente.");
                    }
                    break;
                case 4:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (opcion != 4);

        entrada.close();


    }
}
