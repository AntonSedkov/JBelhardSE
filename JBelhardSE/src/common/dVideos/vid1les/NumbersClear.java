package common.dVideos.vid1les;

import java.util.ArrayList;

public class NumbersClear {
	public static void start() {
		ArrayList<Integer> primeVals = new ArrayList<>();
		for (int i = 2; i < 1000; i++) {
			boolean isP = true;
			for (int p : primeVals) {
				if (i % p == 0) {
					isP = false;
					break;
				}
			}
			if (isP) {
				primeVals.add(i);
			}
		}
		System.out.println(primeVals);
	}
}