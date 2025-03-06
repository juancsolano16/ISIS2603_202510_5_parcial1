package uniandes.dse.examen1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import uniandes.dse.examen1.entities.CourseEntity;
import uniandes.dse.examen1.entities.StudentEntity;
import uniandes.dse.examen1.entities.RecordEntity;
import uniandes.dse.examen1.exceptions.InvalidRecordException;
import uniandes.dse.examen1.repositories.CourseRepository;
import uniandes.dse.examen1.repositories.StudentRepository;
import uniandes.dse.examen1.repositories.RecordRepository;

@Slf4j
@Service
public class RecordService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    RecordRepository recordRepository;

    public RecordEntity createRecord(String loginStudent, String courseCode, Double grade, String semester) throws InvalidRecordException {
        // TODO
        if(studentRepository.findByLogin(loginStudent) == null){
            throw new IllegalArgumentException("El login no existe");
        }
        else if(courseRepository.findByCourseCode(courseCode) == null){
            throw new IllegalArgumentException("El curso no existe");
        }
        else if(1.5 > grade && grade > 5){
            throw new IllegalArgumentException("El rango de la nota no es correcto");
        }
        Optional<StudentEntity> estudiante = studentRepository.findByLogin(loginStudent);
        return recordRepository.save();
    }
}
