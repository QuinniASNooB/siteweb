package com.example.demo.Commentaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    @Query("SELECT p FROM Projet p WHERE p.titre=?1")
    Optional<Commentaire> findById(Long aLong);
}