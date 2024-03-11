package com.pokemonApi.pokemonApi.controller;

import com.pokemonApi.pokemonApi.client.PokemonClient;
import com.pokemonApi.pokemonApi.response.PokemonResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/webclient")
public class PokemonController {

    PokemonClient pokemonClient;

    @GetMapping("/pokemon/{name}")
    public Mono<PokemonResponse> getPokemonByname(@PathVariable String name){
        return pokemonClient.findPokemonByName(name);
    }
}
