import java.util.Scanner;
public class Problem211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double discount=0, netPrice;

        System.out.print("Insert the name of book : ");
        String book = input.nextLine();
        System.out.print("Insert the price of book : ");
        int price = input.nextInt();

        if (price <= 0) {
            System.out.println("Invalid price");
        } else if (price < 89000) {
            discount = price * 0.12;
        } else {
            discount = price * 0.18;
        }
        input.close();

        netPrice = price - discount;
        
        System.out.println("RECEIPT");
        System.out.println("Book        : " + book);
        System.out.println("Price       : " + price);
        System.out.println("Discount    : " + discount);
        System.out.println("________________________________");
        System.out.println("Net Price   : " + netPrice);

    }
}
