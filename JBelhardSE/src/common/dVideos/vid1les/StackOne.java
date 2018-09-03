package common.dVideos.vid1les;

import java.util.Scanner;
import java.util.Stack;

public class StackOne {

	public static void start() {
		Stack<Double> stack = new Stack<Double>();

		Scanner s = new Scanner(System.in);

		while (true) {
			String line = s.nextLine();

			// PUSH 1
			String[] parts = line.split(" ");
			String cmdName = parts[0];

			if (cmdName.equals("PUSH")) {
				stack.push(Double.valueOf(parts[1]));
			} else if (cmdName.equals("PRINT")) {
				System.out.println(stack);
			}
		s.close();
		}
	}

}