package com.pokemonApi.pokemonApi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PokemonResponse {
    private String abilities;
    private String moves;
}
