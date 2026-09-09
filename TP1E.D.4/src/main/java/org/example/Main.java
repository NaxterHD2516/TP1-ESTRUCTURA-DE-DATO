import java.util.Scanner;
public class Main{
    public static void main  (String[] args){
        Scanner entrada =  new Scanner(System.in);
        String [] Nom = new String[30];
        String [] Pat = new String[30];
        String [] Hora = new String[30];
        int [] Carga = new int[30];
        int i,cont=0;

        for (i=0; i<30;i++){
            System.out.println("Ingrese el Nombre y Apellido separado");
            Nom[i] = entrada.nextLine();
            System.out.println("Ingrese La patente del vehiculo");
            Pat[i] = entrada.nextLine();
            System.out.println("Ingrese 1 si lleva Te, 2 si lleva Madera o 3 si lleva Yerba");
            Carga[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la  hora que egreso");
            Hora[i] = entrada.nextLine();
        }
        for (i=0;i<30;i++){
            if (Carga[i]==1){
                cont=cont+1;
            }
        }
        for (i=0;i<30;i++){
            System.out.println("El chofer "+Nom[i]+" con la patente "+Pat[i]+" con la carga "+Carga[i]+" Egreso a la hora "+Hora[i]);
        }
        System.out.println("La cantidad de camiones con TE es de "+cont);
    }
}