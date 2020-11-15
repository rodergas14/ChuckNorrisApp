package guru.springframework.chuckNorrisApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.chuckNorrisApp.services.JokeService;

@Controller
public class JokeController {
	
	private final JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"","/"})
	public String index(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
}
