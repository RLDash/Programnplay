package programnplay;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClients;

public class MongoApp {
	public static void main(String[] args) {
		MongoTemplate template = new MongoTemplate(MongoClients.create("mongodb+srv://<username>:<password>@<host>/?retryWrites=true&w=majority"), "myDatabase");
		System.out.println("Connected to Atlas");
        List<Person> list = template.findAll(Person.class);
        System.out.println("Person list size is "+list.size());
		list.forEach((person) -> System.out.println(person.getName()));
	}
}

class Person {
	private String name;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
