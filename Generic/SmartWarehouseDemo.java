package generics;

import java.util.*;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items)
            System.out.println(item.getName());
    }
}

public class SmartWarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("AC"));
        electronicsStorage.addItem(new Electronics("Fridge"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Table"));
        furnitureStorage.addItem(new Furniture("chair"));

        System.out.println("Electronics:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("Furniture:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
