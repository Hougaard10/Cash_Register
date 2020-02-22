import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        CashRegister cash = new CashRegister("input/prices.txt", "input/discounts.txt");


        cash.printReceipt("input/bar.txt");
       // cash.printTotalPrice();
       // cash.printTMItem();

        //cash.printCategory();
        //cash.printLimit();
      //  cash.printTreeSetCategory();
       // cash.printItemList();
        cash.printTreeMapCategory();   }
 }







