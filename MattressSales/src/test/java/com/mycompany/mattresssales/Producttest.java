
package com.mycompany.mattresssales;

/**
 *
 * @author Student kename oreratile
 */
public class Producttest {
   


    public int TotalProductSales(int[][] sales) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    public double AverageProductSales(int[][] sales) {
        int total = TotalProductSales(sales);
        double average = total / 9.0;
        return average;
    }

    public String MostPopularProduct(String[] products, int[][] sales) {
        int biggest = sales[0][0];
        String bestProduct = products[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sales[i][j] > biggest) {
                    biggest = sales[i][j];
                    bestProduct = products[i];
                }
            }
        }
        return bestProduct + "(" + biggest + ")";
    }
}
    

