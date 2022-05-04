package sorting;

import java.util.stream.Collectors;

public class ColorStream {

	public static void main(String[] args) {
		new ColorStream().run();
	}

	private void run() {
		String colors = Color.getColors().stream().map(Color::toString).sorted().collect(Collectors.joining(", "));
		System.out.println("Stream:\t" + colors);
	}
}
