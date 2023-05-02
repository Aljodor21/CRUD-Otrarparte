package Principal;

import Clases.ClaseMetodos;
import Clases.Clientes;
import Clases.Mascotas;
import Clases.Medicamentos;
import Interface.EvaluacionInterface;
import javax.swing.JOptionPane;

public class EvaluacionPOO 
{

    EvaluacionInterface claseMetodos = new ClaseMetodos();

    public static void main(String[] args) {
        EvaluacionPOO principal = new EvaluacionPOO();
        principal.menu();
    }

    public void menu() {
        int opc = 0;
        do 
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                    + "1.Añadir mascota \n"
                    + "2.Imprimir registros\n"
                    + "3.Consultar x Cedula\n"
                    + "4.Salir", "PETS S.A.", JOptionPane.INFORMATION_MESSAGE));

            switch (opc) {
                case 1:
                    Mascotas mascotas = new Mascotas(
                            Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                    + "Ingrese la identificación de la mascota")),
                            JOptionPane.showInputDialog(null, ""
                                    + "Ingrese el nombre de la mascota"),
                            JOptionPane.showInputDialog(null, ""
                                    + "Ingrese la raza de la mascota"),
                            Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                    + "Ingrese la edad de la mascota")),
                            Float.parseFloat(JOptionPane.showInputDialog(null, ""
                                    + "Ingrese el peso de la mascota")),
                            new Medicamentos(JOptionPane.showInputDialog(null, ""
                                    + "Ingrese el nombre del medicamento"), JOptionPane.showInputDialog(null, ""
                                            + "Ingrese la descripción del medicamento"), Float.parseFloat(JOptionPane.showInputDialog(null, ""
                                            + "Ingrese la dosis del medicamento"))),
                            new Clientes(Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                    + "Ingrese la cedula del propietario")), JOptionPane.showInputDialog(null, ""
                                            + "Ingrese el nombre del propietario "), JOptionPane.showInputDialog(null, ""
                                            + "Ingrese los apellidos del propietario"), JOptionPane.showInputDialog(null, ""
                                            + "Ingrese la dirección de residencia"), Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                            + "Ingrese el telefono del propietario"))));
                    claseMetodos.añadirMascota(mascotas);
                    JOptionPane.showMessageDialog(null,
                            "Mascota agregada satisfactoriamente");
                    break;
                case 2:
                    claseMetodos.imprimirVector();
                    break;
                case 3:
                    claseMetodos.consultarMascota(Integer.parseInt(JOptionPane.showInputDialog(null, ""
                            + "Ingrese la cedula del propietario")));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizarnos");
                    break;
            }
        } while (opc != 4);
    }

}
