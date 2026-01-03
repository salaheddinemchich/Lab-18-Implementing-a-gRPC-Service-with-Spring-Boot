package org.example.grpc2.services;

import org.example.grpc2.entities.Compte;
import org.example.grpc2.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public Map<String, Number> getTotalSoldeStats() {
        List<Compte> comptes = compteRepository.findAll();
        int count = comptes.size();
        float sum = (float) comptes.stream().mapToDouble(Compte::getSolde).sum();
        float average = count > 0 ? sum / count : 0;
        return Map.of("count", count, "sum", sum, "average", average);
    }
}
