package com.krakedev.asistencias.servicios;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.krakedev.asistencias.*;

@Service
public class ServicioEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public void agregar(Estudiante estudiante) {
        Estudiante encontrado = buscarPorCedula(estudiante.getCedula());
        // si null no existe, permite agregar
        if (encontrado == null) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("Estudiante ya existe");
        }
    }

    public Estudiante buscarPorCedula(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }
    
    public void eliminar(String cedula) {
        Estudiante encontrado = buscarPorCedula(cedula);
        
        // si null, no existe, no elimina
        if (encontrado == null) {
            System.out.println("Estudiante no existe para eliminar");
            return;
        }
        
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCedula().equals(cedula)) {
                estudiantes.remove(i);
            }
        }
    }
    
    public void actualizar(String cedula, Estudiante nuevo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                // opcion 1
                // estudiante = nuevo;

                // opcion 2
                estudiante.setNombre(nuevo.getNombre());
                estudiante.setApellido(nuevo.getApellido());
            }
        }
    }

    public ArrayList<Estudiante> listar() {
        return estudiantes;
    }
}

