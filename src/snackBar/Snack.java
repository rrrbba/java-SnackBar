package snackBar;

public class Snack {

    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack(String name, int quantity, double cost, int vendingId){

        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    //Getter methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCost(){
        return cost;
    }
    public int getVendingId(){
        return vendingId;
    }

    //Setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setVendingId(int vendingId){
        this.vendingId = vendingId;
    }
}
