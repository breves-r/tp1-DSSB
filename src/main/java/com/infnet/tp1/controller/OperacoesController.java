package com.infnet.tp1.controller;

import com.infnet.tp1.model.Operacoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operacoes")
public class OperacoesController {
    /*
    * +  - x  /  **
    * */
    @GetMapping("/adicao")
    @PostMapping("/adicao")
    public double adicao(@RequestParam double num1, @RequestParam double num2) {
        return Operacoes.adicao(num1, num2);
    }

    @GetMapping("/subtracao")
    @PostMapping("/subtracao")
    public double subtracao(@RequestParam double num1, @RequestParam double num2) {
        return Operacoes.subtracao(num1, num2);
    }

    @GetMapping("/multiplicacao")
    @PostMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double num1, @RequestParam double num2) {
        return Operacoes.multiplicacao(num1, num2);
    }

    @GetMapping("/divisao")
    @PostMapping("/divisao")
    public double divisao(@RequestParam double num1, @RequestParam double num2) {
        return Operacoes.divisao(num1, num2);
    }

    @GetMapping("/exponenciacao")
    @PostMapping("/exponenciacao")
    public double exponenciacao(@RequestParam double base, @RequestParam double expoente) {
        return Operacoes.exponenciacao(base, expoente);
    }
}
