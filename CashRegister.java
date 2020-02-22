import java.util.*;
import java.io.*;
import java.lang.String;

public class CashRegister {

    // TO DO:
    //Calculate different methods.

    //Fields
    private String barcodeFilename;
    private ArrayList<String> listPrice;            //Added from Scanner
    private ArrayList<String> listDiscount;         //Added from Scanner
    private HashSet<Item> items = new HashSet<Item>();
    private ArrayList<Item> itemsArrayList = new ArrayList<Item>();
    private HashSet<Discount> discounts = new HashSet<Discount>();
    private TreeMap<String, Discount> treeMapDiscount = new TreeMap<String, Discount>();
    private TreeMap<String, Item> treeMapItem = new TreeMap<String, Item>();
    private TreeSet<String> treeSetCategory = new TreeSet<String>();
    private TreeSet<String> treeSetName = new TreeSet<String>();

    private TreeMap<String, Item> treeMapName = new TreeMap<>();
    private TreeMap<String, TreeMap<String, Item>> treeMapCategory = new TreeMap<String, TreeMap<String, Item>>();


    //Constructor
    public CashRegister(String priceFilename, String discountFilename) {

        method2Import(discountFilename);
        method2Import2(priceFilename);
    }

    public void method2Import2(String priceFileName) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(priceFileName));
            ArrayList<Item> list_Price = new ArrayList<Item>();
            String line;
            while ((line = bReader.readLine()) != null) {


                String[] listPrice = line.split(",");
                String barcode = listPrice[0];
                String category = listPrice[1];
                String name = listPrice[2];
                double totalPriceItem = Double.parseDouble(listPrice[3]) + (Double.parseDouble(listPrice[4]) / 100);
                Item itemInfo = new Item(barcode, category, name, totalPriceItem);
                treeMapItem.put(barcode, itemInfo); //
                items.add(new Item(barcode, category, name, totalPriceItem)); // not used - Maybe delete

                treeMapName.put(name,itemInfo); //Right now sorts by name first then Category
                treeMapCategory.put(category, treeMapName);   //Right now sorts by name first then Category
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }

    }




    public void method2Import(String discountfileName) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(discountfileName));
            ArrayList<Discount> list_Discount = new ArrayList<Discount>();
            String line;
            while ((line = bReader.readLine()) != null) {

                String[] listPrice = line.split(",");
                String barcode = listPrice[0];
                String limit = listPrice[1];
                double totalPriceDiscount = Double.parseDouble(listPrice[3]) + (Double.parseDouble(listPrice[4]) / 100);

                Discount discountInfo = new Discount(barcode, limit, totalPriceDiscount);
                treeMapDiscount.put(barcode, discountInfo);
                discounts.add(new Discount(barcode, limit, totalPriceDiscount)); // Not used - Maybe delete
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }

    }

    public void sortArrayListItem() {}


    public void printTreeSetCategory() {
        System.out.println(treeSetCategory);
    }

    public void printCategory() {
        for (Item item : items) {
            System.out.println(item.getCategory());
        }
    }

    public void printBarcode() {
        for (Item item : items) {
            System.out.println(item.getBarcode());
        }
    }

    public void printTotalPrice() {
        for (Item item : items) {
            System.out.println(item.getTotalPrice());
        }
    }

    public void printName() {
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    public void printTMDiscount() {

        System.out.println(treeMapDiscount);
    }

    public void printTMItem() {

        System.out.println(treeMapItem);
    }


    public void printLimit() {
        for (Discount discount : discounts) {
            System.out.println(discount.getLimit());
        }
    }

    public void printTreeMapCategory(){
        System.out.println(treeMapCategory);
    }

    public void printReceipt(String barcodeFilename) {

        Receipt receipt = new Receipt();
        receipt.printReciept2();
    }

    public void printItemList(){
        System.out.println(items);
    }




}






     /*   try {
            listPrice = new ArrayList<String>();
            listDiscount = new ArrayList<String>();
            Scanner sc1 = new Scanner(Paths.get(priceFilename));
            Scanner sc2 = new Scanner(Paths.get(discountFilename));

            while (sc1.hasNextLine()) {
                listPrice.add(sc1.nextLine());
            }
            sc1.close();
            while (sc2.hasNextLine()) {
                listDiscount.add(sc2.nextLine());
            }

            sc2.close();
            //addItems(listPrice, items);
            // addItems(listDiscount, discount);

        } catch (IOException e) {
            //  e.printStackTrace();
        } catch (IndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }

    }
*/



         /*




        }
    }
    */

