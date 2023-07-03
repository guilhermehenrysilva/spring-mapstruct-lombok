package com.example.demo.delivery.fixture;

import com.example.demo.delivery.model.Item;

import java.util.Arrays;
import java.util.List;

public class ItemFixture {

    public static Item item () {
        Item item = new Item();
        item.setId(100L);
        item.setDescription("Pastel");
        item.setPrice(5L);
        item.setQuantity(2);
        item.checkTotal();

        return item;
    }

    public static List<Item> itemList () {
        Item itemA = item();
        itemA.setDescription("Coca Cola");
        itemA.setPrice(8L);
        itemA.setQuantity(1);
        itemA.checkTotal();

        Item itemB = item();
        itemB.setDescription("Coxinha");
        itemB.setPrice(5L);
        itemB.setQuantity(1);
        itemB.checkTotal();

        return Arrays.asList(item(), itemA, itemB);
    }
}
