package Clases;

public class Mascotas 
{
    private int Identificación;
    private String Nombre;
    private String Raza;
    private int Edad;
    private float Peso;
    private Medicamentos Medicamento;
    private Clientes Cliente;

    public Mascotas(int Identificación, String Nombre, String Raza, int Edad, float Peso, Medicamentos Medicamento, Clientes Cliente) {
        this.Identificación = Identificación;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Medicamento = Medicamento;
        this.Cliente = Cliente;
    }

    

    public int getIdentificación() {
        return Identificación;
    }

    public void setIdentificación(int Identificación) {
        this.Identificación = Identificación;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public Medicamentos getMedicamento() {
        return Medicamento;
    }

    public Clientes getCliente() {
        return Cliente;
    }

    

    @Override
    public String toString() {
        return "Mascotas{" + "Identificaci\u00f3n=" + Identificación + ", Nombre=" + Nombre + ", Raza=" + Raza + ", Edad=" + Edad + ", Peso=" + Peso + ", Medicamento=" + Medicamento + ", Cliente=" + Cliente + '}';
    }
    
    

}
