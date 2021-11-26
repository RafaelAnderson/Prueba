package com.example.homemade.repository;

import com.example.homemade.model.Publication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PublicationRepository extends JpaRepository<Publication, Long> {
    Page<Publication> findByUserId(Long userId, Pageable pageable);
     Optional<Publication> findByIdAndUserId(Long Id, Long userId);
}
