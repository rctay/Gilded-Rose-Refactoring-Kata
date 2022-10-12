package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

/**
 * Single-responsibility
 * Dependency Inversion
 * Open-Closed Principle: "Objects or entities should be open for extension but closed for modification"
 * Liskov Substitution Principle
 * Interface Separation
 */

class GildedRose {
    public List<Item> items;

    public GildedRose() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, int daysRemaining, int quality) {

        Item item = null;

        if (name.equals("normal")) {
            item = new NormalItem(name, daysRemaining, quality);
        } else if (name.equals("Aged Brie")) {
            item = new AgedBrieItem(name, daysRemaining, quality);
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            item = new SulfurasItem(name, daysRemaining, quality);
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item = new BackstagePassesItem(name, daysRemaining, quality);
        } else if (name.equals("Conjured Mana Cake")) {
            item = new ConjuredItem(name, daysRemaining, quality);
        }

        items.add(item);
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }
}
