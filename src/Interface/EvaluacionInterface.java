package Interface;

import Clases.Clientes;
import Clases.Mascotas;
import Clases.Medicamentos;

public interface EvaluacionInterface 
{
    void añadirMascota(Mascotas mascotas);
    void consultarMascota(int cedula);
    void imprimirVector();
}
