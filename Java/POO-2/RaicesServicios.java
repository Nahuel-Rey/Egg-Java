
package main.servicios;

import main.entidades.Raices;


public class RaicesServicios {
    private Raices raices = new Raices();
    
     public double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - (4*raices.getA()*raices.getC());
    }
    
    public boolean tieneRaices(Raices raices) {
           // System.out.println("Tiene dos soluciones");
            return getDiscriminante(raices) > 0;  
    }
    
     public boolean tieneRaiz(Raices raices) {
            //System.out.println("Tiene una solucion");
            return getDiscriminante(raices) == 0;  
    }
    
     public void obtenerRaices(Raices raices) {
         boolean raiz = tieneRaices(raices);
          double x1,x2;
         if ( raiz = true) {
             x1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
             x2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2*raices.getA());
             System.out.println("Las dos raices son: x1 =  " + x1 + " y x2 = " + x2 );
         }
     }
       public void obtenerRaiz(Raices raices) {
           boolean raiz = tieneRaiz(raices);
           double x1;
           if ( raiz = true) {
               x1 = -raices.getB() / (2*raices.getA());
               System.out.println("La raiz es = " + x1);
           }
       }
       
       public void calcular(Raices raices) {
           if (tieneRaices(raices)) {
               obtenerRaices(raices);
           } else if (tieneRaiz(raices)) {
               obtenerRaiz(raices);
           } else {
               System.out.println("No tiene solucion");
           }
       }
    
     
}
