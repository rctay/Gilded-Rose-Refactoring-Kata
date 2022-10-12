package com.gildedrose;

public class NormalItem extends Item {
    public static int qualityChangeBeforeSell = -1;
    public static int qualityChangeAfterSell = -2;

    public NormalItem(String name, int daysRemaining, int quality) {
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
