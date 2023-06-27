package com.enderio.base;

import com.enderio.api.capability.IOwner;

/**
 * Common NBT Keys.
 * This helps us keep consistency.
 * Names are purposely generic, but shouldn't conflict.
 * NOTE: If you have a highly specific NBT tag, store the keys in the class.
 * For example LootCapacitorData does this.
 */
public class EIONBTKeys {
    // region Common Names

    public static final String LEVEL = "Level";

    public static final String BLOCK_POS = "BlockPos";

    // endregion

    // region Capability Serialized Names

    public static final String ITEMS = "Items";
    public static final String FLUID = "Fluid";
    public static final String ENERGY = "Energy";
    public static final String CAPACITOR_DATA = "CapacitorData";
    public static final String OWNER = "Owner";
    public static final String ENTITY_STORAGE = "EntityStorage";
    public static final String TOGGLE_STATE = "ToggleState";
    public static final String COORDINATE_SELECTION = "CoordinateSelection";
    public static final String DARK_STEEL_UPGRADEABLE = "DarkSteelUpgradable";

    // endregion

    // region Energy Storage

    public static final String ENERGY_STORED = "EnergyStored";
    public static final String ENERGY_MAX_STORED = "MaxEnergyStored";
    public static final String ENERGY_MAX_USE = "MaxEnergyUse";

    // endregion
}
