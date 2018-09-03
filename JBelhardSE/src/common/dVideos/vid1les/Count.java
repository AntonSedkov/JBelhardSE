package common.dVideos.vid1les;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Count {
	public static void start() {

		String s = "The question is to be or not to be?";
		s = s.toLowerCase();
		Map<Character, Integer> cnt = new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!cnt.containsKey(c)) {
				cnt.put(c, 1);
			} else {
				int oldCnt = cnt.get(c);
				cnt.put(c, oldCnt + 1);
			}
		}
		for (Character c : cnt.keySet()) {
			for (int n = 0; n < cnt.get(c); n++) {
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println(cnt);

		int arr[] = { 5, 8, 7, 12, 1, 2, 3, 9, 9, 9, 5, 87 };
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int val : arr) {
			Integer inta = map.get(val);
			if (inta == null) {
				map.put(val, 1);
			} else {
				map.put(val, inta + 1);
			}
		}
		System.out.println(map);
		for (int val : map.keySet()) {
			int col = map.get(val);
			for (int n = 0; n < col; n++) {
				System.out.print(val);
			}
		}

		Comparator<Object> comp = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				int i1 = (Integer) o1;
				int i2 = (Integer) o2;
				return i2 - i1;
			}
		};

		map = new TreeMap<Integer, Integer>(comp);
		for (int val : arr) {
			Integer inta = map.get(val);
			if (inta == null) {
				map.put(val, 1);
			} else {
				map.put(val, inta + 1);
			}
		}
		System.out.println();
		System.out.println(map);
	}
}