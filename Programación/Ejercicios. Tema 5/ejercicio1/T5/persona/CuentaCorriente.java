package ejercicio1.T5.persona;
//Ejercicio 7

public class CuentaCorriente {
    //PROPIEDADES
    public int numero;
    public double saldo;
    //METODOS CONSTRUCTORES
    public CuentaCorriente (int numero, double saldo) {
        this.numero=numero;
        this.saldo=saldo;
    }
    public CuentaCorriente (int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }
    public CuentaCorriente (){
        this.numero = (int)(Math.random() * 1001);
        this.saldo = 0.0;
    }
    public void añadirDinero(int cantidad){
        this.saldo += cantidad;
    }
    public void retirarDinero(int cantidad){
        if (cantidad < this.saldo) {
            this.saldo -= cantidad;
        }
    }
}
