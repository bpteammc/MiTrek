package me.ukminecrafted.mitrek.init;

import me.ukminecrafted.mitrek.blocks.BlockBase;
import me.ukminecrafted.mitrek.blocks.BlockDilithiumCrystal;
import me.ukminecrafted.mitrek.blocks.BlockShipConstructor;
import me.ukminecrafted.mitrek.items.MItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block DILITHIUM_BLOCK = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "dilithium_block").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block DURANIUM_BLOCK = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "duranium_block").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block TRITANIUM_BLOCK = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "tritanium_block").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block DURANIUM_ORE = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "duranium_ore").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block MAGNESITE_ORE = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "magnesite_ore").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block VICTURIUM_ORE = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "victurium_ore").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block TRITANIUM_ORE = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "tritanium_ore").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block COPPER_ORE = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "copper_ore").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block DILITHIUM_CRYSTAL = registerBlock(new BlockDilithiumCrystal(Block.Properties.create(Material.GLASS).lightValue(10).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.5f).sound(SoundType.GLASS).harvestLevel(1)), "dilithium_crystal").setGroup(ModItemGroups.MITREK_BLOCKS);
    public static final Block SHIP_CONSTRUCTOR = registerBlock(new BlockShipConstructor(Block.Properties.create(Material.IRON)), "ship_constructor").setGroup(ModItemGroups.MITREK_BLOCKS);


    public static BlockBase registerBlock(BlockBase base, String name) {
        base.setRegistryName(name);
        BLOCKS.add(base);

        MItemBlock itemBlock = (MItemBlock) new MItemBlock(base).setRegistryName(name);
        base.setmItemBlock(itemBlock);
        ModItems.ITEMS.add(itemBlock);

        return base;
    }
}
