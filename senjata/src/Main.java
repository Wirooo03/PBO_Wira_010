public class AK47 {
    public float cost = 47.50f;
    public int bullet = 30;
    public float damage = 75f;
    public float money = 100f;
    public float enemyHealth = 100f;

    public void shoot() {
        System.out.println("Brrraaaaaa...");
        enemyHealth -= damage;
        bullet--;
        System.out.println(bullet);
        System.out.println(enemyHealth);
    }

    public void buy() {
        money -= cost;
        System.out.println(money);
    }

    public static void main(String[] args) {
        AK47 gun = new AK47();
        gun.buy();
        gun.shoot();
    }
}

//hewan peliharaan saya senjata AK47 pak