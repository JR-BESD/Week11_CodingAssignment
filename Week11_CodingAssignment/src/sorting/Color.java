package sorting;

import java.util.ArrayList;
import java.util.List;

public class Color {
	private String name;

	private static List<Color> colors = List.of(new Color("Black"), new Color("White"), new Color("Red"),
			new Color("Blue"), new Color("Green"), new Color("Magenta"), new Color("Cyan"), new Color("Yellow"));

	public Color(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " Color";
	}

	public static int compare(Color c1, Color c2) {
		return c1.name.compareTo(c2.name);
	}

	/**
	 * Returns a modifiable list initiated with colors
	 * 
	 * @return the colors
	 */
	public static List<Color> getColors() {
		return new ArrayList<>(colors);
	}
}
