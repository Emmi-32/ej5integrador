
package ej5;

import java.util.Random;

public  class Castor {
    private Double cola;
    private Double velocidad;      // (hasta 8km/h. ingresar por teclado)

    public Castor(Double cola, Double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
      
    
    
    
    public void nadar(){
        
        System.out.println(" nada a una velocidad de " +velocidad+ " km/hs");

    }    
    public  void tocarGuitarra(){
    Random r= new Random(6);
    for(int i=0;i<3;i++){
        Random cuerda=r;
        System.out.println("toca cuerda "+cuerda);
        
    }
    }
    
}
