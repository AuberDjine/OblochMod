package net.obloch.oblochmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

public class OblochOreBlock extends Block {
    public OblochOreBlock() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).strength(3f, 3f).requiresCorrectToolForDrops());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter level, BlockPos pos) {
        return 0;
    }
}

//Ein Test lol