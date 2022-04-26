package com.example.arists.concert.repository;

import com.example.arists.concert.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {

    List<Concert> findByArtistIdAndPlaceRegionId(Long id, Long regionId);
}
