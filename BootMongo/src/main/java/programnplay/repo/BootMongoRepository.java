package programnplay.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BootMongoRepository extends MongoRepository<Person, String> {

}
