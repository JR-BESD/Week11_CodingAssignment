package sorting;

import java.util.List;

public class ColorSort {

	public static void main(String[] args) {
		new ColorSort().run();
	}

	private void run() {
		List<Color> sortedColorsByLambda = lambdaSort();
		System.out.println("Lambda:\t\t\t" + sortedColorsByLambda);

		System.out.println();

		List<Color> sortedColorsByMethodReference = methodReferenceSort();
		System.out.println("Method Reference:\t" + sortedColorsByMethodReference);
	}
	
	/*
	 * returns a list sorted by a lambda expression
	 */
	private List<Color> lambdaSort() {
		List<Color> colors = Color.getColors();
		colors.sort((c1, c2) -> Color.compare(c1, c2));
		return colors;
	}

	/*
	 * returns a list sorted by method reference
	 */
	private List<Color> methodReferenceSort() {
		List<Color> colors = Color.getColors();
		colors.sort(Color::compare);
		return colors;
	}
}
