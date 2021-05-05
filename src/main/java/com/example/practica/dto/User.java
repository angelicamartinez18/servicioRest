package com.example.practica.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id	
private Integer idUser;	
@Column(name="nombre", length= 50)
private String nombre;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Integer getIdUser() {
	return idUser;
}

public void setIdUser(Integer idUser) {
	this.idUser = idUser;
}


}
