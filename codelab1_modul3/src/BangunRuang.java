public class BangunRuang {
    protected double luasPermukaan;
    private String name;

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("===== Input nilai " + name + " =====");
    }

    public void luasPermukaan(){
        System.out.println("Luas permukaan bangun " + name + " adalah: ");
    }

    public void volume(){
        System.out.println("Volume bangun " + name + " adalah: ");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
