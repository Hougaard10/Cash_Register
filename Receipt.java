public class Receipt {

    private int total;      // with discount
    private int subtotal;   //  w/o discount
    private int mærker;     // 1 mærke per 50kr spent
    private int rabat;      //If limit is fulfilled


    public Receipt() {
        CashRegister cash = new CashRegister("input/prices.txt", "input/discounts.txt");

    }


    public void printReciept2(){
        System.out.println("Så vi i gang!");



    }


    public void calculateMærker() { // Or just divide by 50 in SYSO at the end.  (math.floor)
        mærker = 0;
        // int total = 500; only for testing
        int mærkeGrundlag = total;
        while (mærkeGrundlag >= 50) {
            mærker = mærker + 1;
            mærkeGrundlag = mærkeGrundlag - 50;

        }
        System.out.println(mærker);
    }

}




