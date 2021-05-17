package com.curso.odoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.exceptions.ParserInitializationException;

@Controller
@RequestMapping(value="/informes")
public class OtroController {
	
	@GetMapping("/listado/{codigoProvincia}")
	public String listadoPrincipal(@PathVariable("codigoProvincia")  int codigoProvincia, Model modelo)
	{
		modelo.addAttribute("codProvincia",codigoProvincia);
		return "informes/listadoProvincia";
	}

	
	@GetMapping("/listado1/{codigoProvincia}/{nombreProvincia")
	public String listadoPrincipal1(@PathVariable("codigoProvincia")  int codigoProvincia, @PathVariable("nombreProvincia") String nombre, Model modelo)
	{
		modelo.addAttribute("codProvincia",codigoProvincia);
		modelo.addAttribute("nombreProvincia", nombre);
		return "informes/listadoProvinciaTotal";
	}
	
	
	
	@GetMapping("/listado2")
	public String listado2(@RequestParam("codProvincia")  String codigoProvincia, Model modelo)
	{
		modelo.addAttribute("codProvincia",Integer.parseInt(codigoProvincia));
		return "informes/listado2";
	}
	
}
