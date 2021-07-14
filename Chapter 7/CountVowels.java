public class CountVowels {
    public static void main(String[] args) {
        JoinStrings obj1 = new JoinStrings();
        String a, b, c;
        a = obj1.getA1();
        b = obj1.getB1();
        c = obj1.getC1();
        int vowels = 0, vowels1 = 0, vowels2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                vowels++;
            }
        }
        System.out.println("A contains " + vowels + " vowels ");

        for(int j = 0; j < b.length(); j++)
            if (b.charAt(j) == 'a' || b.charAt(j) == 'e' || b.charAt(j) == 'i' || b.charAt(j) == 'o' || b.charAt(j) == 'u'){
                vowels1++;
            }
        System.out.println("B contains " + vowels1 + " vowels");

        for(int k = 0; k < c.length(); k++)
            if (c.charAt(k) == 'a' || c.charAt(k) == 'e' || c.charAt(k) == 'i' || c.charAt(k) == 'o' || c.charAt(k) == 'u'){
                vowels2++;
            }
        System.out.println("C contains " + vowels2 + " vowels");
    }
}
