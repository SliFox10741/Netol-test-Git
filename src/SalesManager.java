public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
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
