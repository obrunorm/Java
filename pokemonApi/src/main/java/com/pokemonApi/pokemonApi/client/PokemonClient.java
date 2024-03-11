package com.pokemonApi.pokemonApi.client;

import com.pokemonApi.pokemonApi.response.PokemonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class PokemonClient {

    private final WebClient webClient;

    public PokemonClient(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://pokeapi.co/api/v2/").build();
    }

    public Mono<PokemonResponse> findPokemonByName(String name){
        log.info("Buscando o pokemon com nome [{}]", name);
        return webClient
                .get()
                .uri("/pokemon"+ name)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parametros informados")))
                .bodyToMono(PokemonResponse.class);
    }
}
