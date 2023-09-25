package org.cibertec.edu.pe.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
    // Campos
	@Id
	@Column(name="IdEmpleado")
	private String idEmpleado;

	@Column(name="Apellidos", nullable=false)  
	private String apellidos;

	@Column(name="Nombres", nullable=false)
	private String nombres;

	@Column(name="Edad")
	private Integer edad;

	@Column(name="Sexo", nullable=false)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(name="Salario", precision=10, scale=2)
	private BigDecimal salario;
    
	enum Sexo {
		M, F
		}

	// Constructores
	public Empleado() {
		}

	public Empleado(String idEmpleado, String apellidos, String nombres, Integer edad, Sexo sexo, BigDecimal salario) {
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	// Propiedades Lectura y Escritura

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	  
}
