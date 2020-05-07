package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Amigos")
public class Amigo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAmigo;
	
	@Column(name = "nombreAmigo", nullable = false, length = 50 )
	private String nombreAmigo;
	
	@Column(name = "correoAmigo", nullable = false , length = 50)
	private String correoAmigo;
	
	@Column(name = "sexoAmigo" , nullable = false , length = 50)
	private String sexoAmigo;
	
	private int edadAmigo;

	public Amigo(){
		super();
	}
	
	public Amigo(int idAmigo, String nombreAmigo, String correoAmigo, String sexoAmigo, int edadAmigo ) {
		super();
		this.idAmigo=idAmigo;
		this.nombreAmigo=nombreAmigo;
		this.correoAmigo=correoAmigo;
		this.sexoAmigo=sexoAmigo;
		this.edadAmigo=edadAmigo;
		
	}

	public int getIdAmigo() {
		return idAmigo;
	}

	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public String getNombreAmigo() {
		return nombreAmigo;
	}

	public void setNombreAmigo(String nombreAmigo) {
		this.nombreAmigo = nombreAmigo;
	}

	public String getCorreoAmigo() {
		return correoAmigo;
	}

	public void setCorreoAmigo(String correoAmigo) {
		this.correoAmigo = correoAmigo;
	}

	public String getSexoAmigo() {
		return sexoAmigo;
	}

	public void setSexoAmigo(String sexoAmigo) {
		this.sexoAmigo = sexoAmigo;
	}

	public int getEdadAmigo() {
		return edadAmigo;
	}

	public void setEdadAmigo(int edadAmigo) {
		this.edadAmigo = edadAmigo;
	}
	
	
	
}
