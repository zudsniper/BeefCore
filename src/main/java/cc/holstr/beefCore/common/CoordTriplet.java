//package cc.holstr.beefCore.common;
//
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.ChunkPos;
//import net.minecraft.world.ChunkCoordIntPair;
//import net.minecraftforge.common.util.ForgeDirection;
//
///*
// * Simple wrapper class for XYZ coordinates.
// */
//@Deprecated
//public class CoordTriplet implements Comparable {
//	public int x, y, z;
//
//	public CoordTriplet(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//
//	public int getChunkX() { return x >> 4; }
//	public int getChunkZ() { return z >> 4; }
//	public long getChunkXZHash() {
//		return ChunkPos.asLong(x >> 4, z >> 4); }
//
//	@Override
//	public boolean equals(Object other) {
//		if(other == null)
//		{ return false; }
//		else if(other instanceof CoordTriplet) {
//			CoordTriplet otherTriplet = (CoordTriplet)other;
//			return this.x == otherTriplet.x && this.y == otherTriplet.y && this.z == otherTriplet.z;
//		}
//		else {
//			return false;
//		}
//	}
//
//	//same as BlockPos.offset(EnumFacing)
//	public void translate(ForgeDirection dir) {
//		this.x += dir.offsetX;
//		this.y += dir.offsetY;
//		this.z += dir.offsetZ;
//	}
//
//	public boolean equals(int x, int y, int z) {
//		return this.x == x && this.y == y && this.z == z;
//	}
//
//	// Suggested implementation from NetBeans 7.1
//	public int hashCode() {
//		int hash = 7;
//		hash = 71 * hash + this.x;
//		hash = 71 * hash + this.y;
//		hash = 71 * hash + this.z;
//		return hash;
//	}
//
//	public CoordTriplet copy() {
//		return new CoordTriplet(x, y, z);
//	}
//
//	public void copy(CoordTriplet other) {
//		this.x = other.x;
//		this.y = other.y;
//		this.z = other.z;
//	}
//
//	public CoordTriplet[] getNeighbors() {
//		return new CoordTriplet[]{
//			new CoordTriplet(x + 1, y, z),
//			new CoordTriplet(x - 1, y, z),
//			new CoordTriplet(x, y + 1, z),
//			new CoordTriplet(x, y - 1, z),
//			new CoordTriplet(x, y, z + 1),
//			new CoordTriplet(x, y, z - 1)
//		};
//	}
//
//	///// IComparable
//
//	@Override
//	public int compareTo(Object o) {
//		if(o instanceof CoordTriplet) {
//			CoordTriplet other = (CoordTriplet)o;
//			if(this.x < other.x) { return -1; }
//			else if(this.x > other.x) { return 1; }
//			else if(this.y < other.y) { return -1; }
//			else if(this.y > other.y) { return 1; }
//			else if(this.z < other.z) { return -1; }
//			else if(this.z > other.z) { return 1; }
//			else { return 0; }
//		}
//		return 0;
//	}
//
//	///// Really confusing code that should be cleaned up
//
//	//removed
//
//	@Override
//	public String toString() {
//		return String.format("(%d, %d, %d)", this.x, this.y, this.z);
//	}
//
//	public int compareTo(int xCoord, int yCoord, int zCoord) {
//		if(this.x < xCoord) { return -1; }
//		else if(this.x > xCoord) { return 1; }
//		else if(this.y < yCoord) { return -1; }
//		else if(this.y > yCoord) { return 1; }
//		else if(this.z < zCoord) { return -1; }
//		else if(this.z > zCoord) { return 1; }
//		else { return 0; }
//	}
//}
