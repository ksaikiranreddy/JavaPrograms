package com.demoproject.practice;

import java.util.Scanner;

public class Plotsale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int nplots = sc.nextInt();
            int ncost=sc.nextInt();
            int[] line2 = new int[nplots];
            for(int j=0;i<nplots;j++)
                 line2[j] = sc.nextInt();
            royPlots(line2);
            //System.out.println(profit);
        }

    }

    private static void royPlots(int[] line2) throws NumberFormatException{
       // int profit;

          for(int i = 0; i < line2.length; i++)
            System.out.println(line2[i] + " ");
 //               int buy = 0;
  //              int nplots=Integer.parseInt(nc[0]);
  //              int cprice=Integer.parseInt(nc[1]);
//                int sale = nplots*cprice;
//                for (int i = 0; i < Integer.parseInt(nc[0]); i++) {
//                    buy = buy + Integer.parseInt(pv[i]);
//                }
//                if (sale > buy) {
//                    profit = sale - buy;
//                    return profit;
//                } else {
//                    return 0;
//                }
            }
}