package com.example.examenfinal.backend.service;

import com.example.examenfinal.backend.domain.persistence.AccommodationRepository;
import com.example.examenfinal.backend.domain.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.examenfinal.backend.domain.entities.Accommodation;
import java.util.List;

@Service
public class AccommodationServiceImpl implements AccommodationService {

    @Autowired
    private AccommodationRepository accommodationRepository;

    public AccommodationServiceImpl() { }

    @Override
    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    @Override
    public Page<Accommodation> getAllAccommodations(Pageable pageable) {
        return accommodationRepository.findAll(pageable);
    }

    @Override
    public Accommodation getAccommodationByEmployeeId(Long employeeId) {
        return accommodationRepository.findByemployeeid(employeeId);
    }


    @Override
    public Accommodation createAccommodation(Accommodation request) {

        return accommodationRepository.save(request);
    }
}
