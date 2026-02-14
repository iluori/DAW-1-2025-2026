package ejercicio1.T5.persona;

public class DNI {
    //PROPIEDADES
    public int numero;
    public char letra;
    public String dni;
    //METODOS CONSTRUCTORES
    public DNI (int numero, char letra) {
        this.numero=numero;
        this.letra=letra;
    }
    public DNI (String dni) {
        this.dni=dni;
    }
}
