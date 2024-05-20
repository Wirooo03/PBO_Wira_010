import java.util.Scanner;

public class Student {

    public static void menuStudent(Scanner scanner, String[][] bookList, String NIM) {
        int choice;
        do {
            System.out.println("=== STUDENT MENU ===");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Logout");
            System.out.print("Choose option [1-3]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayBooks(bookList);
                    break;
                case 2:
                    borrowBook(scanner, bookList, NIM);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (choice != 3);
    }

    public static void displayBooks(String[][] bookList) {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("||%-5s||%-30s||%-24s||%-20s||%-8s||%n", "ID", "Nama Buku", "Author", "Category", "Stock");
        System.out.println("---------------------------------------------------------------------------------------------------");
        for (String[] book : bookList) {
            System.out.printf("||%-5s||%-30s||%-24s||%-20s||%-8s||%n", book[0], book[1], book[2], book[3], book[4]);
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public static void borrowBook(Scanner scanner, String[][] bookList, String NIM) {
        System.out.print("Enter Book ID to borrow: ");
        String bookID = scanner.nextLine();

        for (String[] book : bookList) {
            if (book[0].equals(bookID)) {
                int stock = Integer.parseInt(book[4]);
                if (stock > 0) {
                    // Kurangi stok buku
                    book[4] = String.valueOf(stock - 1);
                } else {
                    System.out.println("Book out of stock!");
                }
                return;
            }
        }
        System.out.println("Book ID not found!");
    }
}
