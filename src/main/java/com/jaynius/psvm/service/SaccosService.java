package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Saccos;

@Service
public interface SaccosService {
    public ResponseEntity<Saccos> addSacco(Saccos newSacco);
    public ResponseEntity<Saccos> getSaccoById(Long saccoId);
    public ResponseEntity<Saccos> updateSaccoById(Saccos sacco, Long saccoId);
    public ResponseEntity<List<Saccos>> getAllSaccos();
    public ResponseEntity<Saccos> deleteSaccoById(Long saccoId);
}
