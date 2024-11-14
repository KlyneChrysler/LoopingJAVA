import java.util.Scanner;

public class Looping {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        String sentence = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. ";
        String string1 = "CLASS", string2 = "class";
        String userSentence;
//1
        int count = 0;  
        for ( int i = 0; i < sentence.length(); i++ ) {
            if ( sentence.charAt(i) == 'O' ) {
            count ++;
            }
        } 
        System.out.println("THE COUNT OF 'O CHARACTERS IN THE STRING IS: " + count);

//2
        String trim = string1.trim();
        System.out.println(trim.equalsIgnoreCase(string1));

//3
        System.out.println(sentence.replace(' ','%' ));
    
//4
        System.out.println(sentence.indexOf("A"));
    
//5
        System.out.print("ENTER A STRING: ");
        userSentence = scan.nextLine();
    
        System.out.println("CHARACTER IN THE STRING: ");
        for ( int i = 0; i < userSentence.length(); i++ ) {
            System.out.println(userSentence.charAt(i));
        }
    scan.close();
    }
}