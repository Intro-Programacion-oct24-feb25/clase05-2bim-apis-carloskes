/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoTrabajo;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        nombreEmpresa = DatoTrabajo.obtenerempresa();
        direccionEmpresa = DatoTrabajo.obtenerdireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Empresa: %s - Direccion: %s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                nombreEmpresa,
                direccionEmpresa,
                promedio);
    }
    
}
