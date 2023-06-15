
package Entidades;

/**
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 */
public class Lavadora extends Electrodomesticos {
    
    protected int carga;

    public Lavadora() {
    }


    public Lavadora(int carga, double precio, String color, char consumoEnergetico,double peso) {
        super(precio, color, consumoEnergetico,peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

 
    
    
}
