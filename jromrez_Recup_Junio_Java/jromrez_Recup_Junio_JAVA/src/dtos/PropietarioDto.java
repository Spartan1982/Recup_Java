package dtos;

import java.time.LocalDate;

public class PropietarioDto {

	
	long id;
	public PropietarioDto(long id, String dni, String fchCompra, String matricula, boolean esHistorico) {
		super();
		this.id = id;
		this.dni = dni;
		this.fchCompra = fchCompra;
		this.matricula = matricula;
		this.esHistorico = esHistorico;
	}
	String dni="aaaaaaaaaaa";
	String fchCompra="dd-Mm-yyyy";
	String matricula="aaaaaaaa";
	boolean esHistorico=false;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFchCompra() {
		return fchCompra;
	}
	public void setFchCompra(String fchCompra) {
		this.fchCompra = fchCompra;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEsHistorico() {
		return esHistorico;
	}
	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	

}
