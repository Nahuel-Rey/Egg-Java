
package main.Entidades;


public class Sala {
    private Asientos[][] asiento;

    public Sala() {
        this.asiento=new Asientos[8][6];
         for (int i = 0; i < asiento.length; i++) {
            for (int j = 0; j < asiento[0].length; j++) {
                String letraAsiento = " ";
                switch (j) {
                    case 0:
                        letraAsiento = "A";
                        break;
                    case 1:
                        letraAsiento = "B";
                        break;
                    case 2:
                        letraAsiento = "C";
                        break;
                    case 3:
                        letraAsiento = "D";
                        break;
                    case 4:
                        letraAsiento = "E";
                        break;
                    case 5:
                        letraAsiento = "F";
                        break;
                }
                Asientos lugar = new Asientos();
                lugar.setNombre(" " + (8 - i) + " " + letraAsiento + " ");
                lugar.setOcupado(false);
                asiento[i][j] = lugar;
            }
        }
    }

    public Sala(Asientos[][] asiento) {
        this.asiento = asiento;
    }

    public Asientos[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asientos[][] asiento) {
        this.asiento = asiento;
    }
    
    
    }
    
    

