public class Main {
    public static void main(String[] args) {
        int[] price = {13, 12, 10, 2, 31, 4};
        SalesManager sale = new SalesManager(price);
        int max = sale.max();
        System.out.println("Максимальное значение - " + max);
    }
}