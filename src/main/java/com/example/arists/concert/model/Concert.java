package com.example.arists.concert.model;

import com.example.arists.artist.model.Artist;
import com.example.arists.concert.dto.ConcertDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Entity
@Getter
@Setter
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Artist artist;

    @ManyToOne
    private Place place;

    @Column
    private LocalDateTime startDate;

    public ConcertDto convertToDto() {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLL YYYY", Locale.forLanguageTag("pl-PL"));

        return ConcertDto.builder()
                .id(this.id)
                .artistDto(this.artist.convertToDto())
                .place(this.place.convertToDto())
                .startDate(this.startDate.format(formatter)).build();
    }
}
