package com.example.examenfinal.backend.domain.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.examenfinal.backend.domain.entities.Accommodation;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation,Long> {
    Accommodation findByemployeeid(Long employeeId);
}
