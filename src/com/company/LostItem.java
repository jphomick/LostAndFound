package com.company;

import java.util.ArrayList;

public class LostItem {

    String[] clothing = new String[3];
    ArrayList<Item> items= new ArrayList<>();
    ArrayList<Item> deleted= new ArrayList<>();


public boolean addItem (Item item) {
    boolean isin = false;
    for (Item i : items) {
        if (i.getItemId() == item.getItemId()) {
            isin = true;


        }
    }
    if (!isin) {
        items.add(item);
        return true;


    } else {
        return false;

    }

}
public boolean deleteItem (int id)

    {
        Item toDelete=null;

        for (Item i : items)
        {
            if (id == i.getItemId())
            {
             toDelete=i;


            }

        }
        if (toDelete==null)
        {
            return false;

        }else
        {
            items.remove(toDelete);
            deleted.add(toDelete);
            return true;
        }



    }
    public boolean undeleteItem (int id)

    {
        Item toUndelete=null;

        for (Item i : deleted)
        {
            if (id == i.getItemId())
            {
                toUndelete=i;


            }

        }
        if (toUndelete==null)
        {
            return false;

        }else
        {
            deleted.remove(toUndelete);
            items.add(toUndelete);
            return true;
        }



    }
    public int itemsIn (String cat)
    {
        int count=0;
        for (Item i: items)

        {
            if (i.getCat().equals (cat))
            {
                count ++;

            }


        }
        return count;


    }
    public void displayCat()
    {
        ArrayList<String> seen=new ArrayList<>();
        System.out.println("there are") ;
        if (items.size()==0)
        {
            System.out.println("There are no items .");
        } else
        {
            for (Item i : items )
            {
                if (!seen.contains(i.getCat()))
                {
                seen.add(i.getCat());
                int count=itemsIn(i.getCat());
                    System.out.println(count + " " + i.getCat() + " ");
                }
            }
        }


    }
}
