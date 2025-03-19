import java.util.Scanner;
import java.time.LocalDate;

public class AddingAnExpense {
 public static void main(String[] args) {
Scanner pr = new Scanner(System.in);
System.out.println("Enter the category " );
String category = pr.nextLine();
System.out.println("Enter the amount " );
double amount = pr.nextDouble();
LocalDate currentDate = LocalDate.now();
System.out.println("Expense catgory is " + category + " the amount is " + amount + "at this date " + currentDate);

}
}