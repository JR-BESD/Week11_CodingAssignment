package sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class ColorOptional {

	public static void main(String[] args) {
		new ColorOptional().run();
	}

	private  void run() {
		Color color = colorMethod(Optional.of(new Color("Fuscia")));
		System.out.println(color);
		
		try {
		colorMethod(Optional.empty());
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Color colorMethod(Optional<Color> optionalColor) {
		return optionalColor.orElseThrow(() -> new NoSuchElementException("No Color Found!"));
	}

}
