import java.util.Scanner;

public class Main {
    // Atribut array untuk menyimpan data buku
    static String[][] bookList = {
            {"1", "Atomic Habits", "James Clear", "Self Improvement", "7"},
            {"2", "48 Laws of Power", "Robert Greene", "Politics", "5"},
            {"3", "The Psychology of Money", "Morgan Housel", "Economy", "3"},
            {"4", "Madilog", "Tan Malaka", "History", "2"}
    };

    // Atribut array untuk menyimpan data user
    static String[][] userStudent = new String[20][4]; // Maksimal 20 mahasiswa

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number:     ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputNIM(scanner);
                    break;
                case 2:
                    adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("adios muchachos chocolatos");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (choice != 3);
    }

    private static void showMenu() {
        System.out.println("==== LIBRARY SYSTEM ===");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Quit");
        System.out.print("Choose option: ");
    }

    private static void inputNIM(Scanner scanner) {
        System.out.println("=== STUDENT LOGIN ===");
        System.out.print("Enter your NIM: ");
        String NIM = scanner.nextLine();

        if (checkNIM(NIM)) {
            Student.menuStudent(scanner, bookList, NIM);
        } else {
            System.out.println("User not found!");
        }
    }

    private static boolean checkNIM(String NIM) {
        for (String[] student : userStudent) {
            if (student[0] != null && student[0].equals(NIM)) {
                return true;
            }
        }
        return false;
    }

    private static void adminLogin(Scanner scanner) {
        final String USERNAME = "admin";
        final String PASSWORD = "admin";

        System.out.println("=== ADMIN LOGIN ===");
        System.out.print("Enter Username: ");
        String Username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String Password = scanner.nextLine();

        if (Username.equals(USERNAME) && Password.equals(PASSWORD)) {
            Admin.menuAdmin(scanner, bookList, userStudent);
        } else {
            System.out.println("User not found!");
        }
    }
}
