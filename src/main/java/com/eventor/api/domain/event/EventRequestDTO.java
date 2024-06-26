package com.eventor.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(
        String title,
        String description,
        Long date,
        String city,
        String state,
        Boolean isRemote,
        String eventUrl,
        MultipartFile banner) {
}
