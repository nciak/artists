package com.example.arists.concert.service;

import com.example.arists.concert.dto.ConcertDto;
import com.example.arists.concert.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConcertService {


    @Autowired
    ConcertRepository concertRepository;

    public List<ConcertDto> getConcertList(Long id, Long regionId) {
        return concertRepository.findByArtistIdAndPlaceRegionId(id, regionId).stream().map(concert -> concert.convertToDto()).collect(Collectors.toList());

    }
}
