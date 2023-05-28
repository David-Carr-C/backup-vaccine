package com.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * En Java los modelos son clases que representan exactamente a las tablas de la base de datos.
 * Por lo tanto PersonaModel representa a la tabla persona.
 *
 * Ocupamos la anotacion @Data de Lombok para no tener que escribir los getters y setters.
 * y @AllArgsConstructor para no tener que escribir el constructor.
 *
 * Lomnok es una libreria que realiza el codigo por nosotros.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonasModel {
    private Integer id;
    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private int edad;
    private String calle;
    private String numeroCasa;
    private String coloniaLocalidad;
    private String municipioAlcaldia;
    private String codigoPostal;
    private String entidadFederativa;
    private String lugarNacimiento;
}