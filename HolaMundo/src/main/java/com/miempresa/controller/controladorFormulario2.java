package com.miempresa.controller;

import com.miempresa.DTO.formulario2DTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class controladorFormulario2 {
    @GetMapping("/formulario2")
    public String envioFormulario(Model model) {
        model.addAttribute("form", new formulario2DTO());
        return "formulario2";
    }
    @PostMapping("/formulario2")
    public String recepcionFormulario(@ModelAttribute("form")@Valid formulario2DTO form, BindingResult errores, Model model) {
        if (errores.hasErrors()){
            return "formulario2";
        }
        model.addAttribute("form", form);
        return "recepcion2";
    }
}
