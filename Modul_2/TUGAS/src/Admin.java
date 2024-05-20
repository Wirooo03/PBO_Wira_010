import java.util.Scanner;

public class Admin {
    public static void menuAdmin(Scanner scanner, String[][] bookList, String[][] userStudent) {
        int choice;
        do {
            System.out.println("=== ADMIN MENU ===");
            System.out.println("1. Display Books");
            System.out.println("2. Add Student");
            System.out.println("3. Display Registered Students");
            System.out.println("4. Logout");
            System.out.print("Choose option [1-4]: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student.displayBooks(bookList);
                    break;
                case 2:
                    addStudent(scanner, userStudent);
                    break;
                case 3:
                    displayStudents(userStudent);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (choice != 4);
    }

    public static void addStudent(Scanner scanner, String[][] userStudent) {
        System.out.print("Enter NIM: ");
        String NIM = scanner.nextLine();
        if (NIM.length() != 15) {
            System.out.println("NIM must be 15 characters long.");
            return;
        }

        for (String[] student : userStudent) {
            if (student[0] != null && student[0].equals(NIM)) {
                System.out.println("NIM already exists.");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter Program Study: ");
        String programStudy = scanner.nextLine();

        for (int i = 0; i < userStudent.length; i++) {
            if (userStudent[i][0] == null) {
                userStudent[i][0] = NIM;
                userStudent[i][1] = name;
                userStudent[i][2] = faculty;
                userStudent[i][3] = programStudy;
                System.out.println("Student added successfully!");
                break;
            }
        }
    }

    public static void displayStudents(String[][] userStudent) {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("||%-20s||%-28s||%-16s||%-16s||%n", "NIM", "Name", "Faculty", "Program Study");
        System.out.println("------------------------------------------------------------------------------------------");
        for (String[] student : userStudent) {
            if (student[0] != null) {
                System.out.printf("||%-20s||%-28s||%-16s||%-16s||%n", student[0], student[1], student[2], student[3]);
            }
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
