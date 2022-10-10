package com.gildedrose;

public class ConjuredItem extends BaseItem {

    public static int qualityChangeBeforeSell = -2;
    public static int qualityChangeAfterSell = -4;

    public ConjuredItem(String name, int daysRemaining, int quality) {
        super(name, daysRemaining, quality);
    }

    @Override
    void updateQuality() {
        if (quality > 0) {
            if (daysRemaining > 0) {
                quality += qualityChangeBeforeSell;
            } else {
                quality += qualityChangeAfterSell;
            }
        }
        daysRemaining -= 1;
    }
}
