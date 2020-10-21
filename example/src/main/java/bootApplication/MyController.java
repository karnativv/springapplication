package bootApplication;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping("/myrequest")
	public String myRequest(@RequestParam String id) {
		ArrayList ar = new ArrayList();
		
		ar.add(id);
		return "This is my first program. : " +id;
	}

}
