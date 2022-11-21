
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(6,11);
		String s05 = original.replace('a', 'x');
		String s06 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		
		System.out.println("Original: "+ original + "-");
		System.out.println("toLowerCase: " + s01 +"-");
		System.out.println("toUpperCase: " + s02 +"-");
		System.out.println("trim: " + s03 +"-");
		System.out.println("subString: " + s04 +"-");
		System.out.println("Replace: " + s05 + "-");
		System.out.println("Replace: " + s06 + "-");
		System.out.println("Index of: " + i);
		System.out.println("Last Index of: " + j);
		
		System.out.println("Split: " + word1);
	}

}
