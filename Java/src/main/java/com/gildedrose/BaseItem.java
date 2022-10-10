package com.gildedrose;

public class BaseItem {

    public String name;

    public int daysRemaining;

    public int quality;
    public int qualityChangeBeforeSell;
    public int qualityChangeAfterSell;

    public BaseItem(String name, int daysRemaining, int quality, int qualityChangeBeforeSell, int qualityChangeAfterSell) {
        this.name = name;
        this.daysRemaining = daysRemaining;
        this.quality = quality;
        this.qualityChangeBeforeSell = qualityChangeBeforeSell;
        this.qualityChangeAfterSell = qualityChangeAfterSell;
    }

    public void updateQuality() {
        if (quality > 0) {
            if (daysRemaining > 0) {
                quality += qualityChangeBeforeSell;
            } else {
                quality += qualityChangeAfterSell;
            }
        }
        daysRemaining -= 1;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.daysRemaining + ", " + this.quality;
    }
}
