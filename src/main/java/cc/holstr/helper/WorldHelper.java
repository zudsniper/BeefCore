package cc.holstr.helper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldHelper {



    public static boolean checkChunksExist(World world, BlockPos min, BlockPos max) {
        for(int x = min.getX(); x < max.getX(); x++) {
            for(int z = min.getZ(); z < max.getZ(); z++) {
                if(!world.isChunkGeneratedAt(x,z)) {
                    return false;
                }
            }
        }
        return true;
    }

}
