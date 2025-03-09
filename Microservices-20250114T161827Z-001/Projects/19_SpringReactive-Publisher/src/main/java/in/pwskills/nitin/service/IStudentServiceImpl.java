package in.pwskills.nitin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.entity.Student;
import in.pwskills.nitin.repo.IStudentReposistry;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class IStudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentReposistry repo;
	
	@Override
	public Mono<Student> saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Mono<Student> getOneStudentInfo(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).switchIfEmpty(Mono.empty());
				
	}

	@Override
	public Flux<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Mono<Void> deleteStudent(String id) {
		// TODO Auto-generated method stub
		return repo.deleteById(id);
	}

}
