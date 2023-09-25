package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.interfaces.IEmpleado;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServices implements IEmpleadoService {

	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> Listado() {
		return data.findAll();
	}

	@Override
	public void guardar(Empleado empleado) {
        data.save(empleado); 
		
	}
	
}
