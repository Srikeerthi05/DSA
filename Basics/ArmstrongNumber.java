  class Main{
     public static boolean isArmstrong(int number){
         int copy=number;
         int k=String.valueOf(number).length();
         int sum=0;
         while(number>0){
             int a=number%10;
             sum+=Math.pow(a,k);
             number=number/10;
         }
         return sum==copy ? true :false;  
     }
  public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
