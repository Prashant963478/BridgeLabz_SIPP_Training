package generics_package;

import java.util.*;

//Category interface
interface Category {
 String getCategoryName();
}

//Book Category
class BookCategory implements Category {
 private String genre;
 BookCategory(String genre) {
     this.genre = genre;
 }
 public String getCategoryName() {
     return "Book: " + genre;
 }
}

//Clothing Category
class ClothingCategory implements Category {
 private String type;
 ClothingCategory(String type) {
     this.type = type;
 }
 public String getCategoryName() {
     return "Clothing: " + type;
 }
}

//Gadget Category
class GadgetCategory implements Category {
 private String brand;
 GadgetCategory(String brand) {
     this.brand = brand;
 }
 public String getCategoryName() {
     return "Gadget: " + brand;
 }
}

//Generic Product class
class Product<T extends Category> {
 private String name;
 private double price;
 private T category;

 Product(String name, double price, T category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public String getName() { return name; }
 public double getPrice() { return price; }
 public T getCategory() { return category; }

 public void setPrice(double price) {
     this.price = price;
 }

 public String toString() {
     return name + " | ₹" + price + " | " + category.getCategoryName();
 }
}

public class DynamicOnlineMarketplace {

 //Generic Method to apply discount
 public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
     double discountAmount = product.getPrice() * percentage / 100;
     product.setPrice(product.getPrice() - discountAmount);
 }

 public static void main(String[] args) {
	 
     //Creating Products
     Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory("Programming"));
     Product<ClothingCategory> shirt = new Product<>("Denim Shirt", 1200, new ClothingCategory("Men"));
     Product<GadgetCategory> phone = new Product<>("Smartphone X", 25000, new GadgetCategory("TechBrand"));

     //Catalog to store all types of products
     List<Product<? extends Category>> catalog = new ArrayList<>();
     catalog.add(book);
     catalog.add(shirt);
     catalog.add(phone);

     //Display before discount
     System.out.println("=== Before Discount ===");
     for (Product<? extends Category> p : catalog) {
         System.out.println(p);
     }

     //Apply Discounts
     applyDiscount(book, 10);   
     applyDiscount(shirt, 15);    
     applyDiscount(phone, 5);     

     //Display after discount
     System.out.println("\n=== After Discount ===");
     for (Product<? extends Category> p : catalog) {
         System.out.println(p);
     }
 }
}
