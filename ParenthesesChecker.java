
//  Class author: Sara Mansouri
//  Date created:  11/11/2025
//  General description: this class checks if the parentheses are closed properly in a string
public class ParenthesesChecker {

    public static void main(String[] args) {
        System.out.println(parenthesesChecker("(){}[]"));
        System.out.println(parenthesesChecker("(]"));

    }
    // This method checks if the parentheses in your input is closed correctly, you must input a string of parentheses
    // will return true if the parentheses is closed correctly and false otherwise
    public static boolean parenthesesChecker(String s){
        String end = ")}]";
        for (int i = 0; i< s.length(); i++){
            String character = s.substring(i,i+1);
            if(end.contains(character)){
                if (s.substring(i-1,i).equals("(") || character.equals(")") && (s.substring(i-1,i).equals("[") && character.equals("]")) ||
                (s.substring(i-1,1).equals("{") && character.equals("}"))) {
                    s = s.substring(0,i-1) + s.substring(i+1);
                    i-=2;
                } else { 
                    return(false);
                }
                return(true);
            }
        }
    }
}