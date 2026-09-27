package com.krakedev.asistencias.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencias.*;
import com.krakedev.asistencias.servicios.ServicioEstudiantes;

@RestController
@RequestMapping("/{estudiantes}")
public class ControladorEstudiantes {

    private final ServicioEstudiantes servicioEstudiantes;

    public ControladorEstudiantes(ServicioEstudiantes servicioEstudiantes) {
        this.servicioEstudiantes = servicioEstudiantes;
    }

    @GetMapping
    public ArrayList<Estudiante> listar() {
        return servicioEstudiantes.listar();
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Estudiante> buscarPorCedula(@PathVariable String cedula) {
        Estudiante encontrado = servicioEstudiantes.buscarPorCedula(cedula);
        if (encontrado != null) {
            return ResponseEntity.ok(encontrado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void agregar(@RequestBody Estudiante estudiante) {
        servicioEstudiantes.agregar(estudiante);
    }

    @PutMapping("/{cedula}")
    public Estudiante actualizar(@PathVariable String cedula, @RequestBody Estudiante estudiante) {
        return servicioEstudiantes.actualizar(cedula, null);
    }

    @DeleteMapping("/{cedula}")
    public void eliminar(@PathVariable String cedula) {
        servicioEstudiantes.eliminar(cedula);
    }
}

