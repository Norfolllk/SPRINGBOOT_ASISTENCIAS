package com.krakedev.asistencias.servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.Asistencia;
import com.krakedev.asistencias.Estudiante;
import com.krakedev.asistencias.RegistroAsistencia;

@Service
public class ServicioAsistencia {

	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();
	private final ServicioEstudiantes servicioEstudiantes;

	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}

	public RegistroAsistencia registrarAsistencia(String cedula) {
		System.out.print("Ingresa metodo registrarAsistencia de serviciosAsistencia");
		Estudiante encontrado = servicioEstudiantes.buscarPorCedula(cedula);

		if (encontrado == null) {
			System.out.print("Estudiante no existe");
			return null;
		}

		Asistencia asistencia = new Asistencia(
				LocalDate.now(),
				LocalDateTime.now(),
				"p"
		);

		RegistroAsistencia registroAsistencia = new RegistroAsistencia(encontrado, asistencia);
		registros.add(registroAsistencia);
		System.out.print("Registro creado con exito");
		return registroAsistencia;
	}

	public ArrayList<Asistencia> consultarAsistencia(String cedula) {
		ArrayList<Asistencia> asistencias = new ArrayList<>();

		for (RegistroAsistencia registro : registros) {
			if (registro.getEstudiante().getCedula().equals(cedula)) {
				asistencias.add(registro.getAsistencia());
			}
		}
		return asistencias;
	}
}