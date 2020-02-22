public class Item {

    //Fields
    private double totalPriceItem;
    private String name;
    private String barcode;
    private String category;

    //Constructor

    public Item(String barcode, String category, String name, double totalPrice){

        this.barcode = barcode;
        this.category = category;
        this.name = name;
        this.totalPriceItem = totalPriceItem;
    }

    @Override
    public String toString() {
        return "Item{" +
                "totalPrice=" + totalPriceItem +
                ", name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public double getTotalPrice() {
        return totalPriceItem;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getCategory() {
            return category;
    }





}



