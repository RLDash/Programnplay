package programnplay.repo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("names")
public class Person {
	private String name;	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
