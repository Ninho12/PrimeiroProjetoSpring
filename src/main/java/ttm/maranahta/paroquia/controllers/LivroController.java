package ttm.maranahta.paroquia.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ttm.maranahta.paroquia.entity.Livro;


public class LivroController {

	@ResponseBody
	@RequestMapping("/livros")
	public List<Livro> listar(){
		
		Livro livro = new Livro(123L, "Controller - Spring", 1, "Vitor");

		return Arrays.asList(livro, livro, livro);

	}





}
