package com.example.arists.artist.service;

import com.example.arists.artist.dto.ArtistDto;
import com.example.arists.artist.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public List<ArtistDto> getArtistList() {
        return artistRepository.findAll().stream().map(artist -> artist.convertToDto()).collect(Collectors.toList());
    }

}
