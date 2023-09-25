package org.cibertec.edu.pe.interfaceService;

import java.util.List;

import org.cibertec.edu.pe.modelo.Empleado;

public interface IEmpleadoService {
	public List<Empleado> Listado();
	void guardar(Empleado empleado); }
