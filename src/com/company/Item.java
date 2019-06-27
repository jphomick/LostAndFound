package com.company;

public class Item {
    private int itemId;
    private String name;
    private String category;
    private boolean lost;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void claim() {
        lost = false;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public Item(int itemId, String name, String category) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        lost = false;
    }
}
