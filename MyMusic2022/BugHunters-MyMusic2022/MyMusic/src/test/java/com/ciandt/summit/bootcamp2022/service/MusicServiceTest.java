package com.ciandt.summit.bootcamp2022.service;

import com.ciandt.summit.bootcamp2022.controller.MusicController;
import com.ciandt.summit.bootcamp2022.entity.Artista;
import com.ciandt.summit.bootcamp2022.entity.Musica;
import com.ciandt.summit.bootcamp2022.repository.ArtistRepository;
import com.ciandt.summit.bootcamp2022.repository.MusicRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(MusicController.class)
class MusicServiceTest {
    @InjectMocks
    MusicService musicService;
    @Mock
    MusicRepository musicRepository;
    @Mock
    ArtistRepository artistRepository;

    @Test
    void test_findMusic(){
        Musica musica = new Musica();
        musica.setId("67f5976c-eb1e-404e-8220-2c2a8a23be47");
        musica.setNome("Hippy Hippy Shake");

        Artista artista = new Artista();
        artista.setId("32844fdd-bb76-4c0a-9627-e34ddc9fd892");
        artista.setNome("The Beatles");
        musica.setArtista(artista);


        given(artistRepository.findById(artista.getId())).willReturn(Optional.of(artista));

        given(musicRepository.BuscarMusica("The Beatles")).willReturn(Collections.emptyList());

        List<Musica> music = new ArrayList<Musica>();
        assertEquals(music, musicService.BuscarMusica(artista.getNome()));

    }

}
