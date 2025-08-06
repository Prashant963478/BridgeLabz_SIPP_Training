package generics_package;

import java.util.*;

//Abstract base class 
abstract class WarehouseItem {
 String name;

 //Constructor
 public WarehouseItem(String name) {
     this.name = name;
 }

 //Abstract method 
 public abstract String getDetails();

 //Printing the object
 public String toString() {
     return getDetails();
 }
}

//Subclass
class Electronics extends WarehouseItem {
 public Electronics(String name) {
     super(name);
 }

 public String getDetails() {
     return "Electronics: " + name;
 }
}

//Subclass
class Groceries extends WarehouseItem {
 public Groceries(String name) {
     super(name);
 }

 public String getDetails() {
     return "Groceries: " + name;
 }
}

//Subclass
class Furniture extends WarehouseItem {
 public Furniture(String name) {
     super(name);
 }

 public String getDetails() {
     return "Furniture: " + name;
 }
}

//Generic storage class 
class Storage<T extends WarehouseItem> {
 private List<T> items = new ArrayList<>();

 //Add item to the storage
 public void addItem(T item) {
     items.add(item);
 }

 //Return all items in the storage
 public List<T> getItems() {
     return items;
 }
}

//Utility class 
class WarehouseUtils {
	
 //Display all items using a wildcard 
 public static void displayAllItems(List<? extends WarehouseItem> items) {
     for (WarehouseItem item : items) {
         System.out.println(item);
     }
 }
}

//Main class
public class SmartWarehouseManagementSystem {
 public static void main(String[] args) {
	 
     // Create storage for different item types
     Storage<Electronics> electronicsStorage = new Storage<>();
     Storage<Groceries> groceriesStorage = new Storage<>();
     Storage<Furniture> furnitureStorage = new Storage<>();

     //Add electronics
     electronicsStorage.addItem(new Electronics("Laptop"));
     electronicsStorage.addItem(new Electronics("TV"));

     //Add groceries
     groceriesStorage.addItem(new Groceries("Rice"));
     groceriesStorage.addItem(new Groceries("Milk"));

     //Add furniture
     furnitureStorage.addItem(new Furniture("Chair"));
     furnitureStorage.addItem(new Furniture("Table"));

     //Display all items by category
     System.out.println("All Electronics:");
     WarehouseUtils.displayAllItems(electronicsStorage.getItems());

     System.out.println("\nAll Groceries:");
     WarehouseUtils.displayAllItems(groceriesStorage.getItems());

     System.out.println("\nAll Furniture:");
     WarehouseUtils.displayAllItems(furnitureStorage.getItems());
 }
}
