package com.example.arists.artist.rest;

import com.example.arists.artist.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping
    String getArtistList(Model model) {
        model.addAttribute("artists", artistService.getArtistList());
        return "index";
    }

}
