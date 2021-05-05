package com.example.practica.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practica.dto.User;
import com.example.practica.repo.IUserRepo;
import com.example.practica.service.PracticaService;


@RestController
@RequestMapping("usuarios")
public class RestpracticaController {
	@Autowired
	private PracticaService  practicaService;
	
	@Autowired
	private IUserRepo iuserrepo;
	
	@GetMapping("/listar")
	public List <User> Listar(){
		return practicaService.listarUsuarios();
	}
	@PostMapping("/insertar")
	public void insertar(@RequestBody User user) {
		//iuserrepo.save(user);
		System.out.println("el usuario es"+user);
	}
	@PutMapping("/modificar")
	public void modificar(@RequestBody User user) {
		//iuserrepo.save(user);
		System.out.println("el usuario se modifico"+user);
	}
	@DeleteMapping("/eliminar")
	public void eliminar(@RequestBody User user) {
		//iuserrepo.deleteById(id);
		System.out.println("el usuario se elimino con exito"+user);
	}
	
	

}
