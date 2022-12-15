package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Iphone","Shoes","Skirt"};
        double[] prices = {350.0,    23.5,  15.99 };
        int[] itemsIDs =  {12345,    36547 , 78954};
        String[] report = new String[itemsIDs.length+prices.length+items.length];
        //itemname -itemid - price
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            int itemid = itemsIDs[i];
            double price = prices[i];

            System.out.println(item+"-"+itemid+"-$"+price);
        }

    }
}
