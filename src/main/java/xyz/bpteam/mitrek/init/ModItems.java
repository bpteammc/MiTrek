package xyz.bpteam.mitrek.init;

import net.minecraft.item.Item;
import xyz.bpteam.mitrek.items.ItemBase;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    //resources
    public static final Item DURANIUM_INGOT = registerItem(new ItemBase(), "duranium_ingot").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item MAGNESITE_CRYSTAL = registerItem(new ItemBase(), "magnesite_crystal").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item ELECTROCERAMICS = registerItem(new ItemBase(), "electroceramics").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item VICTURIUM_INGOT = registerItem(new ItemBase(), "victurium_ingot").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item TRITANIUM_INGOT = registerItem(new ItemBase(), "tritanium_ingot").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item COPPER_INGOT = registerItem(new ItemBase(), "copper_ingot").setGroup(ModItemGroups.MITREK_ITEMS);

    //ship components
    public static final Item WARP_CORE = registerItem(new ItemBase(), "warp_core").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item SHIELD_GENERATOR = registerItem(new ItemBase(), "shield_generator").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item COMPUTER_CORE = registerItem(new ItemBase(), "computer_core").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item EPS_CONDUITS = registerItem(new ItemBase(), "eps_conduits").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item GRAVITY_PLATING = registerItem(new ItemBase(), "gravity_plating").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item PHASER_ARRAY = registerItem(new ItemBase(), "phaser_array").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item ANTI_MATTER_CONVERSION_CHAMBER = registerItem(new ItemBase(), "anti_matter_conversion_chamber").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item LIFE_SUPPORT_SYSTEM = registerItem(new ItemBase(), "life_support_system").setGroup(ModItemGroups.MITREK_ITEMS);
    public static final Item DEFLECTOR_DISH = registerItem(new ItemBase(), "deflector_dish").setGroup(ModItemGroups.MITREK_ITEMS);

    //ship hull templates
    public static final Item CONSTITUTION_SHIP_HULL = registerItem(new ItemBase(), "constitution_ship_hull").setGroup(ModItemGroups.MITREK_ITEMS);



    public static <T extends Item> T registerItem(T item, String name) {
        item.setRegistryName(name);
        ITEMS.add(item);

        return item;
    }
}
