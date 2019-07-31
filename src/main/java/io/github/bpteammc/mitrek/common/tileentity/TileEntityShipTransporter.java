package io.github.bpteammc.mitrek.common.tileentity;

import io.github.bpteammc.mitrek.util.helper.Teleporter;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityShipTransporter extends TileEntity implements ITickable {

    private BlockPos exteriorpos = BlockPos.ORIGIN;
    private int exteriordimension = 0;

    public void ExitShip(EntityPlayerMP player) {
        if(player.dimension != 0)
        {
            world.getMinecraftServer().getPlayerList().transferPlayerToDimension(player, getExteriordimension(), new Teleporter(new BlockPos(pos.getX(), pos.getY(), pos.getZ())));
            player.connection.setPlayerLocation(getExteriorpos().getX(), getExteriorpos().getY() + 1, getExteriorpos().getZ(), 1, 1);
        }
    }

    public BlockPos getExteriorpos() {
        return exteriorpos;
    }

    public int getExteriordimension() {
        return exteriordimension;
    }

    @Override
    public void update() {
        if (!world.isRemote) {
            World dim = world.getMinecraftServer().getWorld(exteriordimension);

        }
    }
}