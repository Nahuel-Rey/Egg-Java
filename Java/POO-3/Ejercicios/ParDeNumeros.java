
package main.entidades;


public class ParDeNumeros {
    private int num1;
    private int num2;

    public ParDeNumeros() {
        num1 = (int) (Math.random()*10);
        num2 = (int) (Math.random()*10);
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    
    
    
}
