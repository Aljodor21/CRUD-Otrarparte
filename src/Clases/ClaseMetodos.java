package Clases;

import javax.swing.JOptionPane;

public class ClaseMetodos implements Interface.EvaluacionInterface {

    private Mascotas[] conjuntoMascotas = new Mascotas[150];
    private int j = 0;

    @Override
    public void añadirMascota(Mascotas mascotas) 
    {
        conjuntoMascotas[j] = mascotas;
        j++;
    }

    @Override
    public void imprimirVector() 
    {

        if (conjuntoMascotas[0] == null) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una mascota");
        } else {
            for (int i = 0; i < conjuntoMascotas.length; i++) {
                if (conjuntoMascotas[i] != null) {
                    JOptionPane.showMessageDialog(null, ""
                            + "---------------------------------------\n"
                            + "|Nombre mascota:" + conjuntoMascotas[i].getNombre() + "\n"
                            + "|Raza: " + conjuntoMascotas[i].getRaza() + "\n"
                            + "|Edad: " + conjuntoMascotas[i].getEdad() + "\n"
                            + "|Peso: " + conjuntoMascotas[i].getPeso() + "\n"
                            + "|Medicamento: " + conjuntoMascotas[i].getMedicamento().getNombre() + "\n"
                            + "|Descripción: " + conjuntoMascotas[i].getMedicamento().getDescripcion() + "\n"
                            + "|Dosis: " + conjuntoMascotas[i].getMedicamento().getDosis() + "\n"
                            + "|Propietario: " + conjuntoMascotas[i].getCliente().getNombre() + " " + conjuntoMascotas[i].getCliente().getApellidos() + "\n"
                            + "|Cedula: " + conjuntoMascotas[i].getCliente().getCedula() + "\n"
                            + "|Dirección: " + conjuntoMascotas[i].getCliente().getDireccion() + "\n"
                            + "|Telefono: " + conjuntoMascotas[i].getCliente().getTelefono() + "\n"
                            + "---------------------------------------");
                }

            }
        }
    }

    @Override
    public void consultarMascota(int cedula) {
        int i;
        boolean sw = false;

        if (conjuntoMascotas[0] == null) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una mascota");
        } else {
            for (i = 0; i < conjuntoMascotas.length; i++) {
                if (conjuntoMascotas[i] != null) {
                    if (conjuntoMascotas[i].getCliente().getCedula() == cedula) {
                        JOptionPane.showMessageDialog(null, ""
                                + "---------------------------------------\n"
                                + "|Nombre mascota:" + conjuntoMascotas[i].getNombre() + "\n"
                                + "|Raza: " + conjuntoMascotas[i].getRaza() + "\n"
                                + "|Edad: " + conjuntoMascotas[i].getEdad() + "\n"
                                + "|Peso: " + conjuntoMascotas[i].getPeso() + "\n"
                                + "|Medicamento: " + conjuntoMascotas[i].getMedicamento().getNombre() + "\n"
                                + "|Descripción: " + conjuntoMascotas[i].getMedicamento().getDescripcion() + "\n"
                                + "|Dosis: " + conjuntoMascotas[i].getMedicamento().getDosis() + "\n"
                                + "|Propietario: " + conjuntoMascotas[i].getCliente().getNombre() + " " + conjuntoMascotas[i].getCliente().getApellidos() + "\n"
                                + "|Cedula: " + conjuntoMascotas[i].getCliente().getCedula() + "\n"
                                + "|Dirección: " + conjuntoMascotas[i].getCliente().getDireccion() + "\n"
                                + "|Telefono: " + conjuntoMascotas[i].getCliente().getTelefono() + "\n"
                                + "---------------------------------------");
                        sw = true;
                    }
                }
            }

            if (sw != true) {
                JOptionPane.showMessageDialog(null, "No existen coincidencias");
            }
        }

    }

}
