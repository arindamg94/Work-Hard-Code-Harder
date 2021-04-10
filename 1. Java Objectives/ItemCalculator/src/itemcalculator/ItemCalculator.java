package itemcalculator;

import static javax.swing.JOptionPane.*;

public class ItemCalculator {
    
    public static void main(String[] args) {
        
        String item1name = showInputDialog("Write in name of item 1: ");
                
        int quantity1Number;
        double item1PriceNumber;
        
        //boolean item1Quantity = false;
        //while (!item1Quantity) {
            try{
                String inputItem1Quantity = showInputDialog("Write in quantity of item 1: ");
                quantity1Number = Integer.parseInt(inputItem1Quantity);
                //item1Quantity = true;   
            }
            catch(Exception e){
                quantity1Number = 0;
                showMessageDialog(null,"Wrong quantity, try again");
            }
        //}
        
       //boolean item1Price = false;
        //while (!item1Price) {
            try{
                String inputItem1Price = showInputDialog("Write in price of item 1: ");
                item1PriceNumber = Integer.parseInt(inputItem1Price);
                //item1Price = true;
           }
            catch(Exception e){
                
                item1PriceNumber = 0;
                showMessageDialog(null,"Wrong quantity, try again");
            }
        //}
        
       Item basket1 = new Item(item1name,quantity1Number,item1PriceNumber);
       double sum = basket1.totalprice();
       showMessageDialog(null,"Totalprice of " + quantity1Number + " " + item1name + ": " + sum + " kr");     
        
   
                        
    }        
}
