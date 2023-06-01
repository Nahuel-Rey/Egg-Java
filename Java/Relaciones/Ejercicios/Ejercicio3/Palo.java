
package Enum;


public enum Palo {
    BASTOS("bastos"),ORO("oro"), ESPADAS("espada"),COPA("copa");
    
    private String nombre;

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
