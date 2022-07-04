package com.example.examenfinal.backend.mapping;

import com.example.examenfinal.backend.domain.entities.Accommodation;
import com.example.examenfinal.backend.resource.Accommodation.CreateAccommodationResource;
import com.example.examenfinal.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import com.example.examenfinal.backend.resource.Accommodation.AccommodationResource;

import java.io.Serializable;
import java.util.List;

public class AccommodationMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public AccommodationResource toResource(Accommodation model) { return mapper.map(model, AccommodationResource.class); }

    public Page<AccommodationResource> modelListToPage(List<Accommodation> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, AccommodationResource.class), pageable, modelList.size());
    }

    public Accommodation toModel(CreateAccommodationResource resource) {
        return mapper.map(resource, Accommodation.class);
    }
}
