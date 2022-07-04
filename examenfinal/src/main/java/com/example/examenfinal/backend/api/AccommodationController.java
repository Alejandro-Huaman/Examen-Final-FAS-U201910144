package com.example.examenfinal.backend.api;

import com.example.examenfinal.backend.domain.entities.Accommodation;
import com.example.examenfinal.backend.domain.service.AccommodationService;
import com.example.examenfinal.backend.mapping.AccommodationMapper;
import com.example.examenfinal.backend.resource.Accommodation.AccommodationResource;
import com.example.examenfinal.backend.resource.Accommodation.CreateAccommodationResource;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {
    @Autowired
    private AccommodationService accommodationService;

    @Autowired
    private AccommodationMapper mapper;

    @Autowired
    private ModelMapper mapping;


    @GetMapping
    public Page<AccommodationResource> getAllAccommodations(Pageable pageable) {
        return mapper.modelListToPage(accommodationService.getAllAccommodations(), pageable);
    }

    @GetMapping("/employee/{employeeid}")
    public AccommodationResource getAccommodationByemployeeId(@PathVariable Long employeeid) {
        return mapper.toResource(accommodationService.getAccommodationByEmployeeId(employeeid));
    }

    @PostMapping
    public AccommodationResource createAccommodation(@RequestBody CreateAccommodationResource request) {
        return mapper.toResource(accommodationService.createAccommodation(mapper.toModel(request)));
    }

}
