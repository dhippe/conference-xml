package com.sogeti.repository;

import com.sogeti.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
