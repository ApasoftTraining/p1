package com.curso.odoo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.odoo.model.Pais;
import com.curso.odoo.model.Provincia;

@Controller
public class HomeController {

	@GetMapping("/")
	public String inicio() {
		return "listado";
	}

	@GetMapping("/listado")
	public String listado(Model modelo) {
		// Paises
		List<String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Francia");
		paises.add("Alemania");
		paises.add("Italia");

		modelo.addAttribute("listadopaises", paises);

		// Provincias
		List<String> provincias = new LinkedList<String>();
		provincias.add("Madrid");
		provincias.add("Barcelona");
		provincias.add("Sevilla");
		provincias.add("Valencia");

		modelo.addAttribute("listadoprovincias", provincias);

		return "listado";
	}

	@GetMapping("/saludar")
	public String saludar(Model modelo) {
		// modelo propiedades, datosd
		modelo.addAttribute("nombre", "Pedro Garcia");
		// Otros dos atributos llamados edad y direccion y los visualizeis como H3

		Double sueldo = 0.0;
		modelo.addAttribute("edad", "25");
		modelo.addAttribute("direccion", "Calle Pez 7");
		modelo.addAttribute("suelgo", sueldo);
		return "saludar";
	}

	@GetMapping("/pais")
	public String pais(Model modelo) {
		Pais p1 = new Pais();
		p1.setCodigopais(1);
		p1.setNombrepais("USA");
		modelo.addAttribute("pais_modelo", p1);
		return "pais";
	}

	//Controller
	@GetMapping("/provinciaImagenes")
	public String provinciaImagenes(Model modelo) {

		//Modelo
		//Lista de Provincias
		List<Provincia> provincias = new ArrayList<Provincia>();
		
		Provincia provincia_1 = new Provincia();
		
		provincia_1.setCodigoProvincia(1);
		provincia_1.setNombreProvincia("Valencia");
		provincia_1.setCodigoPais(1);
		
		provincias.add(provincia_1);
		
		provincia_1 = new Provincia();
		
		provincia_1.setCodigoProvincia(2);
		provincia_1.setNombreProvincia("Madrid");
		provincia_1.setCodigoPais(2);
		provincias.add(provincia_1);
		
		provincia_1 = new Provincia();
		provincia_1.setCodigoProvincia(3);
		provincia_1.setNombreProvincia("Sevilla");
		provincia_1.setCodigoPais(3);
		provincias.add(provincia_1);
		
		provincia_1 = new Provincia();
		provincia_1.setCodigoProvincia(4);
		provincia_1.setNombreProvincia("Barcelona");
		provincia_1.setCodigoPais(2);
		provincias.add( provincia_1);

		modelo.addAttribute("provincias", provincias);
		

		//LLamar a la vista
		return "provinciaImagenes";
	}

	
	@GetMapping("/provincia")
	public String provincia(Model modelo) {

		//Modelo
		Provincia provincia_1 = new Provincia();
		Provincia provincia_2 = new Provincia();
		Provincia provincia_3 = new Provincia();

		provincia_1.setCodigoProvincia(1);
		provincia_1.setNombreProvincia("Valencia");
		provincia_1.setCodigoPais(1);
		

		provincia_2.setCodigoProvincia(2);
		provincia_2.setNombreProvincia("Madrid");
		provincia_2.setCodigoPais(1);

		provincia_3.setCodigoProvincia(3);
		provincia_3.setNombreProvincia("Sevilla");
		provincia_3.setCodigoPais(1);
		
		provincia_3.setCodigoProvincia(4);
		provincia_3.setNombreProvincia("Barcelona");
		provincia_3.setCodigoPais(2);

		modelo.addAttribute("provincia1", provincia_1);
		modelo.addAttribute("provincia2", provincia_2);
		modelo.addAttribute("provincia3", provincia_3);

		//LLamar a la vista
		return "provincia";
	}
	
	@GetMapping("/form")
	public String form() {

		return "formProvincias";
	}

	@PostMapping("/form")
	public String listadoProvincia(@RequestParam String codigoProvincia, @RequestParam String nombreProvincia,
			Model modelo) {

		modelo.addAttribute("codigoProvincia", codigoProvincia);
		modelo.addAttribute("nombreProvincia", nombreProvincia);
		return "formResult";
	}


}
