package com.practices;

import java.util.Scanner;

public class StockMarketAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want to do: /n1.Find Desired Average /n2.Find Average After Purchase");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter present average price of stock: ");
                double presentAverage = scanner.nextDouble();
                System.out.print("Enter price of the stock: ");
                double priceOfStock = scanner.nextDouble();
                System.out.print("Enter quantity of stock purchased: ");
                int quantityPurchased = scanner.nextInt();
                System.out.print("Enter desired average value: ");
                double desiredAverage = scanner.nextDouble();
                int quantityNeeded = calculateQuantityNeeded(presentAverage, priceOfStock, quantityPurchased, desiredAverage);
                System.out.println("You need to purchase " + quantityNeeded + " stocks to achieve the desired average.");
                break;
            case 2:
                System.out.print("Enter quantity of stock purchased: ");
                int quantityPurchased1 = scanner.nextInt();
                System.out.print("Enter price of the stock: ");
                double priceOfStock1 = scanner.nextDouble();
                System.out.println("Stock Want to Buy: ");
                double desiredBuyQuantity = scanner.nextDouble();
                System.out.print("Enter present average price of stock: ");
                double presentAverage1 = scanner.nextDouble();
                double averageBecome = calculateAverageBecome(quantityPurchased1, priceOfStock1, desiredBuyQuantity, presentAverage1);
                System.out.println("Your average after purchasing " + desiredBuyQuantity + " stock is " + averageBecome);
                break;
            default:
                System.out.println("Wrong inpuut");


        }

        scanner.close();

        // Calculate the quantity needed to achieve desired average

    }

    public static int calculateQuantityNeeded(double presentAverage, double priceOfStock, int quantityPurchased, double desiredAverage) {
        int quantityNeeded = (int) Math.ceil(((desiredAverage * (quantityPurchased + 1))
                - (presentAverage * quantityPurchased)) / (priceOfStock - desiredAverage));
        return quantityNeeded;
    }

    public static double calculateAverageBecome(int quantityPurchased1, double priceOfStock1, double desiredBuyQuantity, double presentAverage1) {
        double averageBecome = ((presentAverage1 * quantityPurchased1) + (priceOfStock1 * desiredBuyQuantity)) /
                quantityPurchased1 + desiredBuyQuantity;
        return averageBecome;
    }

}
