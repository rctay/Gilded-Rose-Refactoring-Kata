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
        }

        if (baseItem != null) {
            baseItem.updateQuality();
            item.daysRemaining = baseItem.daysRemaining;
            item.quality = baseItem.quality;
            return;
        }

        // future: delete below


        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.daysRemaining < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.daysRemaining < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.daysRemaining = item.daysRemaining - 1;
        }

        if (item.daysRemaining < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = item.quality - item.quality;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }
}
