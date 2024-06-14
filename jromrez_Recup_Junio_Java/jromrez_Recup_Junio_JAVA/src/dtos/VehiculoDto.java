package dtos;

public class VehiculoDto {

	long id;
	public VehiculoDto(long id, String matricula, String fchMatriculacion) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.fchMatriculacion = fchMatriculacion;
	}
	String matricula="aaaaaaaaa";
	String fchMatriculacion="aaaaaa";
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getFchMatriculacion() {
		return fchMatriculacion;
	}
	public void setFchMatriculacion(String fchMatriculacion) {
		this.fchMatriculacion = fchMatriculacion;
	}
	
}
