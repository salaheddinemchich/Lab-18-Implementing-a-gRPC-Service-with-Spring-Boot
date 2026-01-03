package org.example.grpc2.repositories;

import org.example.grpc2.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}
