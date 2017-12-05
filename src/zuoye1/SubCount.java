package zuoye1;

public class SubCount {
	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		// System.out.println(str.length());
		// System.out.println(str.substring(13, 15));
		if (str.length() >= key.length()) {
			int count = getSubCount(str, key);
			System.out.println(count);
		}
	}

	private static int getSubCount(String str, String key) {
		int count = 0;
		for (int i = 0; i < str.length() - key.length() + 1; i++) {
			if (str.substring(i, i + key.length()).equals(key)) {
				count++;
			}
		}
		return count;
	}
}
