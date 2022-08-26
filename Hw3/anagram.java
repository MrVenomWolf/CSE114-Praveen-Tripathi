import java.util.Scanner;
public class anagram {

    //public class anagram{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = in.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = in.nextLine();

        String s1 = new String(str1).toLowerCase().replaceAll(" ","");
        String s2 = new String(str2).toLowerCase().replaceAll(" ","");

        if (s1.length() != s2.length()) {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams");
        } else {

            int[] count = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                count[s1.charAt(i) - 'a']++;
                count[s2.charAt(i) - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    System.out.println(str1 + " and " + str2 + " are NOT anagrams");
                    return;
                }
            }
            System.out.println(str1 + " and " + str2 + " are anagrams");

            in.close();
        }

        

               
    }
    
}
