package com.vaccine.controller;

import com.vaccine.model.RegistroVacunaModel;
import com.vaccine.service.RegistroVacunaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Los controladores son aquellos metodos que reciben las peticiones del cliente y mandan a otra clase
 * a que procese todo.
 *
 * En este caso tendremos distintos endpoints como por ejemplo: /api/v1/consultarRegistroVacuna el cual entrara
 * en el metodo consultarRegistroVacuna y gracias al @ResquestParam agarrara el parametro que nos pase
 * el usuario por la url por ejemplo "/api/v1/consultarPersona?id=ABC123131" donde el parametro es id
 * y el valor es ABC123131.
 */


@RestController
@RequestMapping("/api/v1")
public class RegistroVacunaController { // TODO: CREA ESTOS OBJETOS

    /**
     * Para estas funciones, se hace uso de la clase RegistroVacunaService, la cual se encarga de procesar
     * la informacion que se le pasa y hacer las consultas a la base de datos. Nosotros por comodidad
     * solo llamamos a los metodos de la clase VacunaService y nos resuelve todo.
     *
     * Aqui no hay mucha logica de programacion, tan solo se relega la responsabilidad a otra clase, pero
     * es buena practica debido a que no tenemos todo de golpe en un solo archivo.
     */

    @GetMapping("/obtenerRegistroVacuna")
    public ResponseEntity<Object> consultarRegistroVacuna(@RequestParam("curp_personas") String curp) {
        RegistroVacunaService vacunaService = new RegistroVacunaService();
        return vacunaService.consultarRegistroVacuna(curp);
    }

    @PostMapping("/altaRegistroVacuna")
    public ResponseEntity<Object> altaRegistroVacuna(@RequestBody RegistroVacunaModel registroVacunaModel) {
        RegistroVacunaService vacunaService = new RegistroVacunaService();
        return vacunaService.altaRegistroVacuna(registroVacunaModel);
    }

    @PutMapping("/actualizarRegistroVacuna")
    public ResponseEntity<Object> actualizarRegistroVacuna(@RequestParam("folio") Integer id, @RequestBody RegistroVacunaModel registroVacunaModel) {
        RegistroVacunaService vacunaService = new RegistroVacunaService();
        return vacunaService.actualizarRegistroVacuna(id, registroVacunaModel);
    }

    @DeleteMapping("/bajaRegistroVacuna")
    public ResponseEntity<Object> bajaRegistroVacuna(@RequestParam("folio") Integer id) {
        RegistroVacunaService vacunaService = new RegistroVacunaService();
        return vacunaService.bajaRegistroVacuna(id);
    }
}
