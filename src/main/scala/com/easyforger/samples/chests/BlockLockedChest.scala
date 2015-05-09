package com.easyforger.samples.chests

import com.easyforger.blocks.EFBlockChest
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

class BlockLockedChest extends EFBlockChest(LockedChestsMod.modId, "lockedchest") {
  override def createNewTileEntity(worldIn: World, meta: Int): TileEntity = new TileEntityLockedChest()
}
