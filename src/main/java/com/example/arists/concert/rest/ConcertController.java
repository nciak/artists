package com.example.arists.concert.rest;

import com.example.arists.artist.dto.ArtistDto;
import com.example.arists.concert.dto.ConcertDto;
import com.example.arists.concert.service.ConcertService;
import com.example.arists.constants.RegionConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/events")
public class ConcertController {

    @Autowired
    ConcertService concertService;

    @GetMapping(value = "/{id}")
    public String getConcertsForArtist(@PathVariable("id") Long id, Model model) {

        List<ConcertDto> polishConcertList = concertService.getConcertList(id, RegionConst.POLAND);
        List<ConcertDto> europeanConcertList = concertService.getConcertList(id, RegionConst.EUROPE);

        ArtistDto artist = polishConcertList.get(0).getArtistDto() != null ?
                polishConcertList.get(0).getArtistDto() : europeanConcertList.get(0).getArtistDto();
        String imgFileName = artist.getName().toLowerCase() + ".png";

        model.addAttribute("polishConcertList", polishConcertList);
        model.addAttribute("europeanConcertList", europeanConcertList);
        model.addAttribute("artist", artist);
        model.addAttribute("imgFileName", imgFileName);
        return "concerts";
    }

}
