package ressources;

public class TexteSingleton1 implements Texte {
	
	private String message = "Bonjour Le Monde";

	public TexteSingleton1() {
		super();
	}

	public String getMessage() {
		return message;
	}	
}
