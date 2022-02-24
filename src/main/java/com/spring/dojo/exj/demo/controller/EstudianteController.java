package com.spring.dojo.exj.demo.controller;

import com.spring.dojo.exj.demo.DTO.EstudianteDTO;
import com.spring.dojo.exj.demo.services.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes/")
@RequiredArgsConstructor
public class EstudianteController {

    private final EstudianteService estudianteService;

    @PostMapping()
    public String guardarEstudiante(@RequestBody EstudianteDTO estudianteDTO){
        estudianteService.createEstudiante(estudianteDTO);
        return "Estudiante guardado correctamente";
    }

    @GetMapping("{id}")
    public ResponseEntity<EstudianteDTO> buscarEstudiante(@PathVariable Long id){
        return ResponseEntity.ok(estudianteService.getEstudiante(id));
    }


}
