package application.controller;

import application.model.Genero;
import application.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GeneroController {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Genero> generos = generoRepository.findAll();
        model.addAttribute("generos", generos);
        return "home"; // Isso renderiza "home.jsp"
    }

    @PostMapping("/generos")
    public String addGenero(@RequestParam String nome) {
        Genero genero = new Genero();
        genero.setNome(nome);
        generoRepository.save(genero);
        return "redirect:/";
    }
}