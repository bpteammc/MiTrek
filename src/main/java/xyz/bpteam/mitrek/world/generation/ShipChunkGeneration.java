package xyz.bpteam.mitrek.world.generation;

import net.minecraft.world.IWorld;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.WorldGenRegion;

public class ShipChunkGeneration<T extends GenerationSettings> extends ChunkGenerator {
    public ShipChunkGeneration(IWorld worldIn, BiomeProvider biomeProviderIn, GenerationSettings generationSettingsIn) {
        super(worldIn, biomeProviderIn, generationSettingsIn);
    }

    @Override
    public void func_225551_a_(WorldGenRegion p_225551_1_, IChunk p_225551_2_) {

    }

    @Override
    public int getGroundHeight() {
        return 0;
    }

    @Override
    public void makeBase(IWorld worldIn, IChunk chunkIn) {

    }

    @Override
    public int func_222529_a(int p_222529_1_, int p_222529_2_, Heightmap.Type p_222529_3_) {
        return 0;
    }
}