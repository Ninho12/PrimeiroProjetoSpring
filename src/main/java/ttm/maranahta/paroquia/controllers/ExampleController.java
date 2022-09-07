package ttm.maranahta.paroquia.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 * 
 * @author joaopaulojpsp
 *
 */
@RestController
@RequestMapping("/api/example")
public class ExampleController {
	
	
	@GetMapping("/hello-world")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Olá meu nome é João Paulo!");
		
	}
}