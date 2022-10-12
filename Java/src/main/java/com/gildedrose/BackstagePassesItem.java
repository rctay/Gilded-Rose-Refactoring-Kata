package com.gildedrose;

public class BackstagePassesItem extends Item {

    public BackstagePassesItem(String name, int daysRemaining, int quality) {
        super(name, daysRemaining, quality);
    }

    @Override
    void updateQuality() {
        daysRemaining -= 1;
        if (daysRemaining < 0) {
            quality = 0;
        } else if (daysRemaining <= 4) {
            quality += 3;
        } else if (daysRemaining <= 9) {
            quality += 2;
        } else {
            quality += 1;
        }
        if (quality >= 50) {
            quality = 50;
        }
    }
}
