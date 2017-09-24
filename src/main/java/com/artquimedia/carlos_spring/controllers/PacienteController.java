package com.artquimedia.carlos_spring.controllers;

import com.artquimedia.carlos_spring.model.Paciente;
import com.artquimedia.carlos_spring.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by pezpc on 9/24/17. ***
 */

@Controller
public class PacienteController {

    private PacienteRepository pacienteRepository;

    @Autowired
    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @GetMapping
    @RequestMapping("/pacientes/{id}")
    public String getById(@PathVariable Long id, Model model) {


        Optional<Paciente> paciente = pacienteRepository.findById(id);

        if(paciente.isPresent()) {

            model.addAttribute("paciente", paciente.get());
        }

        return "paciente/show";

    }
}
