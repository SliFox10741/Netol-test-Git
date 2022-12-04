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

    public long min() {
        long min = 999;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long averagevalue() {
        long mean = 0;
        for (long sale : sales) {
            mean += sale;
        }
        mean = (mean - max() - min()) / (sales.length - 2);
        return mean;
    }
}
