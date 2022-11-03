public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = 999;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int averagevalue(){
        int srednee = 0;
        for (int sale : sales) {
            srednee += sale;
        }
        srednee = (srednee - max() - min())/(sales.length - 2);
        return srednee;
    }
}
