package ressources;

public class TexteSingleton {

	private static TexteSingleton instance = null;
	private String message = "Bonjour Le Monde";

	public static TexteSingleton getInstance() {
		if(instance == null)
			instance = new TexteSingleton();
		
		return instance;
	}

	private TexteSingleton() {
		super();
	}

	public String getMessage() {
		return message;
	}
	
	
	
}
