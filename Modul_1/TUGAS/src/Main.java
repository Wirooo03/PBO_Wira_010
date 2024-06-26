import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("adios muchachos chocolatos");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again!");
                    break;
            }
        }while(choice != 3);
    }

    private static void showMenu(){
        System.out.println("===== LIBRARY SYSTEM ====");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
    }

    private static void studentLogin(Scanner scanner){
        System.out.println("==== STUDENT LOGIN ====");
        System.out.print("Enter your NIM: ");
        String NIM = scanner.nextLine();

        if(NIM.length() == 15){
            System.out.println("Success login as a Student!");
        }else{
            System.out.println("Student user not found!");
        }
    }

    private static void adminLogin(Scanner scanner){
        final String USERNAME = "admin123";
        final String PASSWORD = "admin123";

        System.out.println("=== ADMIN LOGIN ===");
        System.out.print("Enter Username: ");
        String Username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String Password = scanner.nextLine();

        if(Username.equals(USERNAME) && Password.equals(PASSWORD)){
            System.out.println("Success login as a Admin!");
        }else{
            System.out.println("Admin user not found!");
        }
    }
}