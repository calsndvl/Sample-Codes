import java.util.*;
class Act1{
  public static void main(String cals[]){
 Scanner s = new Scanner (System.in);

int[] grades = new int[5];
int sum=0;
int highest = 0;

System.out.println("Enter grades: ");
    for (int i=0;i<grades.length;++i){
    grades[i]=s.nextInt();
    sum+= grades[i];
      if(grades[i]>highest)
        highest = grades[i];
    }
  double average = (double)sum/grades.length;
    System.out.println("Average Grade: "+ average);
    System.out.println("Highest Grade: "+ highest);
  }
}
