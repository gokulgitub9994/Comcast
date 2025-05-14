package chumma;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		String str = "inter@#$%";
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				count++;
				sb.append(ch).toString();
			}
		}

		System.out.println("The count of special character in the string :" + count);
		System.out.println("The  special character in the string :" + sb);

	}

}
