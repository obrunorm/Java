package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        // TODO
        return "Bem vindo";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        // TODO
        // Obs: Retornar os números gerados em ordem crescente.
        Random gerador = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lista.add(gerador.nextInt(100));
        }
        Collections.sort(lista);

        return lista;
    }
}