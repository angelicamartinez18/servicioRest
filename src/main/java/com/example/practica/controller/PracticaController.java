package com.example.practica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.practica.dto.User;
import com.example.practica.service.PracticaService;

@Controller
public class PracticaController {
	
	@Autowired
	private PracticaService practicaService;
	
	@GetMapping("/index")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="mundo") String text,
			@RequestParam(name="p", required=false, defaultValue="p1") String pagina){
		ModelAndView andView = new ModelAndView();
		andView.addObject("p", pagina);
		andView.addObject("name", text);
		
		
		if(pagina.equals("p1")) {
			andView.setViewName("pagina.html") ;
			
			System.out.println("el resultado es"+practicaService.sumar(1, 2));
			
			
		}else {
			andView.setViewName("pagina2.html") ;
		}
		return andView;
	}
	@GetMapping("/listado")
	public String mostrarUsuario(Model model) {
		List<User> listaUsuarios=new ArrayList<User>();
		listaUsuarios=practicaService.listarUsuarios();
		model.addAttribute("listaUsuarios",listaUsuarios);
		return "pagina.html";
	}
	/*@GetMapping("/pagina")
	public void mostrarUsuario(Model model) {
		ModelAndView andView = new ModelAndView();
		List<User> listaUsuarios=new ArrayList<User>();
		listaUsuarios=practicaService.listarUsuarios();
		model.addAttribute("listaUsuarios",listaUsuarios);
		 andView.setViewName("pagina.html");
	}*/
	
	
}
