package com.company;

import java.util.ArrayList;

public class LostItem {

    String[] clothing = new String[3];
    ArrayList<Item> items= new ArrayList<>();
    ArrayList<Item> deleted= new ArrayList<>();


    public boolean addItem (Item item) {
        boolean isIn = false;
        for (Item i : items) {
            if (i.getItemId() == item.getItemId()) {
                isIn = true;
            }
        }
        if (!isIn) {
            items.add(item);
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteItem (int id) {
        Item toDelete=null;

        for (Item i : items) {
            if (id == i.getItemId()) {
                toDelete = i;
            }
        }

        if (toDelete == null)
        {
            return false;
        } else {
            items.remove(toDelete);
            deleted.add(toDelete);
            return true;
        }
    }


    public boolean undeleteItem (int id)

    {
        Item toUndelete = null;

        for (Item i : deleted)
        {
            if (id == i.getItemId())
            {
                toUndelete = i;
            }
        }

        if (toUndelete == null) {
            return false;
        } else {
            deleted.remove(toUndelete);
            items.add(toUndelete);
            return true;
        }
    }

    private int itemsIn (String category)
    {
        int count=0;
        for (Item i: items) {
            if (i.getCategory().equals(category) && i.isLost()) {
                count++;
            }
        }
        return count;
    }

    public void displayCat() {
        ArrayList<String> seen=new ArrayList<>();
        if (items.size() == 0) {
            System.out.println("There are no items.");
        } else {
            System.out.println("Missing items:");
            for (Item i : items) {
                if (!seen.contains(i.getCategory())) {
                    seen.add(i.getCategory());
                    int count = itemsIn(i.getCategory());
                    System.out.println(count + " " + i.getCategory() + " missing");
                }
            }
        }
    }

    public Item findItem(int id) {
        for (Item i : items) {
            if (i.getItemId() == id) {
                return i;
            }
        }
        return null;
    }
}
