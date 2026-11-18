package com.mycompany.mattresssales;

import java.util.Scanner;


interface IProducts {
    int TotalProductSales(int[][] sales);
    double AverageProductSales(int[][] sales);
    String MostPopularProduct(String[] products, int[][] sales);
}

// Product
class Product implements IProducts {

    @Override
    public int TotalProductSales(int[][] sales) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double AverageProductSales(int[][] sales) {
        int total = TotalProductSales(sales);
        double average = total / 9.0;
        return average;
    }

    @Override
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

//  main class 
public class MattressSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];

        // ask the user to type the sales
        for (int i = 0; i < 3; i++) {
            for (int month = 1; month <= 3; month++) {
                System.out.print("Enter number of sales for month " + month + " for " + products[i] + " mattress: ");
                sales[i][month - 1] = input.nextInt();
            }
            System.out.println();
        }

        Product p = new Product();

        int total = p.TotalProductSales(sales);
        double average = p.AverageProductSales(sales);
        String popular = p.MostPopularProduct(products, sales);

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("*******************************************");
        System.out.println("TOTAL PRODUCT SALES: " + total);
        System.out.println("AVERAGE PRODUCT SALES: " + (int) average);
        System.out.println("MOST POPULAR PRODUCT: " + popular);
    }
}