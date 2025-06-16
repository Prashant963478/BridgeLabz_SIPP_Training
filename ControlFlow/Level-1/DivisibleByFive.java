import java.util.*;
public class DivisibleByFive{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   
   if(num%5==0){
       
       System.out.println("The" + num + "is divisible by 5");
    } else {
         System.out.println("The number is not divisible by 5");
      }
  
  }
}
