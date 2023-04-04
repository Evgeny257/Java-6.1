package ru.netology.stats;
public class StatsService {
    public int sumSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return (int) sumSales;
    }
    public int averageSum(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        long averageSum = sumSales / 12;
        return (int) averageSum;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }
    public int lessAverageSales(long[] sales) {
        int lessMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum(sales)) {
                lessMonth = lessMonth + 1;
            }
        }
        return lessMonth;
    }
    public int moreAverageSales(long[] sales) {
        int moreMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum(sales)) {
                moreMonth = moreMonth + 1;
            }
        }
        return moreMonth;
    }
}
