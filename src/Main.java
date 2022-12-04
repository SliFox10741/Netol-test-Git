public class Main {
    public static void main(String[] args) {
        long[] price = {13, 12, 10, 2, 31, 4};
        SalesManager sale = new SalesManager(price);
        long max = sale.max();
        System.out.println("Максимальное значение - " + max);
        long mean = sale.averagevalue();
        System.out.println("Среднее значение - " + mean);
    }
}