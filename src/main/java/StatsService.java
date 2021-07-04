package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж

    public int allSalesSum(int[] allSales) {
        int sum = 0;

        for (int value : allSales) {
            sum += value;

        }
        return sum;
    }

    //Средняя сумма продаж в месяц

    public int averageSales(int[] allSales) {
        int averageSales = allSalesSum(allSales) / allSales.length;
        return averageSales;
    }

    //Номер месяца, в котором был пик продаж

    public int maximumSale(int[] allSales) {

        int month = 0;
        int monthMaxSale = allSales[0];
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] >= monthMaxSale) {
                monthMaxSale = allSales[i];
                month = i + 1;
            }
        }
        return month;
    }

    //Номер месяца, в котором был минимум продаж

    public int minimumSale(int[] allSales) {
        int month = 0;
        int monthMinSale = allSales[0];
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] <= monthMinSale) {
                monthMinSale = allSales[i];
                month = i + 1;
            }
        }
        return month;

    }

    //Количество месяцев с продажами ниже среднего

    public int monthBelowAverageSales(int[] allSales) {
        int numberOfMonth = 0;
        for (int value : allSales) {
            if (value < averageSales(allSales)) {
                numberOfMonth += 1;
            }
        }
        return numberOfMonth;

    }

    //Количество месяцев с продажами выше среднего

    public int monthUnderAverageSales(int[] allSales) {
        int numberOfMonth = 0;
        for (int value : allSales) {
            if (value > averageSales(allSales)) {
                numberOfMonth += 1;
            }
        }
        return numberOfMonth;

    }

}
