package in.cashify.string;

public class StringOperations {
    static String reverseString(String string){
        int i= string.length()-1;
        String S = "";

        while (i>=0){
            S= S+ name.toCharArray()[i];
            i=i-1;
        }
        return S;
    }


        static String sentence = "Perform some string operations on it";
        static String name = "Ananya";

        public static void main(String[] args) {

            System.out.println(name.toLowerCase());
            System.out.println(name.toUpperCase());
            System.out.println(sentence.split(" ")[2]);
            System.out.println(name.charAt(2));
            System.out.println(name.concat(" Thakur"));
            System.out.println(name.equalsIgnoreCase("Ananya"));

        }
}
