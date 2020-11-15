package guru.springframework.chuckNorrisApp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChockNorrisJokeService implements JokeService {
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	public ChockNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}
	
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
