package in.saifit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
	
	@GetMapping("/")
	public ResponseEntity<String> getWelcome(){
		String msg = "Welcome to My First App.....!!!";
		return new ResponseEntity<>(msg , HttpStatus.OK);
		
		
	}

}
