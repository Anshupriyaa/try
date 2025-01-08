import java.util.*;
public class celToFahr{
public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
   int num = sc.nextInt();
   
   double temp = (num*9/5) +32;
   System.out.println("temperature in Fahrenheit = "+ temp);
}
}