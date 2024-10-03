package com.example.lab6.controller;


import com.example.lab6.entity.Artistas;
import com.example.lab6.repository.ArtistaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.lab6.entity.Eventos;
import com.example.lab6.repository.EventoRepository;

import java.util.List;


@Controller
@RequestMapping("/index")
public class IndexController {

    final EventoRepository eventoRepository;
    final ArtistaRepository artistaRepository;

    public IndexController(EventoRepository eventoRepository, ArtistaRepository artistaRepository) {
        this.eventoRepository = eventoRepository;
        this.artistaRepository = artistaRepository;
    }


    @GetMapping("/inicio")
    public String Inicio(Model model) {
        return "index";
    }

    @GetMapping("/eventos")
    public String listaEventos(Model model){
        List<Eventos> eventos = eventoRepository.findAll();
        model.addAttribute("eventos", eventos);

        return "listaEventos";
    }

    @GetMapping("/artistas")
    public String listaArtistas(Model model){
        List<Artistas> artistas = artistaRepository.findAll();
        model.addAttribute("artistas", artistas);
        return "listaArtistas";
    }
}
