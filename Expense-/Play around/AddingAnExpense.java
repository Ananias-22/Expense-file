import java.util.Scanner;
import java.time.LocalDate;
import java.io.FileWriter;
import java.io.IOException;

public class AddingAnExpense  {
 public static void main(String[] args) {
Scanner pr = new Scanner(System.in);
System.out.println("Enter the category " );
String category = pr.nextLine();
System.out.println("Enter the amount " );
double amount = pr.nextDouble();
LocalDate currentDate = LocalDate.now();
System.out.println("Expense catgory is " + category + " the amount is " + amount + " at this date " + currentDate);
int number = 0;
try{
    FileWriter expense = new FileWriter("C:\\Users\\202356086\\Desktop\\Expense-\\Play around\\DataBase\\funnycode.text" ,true);
    expense.write( number + ". category: " + category +  ", amount:  " + amount + " currentDate:  " +  currentDate );
    expense.write("\n"); 
    expense.close();
    number ++ ;
} catch (IOException e){
    e.printStackTrace();
}
}
}

