package proyecto.Entidad;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.annotations.GenericGenerator;

@Table(name="pservice")
@Entity
public class PServicio implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String nombres, apellidos;
    private String run;
    private String profesion;
    private Integer telefono;
    private String email;
    private boolean borradologico;


    public Integer getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
		return apellidos;
	}

	public String getRun() {
        return run;
    }
    public String getProfesion() {
        return profesion;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    public boolean getBorradologico() {
        return borradologico;
    }


    public void setId(Integer id) {
        this.id = id;
    }
    public void setNombres(String nombres) {
    	this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
    public void setRun(String run) {
        this.run = run;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setBorradologico(boolean borradologico) {
        this.borradologico = borradologico;
    }
}
