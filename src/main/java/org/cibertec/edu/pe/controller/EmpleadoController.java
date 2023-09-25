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
	
	// Agregar empleado - Mostrar el formulario
    @GetMapping("/nuevo")
    public String mostrarFormulario(Empleado empleado) {
        return "nuevo"; // Debes tener una vista llamada "nuevo.html" para mostrar el formulario
    }

    // Guardar nuevo empleado
    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute Empleado empleado) {
        servicio.guardar(empleado); // Llama al método de servicio para guardar el empleado
        return "redirect:/listar"; // Redirige a la lista de empleados después de guardar
    }

}
