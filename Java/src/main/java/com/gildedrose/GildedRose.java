package com.gildedrose;

/**
 * Single-responsibility
 * Dependency Inversion
 * Open-Closed Principle: "Objects or entities should be open for extension but closed for modification"
 * Liskov Substitution Principle
 * Interface Separation
 */

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateItemQuality(items[i]);
        }
    }

    private void updateItemQuality(Item item) {


        BaseItem baseItem = null;

        if (item.name.equals("normal")) {
            baseItem = new NormalItem(item.name, item.daysRemaining, item.quality);
        } else if (item.name.equals("Aged Brie")) {
            baseItem = new AgedBrieItem(item.name, item.daysRemaining, item.quality);
        } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            baseItem = new SulfurasItem(item.name, item.daysRemaining, item.quality);
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            baseItem = new BackstagePassesItem(item.name, item.daysRemaining, item.quality);
        } else if (item.name.equals("Conjured Mana Cake")) {
            baseItem = new ConjuredItem(item.name, item.daysRemaining, item.quality);
        }

        baseItem.updateQuality();
        item.daysRemaining = baseItem.daysRemaining;
        item.quality = baseItem.quality;
    }
}
