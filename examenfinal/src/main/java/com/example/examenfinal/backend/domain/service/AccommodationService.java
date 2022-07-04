package com.example.examenfinal.backend.domain.service;

import com.example.examenfinal.backend.domain.entities.Accommodation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccommodationService {
    List<Accommodation> getAllAccommodations();
    Page<Accommodation> getAllAccommodations(Pageable pageable);
    Accommodation getAccommodationByEmployeeId(Long employeeId);
    Accommodation createAccommodation(Accommodation accommodation);
}
