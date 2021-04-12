package itemcalculator;

import static javax.swing.JOptionPane.*;

public class ItemCalculator {
    
    public static void main(String[] args) {
        
        int quantity1Number;
        int quantity2Number;
        double item1PriceNumber;
        double item2PriceNumber;
        
        //do while loop with try catch for item1 (Quantity)
        String item1name = showInputDialog("Write in name of item 1: ");
        boolean item1Quantity = false;
        boolean item1Price = false;
        do{
            try{
                String inputItem1Quantity = showInputDialog("Write in quantity of item 1 (" + item1name + "): ");
                quantity1Number = Integer.parseInt(inputItem1Quantity);
                item1Quantity = true;
            }
            catch(Exception e){
                quantity1Number = 0;
                showMessageDialog(null,"Wrong quantity input, try again");
            }
        }
        while (!item1Quantity);
        
        //do while loop with try catch for item1 (price)
        do{
            String inputItem1Price = showInputDialog("Write in price of item 1 (" + item1name + "): ");
            try{
                item1PriceNumber = Integer.parseInt(inputItem1Price);
                item1Price = true;
            }
            catch(Exception e){
                item1PriceNumber = 0;
                showMessageDialog(null,"Wrong price input, try again");
            }
        }
        while (!item1Price);
        
        Item basket1 = new Item(item1name,quantity1Number,item1PriceNumber);
        double sum1 = basket1.totalprice();
        
        //do while loop with try catch for item2 (Quantity)
        String item2name = showInputDialog("Write in name of item 2: ");
        boolean item2Quantity = false;
        boolean item2Price = false;
        do{
            try{
                String inputItem2Quantity = showInputDialog("Write in quantity of item 2 (" + item2name + "): ");
                quantity2Number = Integer.parseInt(inputItem2Quantity);
                item2Quantity = true;
            }
            catch(Exception e){
                quantity2Number = 0;
                showMessageDialog(null,"Wrong quantity input, try again");
            }
        }
        while (!item2Quantity);
        
        //boolean item2Price = false;
        do{
            try{
                String inputItem2Price = showInputDialog("Write in price of item 2 (" + item2name + "): ");
                item2PriceNumber = Integer.parseInt(inputItem2Price);
                item2Price = true;
            }
            catch(Exception e){
                item2PriceNumber = 0;
                showMessageDialog(null,"Wrong price input, try again");
            }
        }
        while (!item2Price);
        
   
        Item basket2 = new Item(item2name,quantity2Number,item2PriceNumber);
        double sum2 = basket2.totalprice();
        
        
        double sumTotal = sum1 + sum2;
        
        showMessageDialog(null,"Totalprice of item1: " + quantity1Number + " " + item1name + " for " + sum1 + " kr." +"\n" +
                "Totalprice of item2: " + quantity2Number + " "+ item2name + " for " + sum2 + " kr." + "\n" +
                "Totalprice of item1 and item2 together is " + sumTotal + " kr.");
                    
    }        
}
