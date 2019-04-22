package endpoint.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorEndpoint {
	
	@RequestMapping("/v1/professor")
	public ResponseEntity<?> hi (){
		return new ResponseEntity<>("Hi", HttpStatus.OK);
	}

}
