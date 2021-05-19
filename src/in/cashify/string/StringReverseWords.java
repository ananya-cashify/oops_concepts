package in.cashify.string;

public class StringReverseWords {

    public static void main(String[] args){
       /* String S[] = "I Love my Parents".split(" ");
        System.out.println(S[2]);
        String output = "";
        for (int i =S.length-1; i>=0; i--){
            output+= S[i] + " ";
        }
System.out.println("Reversed sentence is " +output);    */

        String input =" I Love my Parents"  ;
        char[] inputCharArray = input.toCharArray();
        String output ="";

        for (int i = inputCharArray.length-1 ; i>=0 ;i--)   {
            int K =i;
            while (i >=0 && inputCharArray[i] !=' ')    {
                i--;
            }
            int j =i+1   ;
            while (j<= K)   {

                  output+= inputCharArray[j]   ;
                  j++;
            }
            output+= " " ;
        }
        System.out.println (output)  ;
    }
}
