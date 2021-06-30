public class Perfect {
    public static void main(String[] args){
        int number;
        int sum=0;
        for(number = 1;sum < 1000; number++){
              sum += number;
              if((sum % number)==0){
                  System.out.println(sum);
              }
            }
        }
    }

