
package ej5;

public class OrniVerde extends Castor implements Pata{
    public OrniVerde(double cola,double velocidad) {
        super(cola, velocidad);
    }

    @Override
    public void tocarOrgano(){
        Scanner leerTecla=new Scanner(System.in);
        System.out.println("Do-Re-Mi");
        System.out.println("oprima tecla");
        String tecla=leerTecla.nextLine();
        if(tecla!=null)
        System.out.println("Fa-Sol-La-Si");  
    }
    public void tocarGuitorgan(){
        super.tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac cuaac…!");
    }
}
