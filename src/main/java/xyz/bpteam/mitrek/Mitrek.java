/*
        All code copyright (C) BP Team 2019.
        All rights reserved.
        Contact support@bpteam.xyz for more info
*/
package xyz.bpteam.mitrek;

import xyz.bpteam.mitrek.common.ship.data.ShipSaver;
import xyz.bpteam.mitrek.common.tileentity.TileEntityShip;
import xyz.bpteam.mitrek.common.tileentity.TileEntityShipExterior;
import xyz.bpteam.mitrek.common.tileentity.exteriors.TileShipExteriorConstitution;
import xyz.bpteam.mitrek.common.world.InteriorGeneration;
import xyz.bpteam.mitrek.init.ModBlocks;
import xyz.bpteam.mitrek.init.ModDimensions;
import xyz.bpteam.mitrek.init.ModItems;
import xyz.bpteam.mitrek.network.NetworkManager;
import xyz.bpteam.mitrek.proxy.IProxy;
import xyz.bpteam.mitrek.util.Reference;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

import static xyz.bpteam.mitrek.util.handlers.RegistryHandler.registerTileEntity;

@Mod(modid = Mitrek.MODID, name = Mitrek.NAME, version = Mitrek.VERSION,  updateJSON = Mitrek.UPDATEURL)
public class Mitrek {
    public static final String MODID = "mitrek";
    public static final String NAME = "MiTrek";
    public static final String VERSION = "0.0.6";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/bpteammc/mitrek/master/update.json";

    @Mod.Instance
    public static Mitrek instance;

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static FMLCommonHandler FML = FMLCommonHandler.instance();


    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static IProxy proxy;

    /*public static CreativeTabs uniforms = new CreativeTabs("uniforms") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TNG_COMBADGE);
        }
    };*/

    public static CreativeTabs items = new CreativeTabs("items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TOS_PHASER);
        }
    };

    public static CreativeTabs blocks = new CreativeTabs("blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.STARSHIP_HULL);
        }
    };

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        NetworkManager.init();
        ModDimensions.Register();
        registerTileEntity(TileEntityShip.class, "TileShip");
        registerTileEntity(TileEntityShipExterior.class, "TileShipExterior");
        registerTileEntity(TileShipExteriorConstitution.class, "TileShipExteriorConstitution");
        InteriorGeneration.registerConsoleRoom("shiptest", new BlockPos(16, 1, 16));
    }

    @EventHandler
    public void serverStart(FMLServerStartingEvent e) {
        ShipSaver.ships.clear();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
