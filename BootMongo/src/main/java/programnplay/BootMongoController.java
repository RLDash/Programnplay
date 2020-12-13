package programnplay;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import programnplay.repo.BootMongoRepository;
import programnplay.repo.Person;

@RestController
public class BootMongoController {

	@Autowired
	BootMongoRepository repository;

	@GetMapping("/getPersons") 
	public List<Person> getPersons(){ 
		return repository.findAll(); 
	}
}
