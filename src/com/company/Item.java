package com.company;

public class Item {
    int itemId;
    String name;
    String cat;
    boolean lost=true;

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

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public boolean isLost() {
        return lost;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public Item(int itemId, String name, String cat) {
        this.itemId = itemId;

        this.name = name;
        this.cat = cat;
    }
}
