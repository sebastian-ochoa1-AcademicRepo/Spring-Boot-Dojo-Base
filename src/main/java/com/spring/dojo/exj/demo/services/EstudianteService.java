package com.spring.dojo.exj.demo.services;

import com.spring.dojo.exj.demo.DTO.EstudianteDTO;

public interface EstudianteService {
    void createEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO getEstudiante(Long id);
}
