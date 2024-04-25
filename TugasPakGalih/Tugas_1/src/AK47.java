public class AK47 {
    public float myMoney = 100f;
    public float gunCost = 47.50f;
    public int gunBullet = 30;
    public float gunDamage = 75f;
    public float enemyHealth = 100f;
    public void buy() {
        System.out.println("Your money: " + myMoney + "$");
        System.out.println("Purchasing a gun (" + myMoney + "$ - " + gunCost + "$)");
        myMoney -= gunCost;
        System.out.println("Your money: " + myMoney + "$\n");
    }
    public void shoot() {
        System.out.println("Your bullet: " + gunBullet);
        System.out.println("Enemy health: " + enemyHealth);
        System.out.println("AK47 is shooting: Brrraaa");
        gunBullet--;
        enemyHealth -= gunDamage;
        System.out.println("Your bullet: " + gunBullet);
        System.out.println("Enemy health: " + enemyHealth);
    }
}

//hewan peliharaan saya senjata AK47 pak