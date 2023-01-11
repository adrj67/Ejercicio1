
package com.mycompany.ejercicio1;

public class Main {
    public static void main(String[] args){
            
        Coche miCoche= new Coche();
        miCoche.SumaPuertas();
        miCoche.SumaPuertas();
        System.out.println(miCoche.puertas);
     
       // Inicio Suma 3 numeros
        int resultado;
        resultado = Suma3(10,20,50);
        System.out.println(resultado);
        //Fin suma 3 numeros

    }    


// clase Coche
class Coche {

    public static int puertas = 0;
    
    public void SumaPuertas(){
        this.puertas++;
    }
}

public static int Suma3 (int a, int b, int c){
        
    return a+b+c;
    }
}