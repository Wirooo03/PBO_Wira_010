public class SavingBonds {
    int bond;
    double price, balance, interest, totalPrice;
    SavingBonds (int bond, double price, double balance){
        this.bond = bond;
        this.price = price;
        this.balance = balance;
    }

    public void showInterest(){
        for(int i = 1; i <= bond; i++){
            switch(i){
                case 1,2,3,4,5,6,7,8,9,10,11:
                    interest = price/bond + price * 0.5/100;
                    break;
                case 12,13,14,15,16,17,18,19,20,21,22:
                    interest = price/bond + price * 1/100;
                    break;
                case 23,24,25,26,27,28,29,30,31,32,33:
                    interest = price/bond + price * 1.5/100;
                    break;
            }
            totalPrice += interest;
            if(balance < totalPrice){
                System.out.printf("(Month %d) Paymnet failed! Your balance is not enough!", i);
                break;
            }else{
                balance -= interest;
                System.out.printf("(Month %d) you pay $%.2f || Your balance now: $%.2f\n", i, interest, balance);
                //System.out.println("(Month" + i + ") you pay: $" + interest + "Your balance now: $" + balance);
            }
        }
        if(balance >= totalPrice){
            System.out.printf("Payment done! Normal price: $%.2f || %d Month bond total price: $%.2f", price, bond, totalPrice);
        }
    }
}
