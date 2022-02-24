package com.spring.dojo.exj.demo.services.implement;

import com.spring.dojo.exj.demo.DTO.EstudianteDTO;
import com.spring.dojo.exj.demo.model.Estudiante;
import com.spring.dojo.exj.demo.repository.EstudianteRepository;
import com.spring.dojo.exj.demo.services.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {
    private final EstudianteRepository estudianteRepository;

    @Override
    public void createEstudiante(EstudianteDTO estudianteDTO) {
        estudianteRepository.save(dtoToEntity(estudianteDTO));
    }

    @Override
    public EstudianteDTO getEstudiante(Long id) {
        return entityToDto(estudianteRepository.getById(id));
    }

    private Estudiante dtoToEntity(EstudianteDTO estudianteDTO){
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera(estudianteDTO.getCarrera());
        estudiante.setNombre(estudianteDTO.getNombre());
        return estudiante;
    }

    private EstudianteDTO entityToDto(Estudiante estudiante){
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setCarrera(estudiante.getCarrera());
        estudianteDTO.setNombre(estudiante.getNombre());
        return estudianteDTO;
    }
}
