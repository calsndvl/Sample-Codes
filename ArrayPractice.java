import java.util.*;
public class ArrayPractice{
static Scanner s = new Scanner (System.in);
  public static void main(String cals[]){

  int count=0; ectr=0; octr=0;
  int i=1;
  int array[];

    System.out.print("How many numbers?: ");
    count=s.nextInt();
    array=new int[count];
/* 
    for(int i=1;i<=count;++i){
      System.out.print("Enter an Integer: ");
      int num=s.nextInt();
*/
      do{
        System.out.print("Enter an Integer: ");
        int num=s.nextInt();
        array[i-1]=num;

        System.out.print("You entered a "+EO(num)+" number");
        ++i;
        System.out.print();
      }while (i<=count);
        for (int a=0;a<array.length;++a){
          if (array[a]%2==0) ++ectr;
          else ++octr;
          }    
    System.out.println("Total no. of Even: "+ectr);
    System.out.println("Total no. of Odd: "+octr);
}
    static String EO(int x){
      if(x%2==0)
          return "Even";
      else
          return "Odd";
    }
}
