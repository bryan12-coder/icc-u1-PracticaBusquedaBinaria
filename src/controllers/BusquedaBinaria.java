package controllers;

import models.Persona;

public class BusquedaBinaria {
   


    public Persona BusquedaBinariaEdadStock(Persona[] personas, int clave){
        MetodoBurbujaAvanzado(personas);
        int bajo=0;
        int alto=personas.length-1;
        
        while(bajo<=alto){
            int centro=(bajo+alto)/2;
            if(centro==clave){
             return personas[centro];
            }
            if( centro>clave){
                alto=centro-1;

            }else{
                bajo=centro+1;
            }
        }

        return null;

    }
    



    public int BusquedaBinariaEdad(Persona[] personas, int clave){


        MetodoBurbujaAvanzado(personas);
        int bajo=0;
        int alto=personas.length-1;
        
        while(bajo<=alto){
           
            int centro=(bajo+alto)/2;
            for(int i=bajo;i<=alto;i++){
                System.out.print( personas[i].getEdad()+ " ");
                if(i<alto) {  
                    System.out.print("|");
                    
                }
                
            }
            System.out.println();
            System.out.print("\t Bajo="+ bajo + "\t alto=" + alto + "\t centro=" + centro + "\t Valor del centro"+ personas[centro].getEdad());

            if(personas[centro].getEdad()==clave){
                System.out.println(" ---->   Encontrado");
                return centro;
            }

            if( personas[centro].getEdad()>clave){
                System.out.print("<------- Izquierda");
                alto=centro-1;
                

            }else{
                System.out.print("-------> Derecha");
                bajo=centro+1;
                
            
            }
            System.out.println();
        }

        return -1;

    }
    





    private void MetodoBurbujaAvanzado(Persona[] personas){
        int n=personas.length;
        boolean swap;
        for(int i=0 ; i<n;i++){
            swap=false;
            for(int j =0 ;  j<n-1-i;j++){
                if(personas[j].getEdad() > personas[j+1].getEdad()){
                    Persona aux=personas[j];
                    personas[j]=personas[j+1];
                    personas[j+1]=aux;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }

    }
    
}



