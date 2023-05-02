package Clases;

public class Medicamentos 
{
    private String nombre;
    private String descripcion;
    private float dosis;

    public Medicamentos(String nombre, String descripcion, float dosis) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dosis = dosis;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public float getDosis() 
    {
        return dosis;
    }

    public void setDosis(float dosis) 
    {
        this.dosis = dosis;
    }

    @Override
    public String toString() 
    {
        return "Medicamentos{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", dosis=" + dosis + '}';
    }
    
    
}
