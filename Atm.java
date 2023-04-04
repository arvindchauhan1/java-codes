import java.util.Scanner;
import java.util.File;

class Atm {
    String cust_name = "Arvind";
    int pwd = 1234;
    int cust_id = 22716;
    int balance = 200000;

    void stop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for main menu");
        int t = sc.nextInt();
        return;
    }

    void balance(int p) {
        if (p != pwd) {
            System.out.println("wrong password");
        } else {
            System.out.println("Hello " + cust_name + "\nyour balance is " + balance);
        }
        stop();
    }

    void withdraw(int amt, int p) {
        if (p != pwd) {
            System.out.println("wrong password");
        } else {
            if (balance < amt) {
                System.out.println("You don't have enough balance to withdraw cash");
            } else {
                balance = balance - amt;
                System.out.println("Hello " + cust_name);
                System.out.println(amt + " debited from your account");
                System.out.println("Remaining balance is " + balance);
            }
        }
        stop();
    }

    void change_password(int p1, int p2) {
        if (p1 == pwd) {
            pwd = p2;
            System.out.println(cust_name + "Your password has been updated");
            return;
        }
        System.out.println("Wrong password\npassword update failed");
        stop();
    }

    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Welcome to Swiss Bank\nEnter User ID");
        int id = sc.nextInt();
        System.out.println("Enter your pin");
        int pin = sc.nextInt();
        Atm obj = new Atm();
        if (obj.cust_id == id && pin == obj.pwd) {
            while (true) {
                System.out.println(
                        "\n\nchoose number for its operation \n1.Balance check\n2.withdraw\n3.password change\n4.Print mini statement\n5.exit");
                int ch = sc.nextInt();
                if (ch == 5) {
                    break;
                }
                int p;
                switch (ch) {
                    case 1:
                        System.out.println("Enter password");
                        p = sc.nextInt();
                        obj.balance(p);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        int amt = sc.nextInt();
                        System.out.println("Enter password");
                        p = sc.nextInt();
                        obj.withdraw(amt, p);
                        break;
                    case 3:
                        System.out.println("Enter previous password");
                        int p1 = sc.nextInt();
                        System.out.println("Enter new password");
                        int p2 = sc.nextInt();
                        obj.change_password(p1, p2);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Please Enter correct choice");
                        break;
                }
            }
        } else {
            System.out.println("Invalid user");
        }
        sc.close();
    }

}