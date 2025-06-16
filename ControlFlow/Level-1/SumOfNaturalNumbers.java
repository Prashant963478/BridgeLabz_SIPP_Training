import java.util.*;
public class SumOfNaturalNumbers{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   int sum=0;
   if(num>0){
       sum = (num*(num+1))/2;
       System.out.println("The sum of natural numbers is"+ sum);
    } else{
         System.out.println("The number"+num+"is not a natural number");
      }
  
  }
}
