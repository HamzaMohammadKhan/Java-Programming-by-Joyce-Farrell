public class CountWhiteSpaces {
    public static void main(String[] args){
        String a = "Event handlers incorporated, 8900 US Highway 14 Crystal Lake II 60014";
        System.out.println("The number of letters are : " + a.length());

        char [] b = a.toCharArray();
        int i, count=0;
        for(i = 0; i < b.length; i++){
            if(b[i] == ' '){
                count++;
            }
        }
        System.out.println("The number of whitespaces are : " + count);
    }
    }

