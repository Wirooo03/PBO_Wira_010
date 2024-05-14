import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        int i = 1;
        while (true){
            System.out.printf("Masukkan Nama Mahasiswa ke-%d: ", i);
            String nama;
            nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("selesai")){
                break;
            }else if(!nama.equals("")){
                namaMahasiswa.add(nama);
            }

            try {
                validName(nama);
            } catch (invalidNameException e) {
                System.out.println(e.getMessage());
                i--;
            }
            i++;
        }

        System.out.printf("\nDaftar Nama Mahasiswa:\n");
        for (String nama : namaMahasiswa){
            System.out.println("- " + nama);
        }
    }

    public static boolean validName(String nama) throws invalidNameException{
        if(nama.equals("")){
            throw new invalidNameException ("Error: Nama tidak boleh kosong");
        }
        return true;
    }
}