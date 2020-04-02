package com.sogeti.repository;

import com.sogeti.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirsrtName("David");
        speaker.setLastName("Hippe");

        speakers.add(speaker);

        return speakers;
    }
}
