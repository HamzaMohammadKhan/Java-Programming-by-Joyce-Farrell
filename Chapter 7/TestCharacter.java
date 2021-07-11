public class TestCharacter {
    public static void main(String[]  args){
        char aChar = 'C';
        System.out.println("The charater is UpperCase : " + aChar);
        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is upperCase");
        }else{
            System.out.println(aChar +" is not upperCase ");
        }
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        if(Character.isLetterOrDigit(aChar)){
            System.out.println("After toUpperCase,aChar is " + aChar);
        }else{
            System.out.println(aChar + " is neither a letter nor a digit");
        }
        if(Character.isWhitespace(aChar)){
            System.out.println(aChar + " is WhiteSapce ");
        }else{
            System.out.println(aChar + " is not WhiteSpace");
        }
    }
    
}
