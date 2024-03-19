import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double rusuk;

    Kubus(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.println("Input panjang rusuk: ");
        rusuk = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * rusuk * rusuk;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(rusuk, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
