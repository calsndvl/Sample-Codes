import java.util.*;
class MathDemoGrade{
  public static void main(String cals[]){
  Scanner s = new Scanner(System.in);
    
    System.out.print("Enter grade: ");
    int grade=s.nextInt();
  /*
    SUM = N1+N2;
    DIFFERENCE = N1-N2;
    PRODUCT = N1*N2;
    QUOTIENT = N1/N2;
    REMAINDER = N1%N2;
*/
    if(grade>74.4)
      System.out.print("You Passed!");
    else
      System.out.print("You Failed");

    if(grade>=90)
      System.out.print("Excellent!");
    else if (grade>=80)
      System.out.print("Very Good!");
    else if (grade>=75)
      System.out.print("Passed!");
    else
      System.out.print("Failed, better luck next time.");
  }
}
