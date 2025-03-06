package uniandes.dse.examen1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import uniandes.dse.examen1.entities.CourseEntity;
import uniandes.dse.examen1.exceptions.RepeatedCourseException;
import uniandes.dse.examen1.repositories.CourseRepository;

@Slf4j
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public CourseEntity createCourse(CourseEntity newCourse) throws RepeatedCourseException {
        // TODO
        Long id = newCourse.getId();
        if (id == null){
            throw new IllegalArgumentException("El curso debe tener un ID asociado");
        }
        else if(newCourse.getName() == null){
            throw new IllegalArgumentException("El curso debe tener un nombre");
        }
        else if (!courseRepository.findByCourseCode(id.toString()).equals(null)){
            throw new IllegalArgumentException("El curso debe tener un codigo unico");
        }
        return courseRepository.save(newCourse);

    }
}
