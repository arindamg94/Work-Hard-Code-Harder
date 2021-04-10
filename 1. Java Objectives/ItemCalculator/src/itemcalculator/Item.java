package itemcalculator;

public class Item {
    private String name;
    private int quantity;
    private double price;

    // constructor with all attributes
    public Item(String name, int quantity, double price){
        this.name = name;
        //this.quantity = quantity;
        //this.price = price;
        setQuantity(quantity);
        setPrice(price);
    }
    
    // get / set metoder for Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    // get / set metoder for quantity
    public int getQuantity(){
            return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity > 0){
         this.quantity = quantity;
        }
    }    
    
    // get / set metoder for price
    public double getPrice(){
            return price;
    }
    public void setPrice(double price){
     if (price > 0){
         this.price = price;
        }
    }    
    
    //Caulculate total price
    public double totalprice(){
            return price*quantity;
    }

}
