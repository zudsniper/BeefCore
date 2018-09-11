package cc.holstr.helper;

import net.minecraft.util.math.ChunkPos;

public class ChunkHelper {
    public static long getChunkXZHash(ChunkPos pos) {
        return ChunkPos.asLong(pos.x >> 4, pos.z >> 4);
    }
}
