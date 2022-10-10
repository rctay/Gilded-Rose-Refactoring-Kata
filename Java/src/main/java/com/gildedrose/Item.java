package com.gildedrose;

public class Item {

    public String name;

    public int daysRemaining;

    public int quality;

    public Item(String name, int daysRemaining, int quality) { // qualityChangeByDayBeforeSell qualityChangeAfterSell
        this.name = name;
        this.daysRemaining = daysRemaining;
        this.quality = quality;
    }

    // updateQuality; updates daysRemaining and quality

   @Override
   public String toString() {
        return this.name + ", " + this.daysRemaining + ", " + this.quality;
    }
}
