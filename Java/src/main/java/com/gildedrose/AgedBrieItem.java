package com.gildedrose;

public class AgedBrieItem extends BaseItem {

    public AgedBrieItem(String name, int daysRemaining, int quality) {
        super(name, daysRemaining, quality);
    }

    @Override
    void updateQuality() {

        daysRemaining -= 1;
        if (daysRemaining < 0) {
            quality += 2;
        } else {
            quality += 1;
        }
        if (quality > 50) {
            quality = 50;
        }
    }
}
