public class TestAccount {
int balance = 1000;
void modifyBalance (int balance){
    balance = balance - 100;
    System.out.println(balance);
    System.out.println(this.balance);
}

    public static void main(String[] args) {
        new TestAccount().m1();
    }

    private void m1(){
    modifyBalance(500);
        System.out.println(balance);
    }

}
