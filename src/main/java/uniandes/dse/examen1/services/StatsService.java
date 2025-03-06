package uniandes.dse.examen1.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import uniandes.dse.examen1.entities.StudentEntity;
import uniandes.dse.examen1.repositories.CourseRepository;
import uniandes.dse.examen1.repositories.StudentRepository;
import uniandes.dse.examen1.repositories.RecordRepository;

@Slf4j
@Service
public class StatsService {

    @Autowired
    StudentRepository estudianteRepository;

    @Autowired
    CourseRepository cursoRepository;

    @Autowired
    RecordRepository inscripcionRepository;

    public Double calculateStudentAverage(String login) {
        // TODO
        Optional<StudentEntity> estudiante = estudianteRepository.findByLogin(login);
        inscripcionRepository.find
    }

    public Double calculateCourseAverage(String courseCode) {
        // TODO
        Optional<RecordEntity> inscripcion = inscripcionRepository.findByCourseCode(courseCode);
    }

}
