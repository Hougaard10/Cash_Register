public class Discount {



    //Fields
    private double totalPriceDiscount;
    private int limit;
    private String barcode;

    //Watch out that totalPrice in Discount and Item doesn't get mixed

    //Constructor
    public Discount (String barcode, String limit, double totalPriceDiscount){

            this.barcode = barcode;
            this.limit = Integer.parseInt(limit);
            this.totalPriceDiscount = totalPriceDiscount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "totalPrice=" + totalPriceDiscount +
                ", limit=" + limit +
                ", barcode='" + barcode + '\'' +
                '}';
    }

    public double getTotalPriceDiscount(){
        return totalPriceDiscount;
    }

    public int getLimit() {
        return limit;
    }

    public String getBarcode() {
        return barcode;
    }




}
