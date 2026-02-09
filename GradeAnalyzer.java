import java.util.*;
class GradeAnalyzer{
  public static void main(String cals[]){
  Scanner s = new Scanner(System.in);
  char choice;
  /*
    SUM = N1+N2;
    DIFFERENCE = N1-N2;
    PRODUCT = N1*N2;
    QUOTIENT = N1/N2;
    REMAINDER = N1%N2;
*/
do{
    System.out.print("Enter grade: ");
    int grade=s.nextInt();

    if(grade>=90)
      System.out.print("Excellent!");
    else if (grade>=80)
      System.out.print("Very Good!");
    else if (grade>=75)
      System.out.print("Passed!");
    else
      System.out.print("Failed, better luck next time.");
    
		System.out.print("Do you want to analyze another grade(Y/N)? ");
		choice = scanner.next().charAt(0);
		}while(choice == 'Y');
	}
}
