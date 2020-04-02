package com.sogeti.service;

import com.sogeti.model.Speaker;
import com.sogeti.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(){}
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findAll();
    }
}
