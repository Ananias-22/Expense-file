import java.util.Scanner;
import java.time.LocalDate;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class AddingAnExpense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getLastNumber(); 

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        LocalDate currentDate = LocalDate.now();

        try {
            FileWriter expense = new FileWriter("C:\\Users\\202356086\\Desktop\\Expense-file\\Expense-\\Play around\\DataBase\\Expenses.text", true);
            expense.write(number + ". Category: " + category  + ", Amount: " + amount   + ", Date: " + currentDate);
            expense.write("\n");
            expense.close();
            number++; 
            saveLastNumber(number); 
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close(); 
    }

    private static int getLastNumber() {
        int lastNumber = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("number_tracker.txt"))) {
            String line = br.readLine();
            if (line != null) {
                lastNumber = Integer.parseInt(line.trim());
            }
        } catch (IOException | NumberFormatException e) {
            // File might not exist or be empty, default to 0
        }
        return lastNumber;
    }

    private static void saveLastNumber(int number) {
        try (FileWriter writer = new FileWriter("number_tracker.txt")) {
            writer.write(Integer.toString(number));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
