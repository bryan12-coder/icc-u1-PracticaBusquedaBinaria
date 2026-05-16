import java.util.Scanner;

import controllers.BusquedaBinaria;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Ingrese el numero total del listado:");
        int b=teclado.nextInt();

        Persona[] personas=new Persona[b];
        String nombre;

        for(int i =0; i<b;i++){
            System.out.println("Ingrese Personas");
            teclado.nextLine();
            System.out.println("Nombre:");
            nombre=teclado.nextLine();
            int edad;
            

            do {
                System.out.println("Edad");
                edad=teclado.nextInt();

                if(edad<0){
                    System.out.println("La edad ingresada es incorecta vuelva a ingresar");
                    teclado.nextLine();
                }else{
                    System.out.println("La edad es correcta");
                }
                break;
                
            } while (edad<0);

            personas[i] = new Persona(nombre,edad);



        }
        
        System.out.println("Valor de la persona de la edad:");

        int edadBuscar=teclado.nextInt();
        

        BusquedaBinaria binaria=new BusquedaBinaria();
        int edadBuscar1=edadBuscar;
        
        int indexResult=binaria.BusquedaBinariaEdad(personas, edadBuscar1);
        if(indexResult>=0){
            System.out.print("\n" + "Se encontró la edad");
            System.out.print( personas[indexResult]);
        }else{
            System.out.println("\n" + "No se encontro ninguna variable");


        }


        
        




    }
}
