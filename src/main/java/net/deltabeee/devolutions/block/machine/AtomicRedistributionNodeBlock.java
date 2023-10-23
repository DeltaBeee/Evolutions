package net.deltabeee.devolutions.block.machine;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AtomicRedistributionNodeBlock extends BaseEntityBlock {
    protected AtomicRedistributionNodeBlock(Properties pProperties) {
        super(pProperties);
    }



    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return null;
    }
}
