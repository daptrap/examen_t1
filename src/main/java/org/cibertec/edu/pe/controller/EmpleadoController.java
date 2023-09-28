package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService servicio;
	
	// Método listar
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Empleado> LEmpleado = servicio.Listado();
		m.addAttribute("listEmp", LEmpleado);
		return "index";
	}
	
    @GetMapping("/nuevo")
    public String mostrarFormulario(Empleado empleado) {
        return "nuevo"; 
    }

    // Guardar nuevo empleado
    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        servicio.guardar(empleado);
        return "redirect:/listar"; 
    }

}
