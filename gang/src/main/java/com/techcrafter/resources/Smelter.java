package com.techcrafter.resources;

public class Smelter {

    public static boolean smelt(ResourceStack dustStack, ResourceStack ingotStack) {
        final int dustNeeded = 9;

        // مطمئن شو dustStack نوع داسته
        if (dustStack.getType().name().startsWith("DUST_") && dustStack.getAmount() >= dustNeeded) {
            String ingotTypeName = dustStack.getType().name().replace("DUST_", "INGOT_");

            if (ingotStack.getType().name().equals(ingotTypeName)) {
                dustStack.consumeAmount(dustNeeded);
                ingotStack.addAmount(1);
                return true;
            }
        }

        return false;
    }
}
