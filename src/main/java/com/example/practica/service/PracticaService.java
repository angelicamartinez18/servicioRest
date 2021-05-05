package com.example.practica.service;

import java.util.ArrayList;
/*import java.util.ArrayList;*/
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practica.dto.User;



@Service
public class PracticaService {
	
	public String sumar(int num,int num2) {
		return "la operacion da como resultado"+(num+num2);
	}
	public List<User> listarUsuarios(){
		List<User> listaUsuarios=new ArrayList<User>();
		User user1=new User();
		user1.setNombre("sara");
		
		User user2=new User();
		user2.setNombre("andrea");
		
		User user3=new User();
		user3.setNombre("alexa");
		listaUsuarios.add(user1);
		listaUsuarios.add(user2);
		listaUsuarios.add(user3);
		System.out.println(listaUsuarios.toString());
		return listaUsuarios;
	}
	
	/*public void mostrarUsuarios() {
		for(User user : listaUsuarios) {
			System.out.println(user);
		}
	}*/
}
