package com.miempresa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	@RequestMapping("/saludar")
	public String Saludar() {
		String saludo = "<h1> Hola mundo desde <b>Spring Boot</b> </h1>";
		String enlace = "<a href='/'>Pagina principal</a><br>";
			return saludo;
	}
	@RequestMapping("/misdatos")
	public String MisDatos() {
		String nombres = "SusNombres";
		int edad = 0;
		String curso = "SuCurso";
		String foto = "perro.jpg";
		String datos = "<table border=1>";
		datos+="<tr><td colspan=2><img src=" + foto + "> <br> <center><h1>¿Por que JAVA?</h1></center></td></tr>";
		datos+="<tr><td><h3>Me llamo</h3></td><td>" + nombres + "</td></tr>";
		datos+="<tr><td><h3>Mi edad es</h3></td><td>" + edad + "</td></tr>";
		datos+="<tr><td><h3>Estoy en el curso de: </h3></td><td>" + curso + "</td></tr>";
		
		return datos;
	}
	@RequestMapping("/")
	public String Indice() {
		String enlaces = "<a href='/saludar'>Mostrar Saludo</a><br>";
		enlaces += "<a href='/misdatos'>Mostras mis Datos</a>";
		return enlaces;
	}
}
