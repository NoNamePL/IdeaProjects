package rukors.springStudents.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.aot.generate.InMemoryGeneratedFiles;
import org.springframework.stereotype.Service;
import rukors.springStudents.models.Student;
import rukors.springStudents.services.StudentService;
import rukors.springStudents.repository.inMemoryStudentDAD;

import java.util.List;
@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {

    private final inMemoryStudentDAD repository;


    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
