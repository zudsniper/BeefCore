package cc.holstr.helper;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class BlockPosHelper {

    public static int getChunkX(BlockPos pos) { return pos.getX() >> 4; }
    public static int getChunkZ(BlockPos pos) { return pos.getY() >> 4; }

    public static EnumFacing getDirectionFromSourceCoords(BlockPos myPos, BlockPos sourcePos) {
        if(myPos.getX() < sourcePos.getX()) { return EnumFacing.WEST; }
        else if(myPos.getX() > sourcePos.getX()) { return EnumFacing.EAST; }
        else if(myPos.getY() < sourcePos.getY()) { return EnumFacing.DOWN; }
        else if(myPos.getY() > sourcePos.getY()) { return EnumFacing.UP; }
        else if(myPos.getZ() < sourcePos.getZ()) { return EnumFacing.SOUTH; }
        else if(myPos.getZ() > sourcePos.getZ()) { return EnumFacing.NORTH; }
        else { return null; }
    }

    public static  EnumFacing getOppositeDirectionFromSourceCoords(BlockPos myPos, BlockPos sourcePos) {
        if(myPos.getX() < sourcePos.getX()) { return EnumFacing.EAST; }
        else if(myPos.getX() > sourcePos.getX()) { return EnumFacing.WEST; }
        else if(myPos.getY() < sourcePos.getY()) { return EnumFacing.UP; }
        else if(myPos.getY() > sourcePos.getY()) { return EnumFacing.DOWN; }
        else if(myPos.getZ() < sourcePos.getZ()) { return EnumFacing.NORTH; }
        else if(myPos.getZ() > sourcePos.getZ()) { return EnumFacing.SOUTH; }
        else { return null; }
    }

}
