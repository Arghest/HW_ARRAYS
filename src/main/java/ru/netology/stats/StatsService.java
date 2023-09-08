package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        long averageSales = sum(sales) / 12;
        return averageSales;
    }

    public int maxMonth(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }


        }
        return monthMax + 1;
    }

    public int minMonth(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }


        }
        return monthMin + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
