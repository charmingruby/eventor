package com.eventor.api.services;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eventor.api.domain.event.Event;
import com.eventor.api.domain.event.EventRequestDTO;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data) {
        String bannerUrl = null;

        if (data.banner() != null) {
            bannerUrl = this.uploadImg(data.banner());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setBannerUrl(bannerUrl);

        return newEvent;
    }

    private String uploadImg(MultipartFile multipartFile) {
        return "";
    }
}
