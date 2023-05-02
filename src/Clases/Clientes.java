package Clases;

public class Clientes 
{
    private int cedula;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;

    public Clientes(int cedula, String nombre, String apellidos, String direccion, int telefono) 
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCedula() 
    {
        return cedula;
    }

    public void setCedula(int cedula) 
    {
        this.cedula = cedula;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getApellidos() 
    {
        return apellidos;
    }

    public void setApellidos(String apellidos) 
    {
        this.apellidos = apellidos;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public int getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(int telefono) 
    {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
    
}
