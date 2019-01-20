package com.stackroute.repository;

import com.stackroute.domain.Track;


//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, Integer> {
    @Query
    //public Track findByName(String name);
    List<Track> findByTrackName(String trackName);

}

