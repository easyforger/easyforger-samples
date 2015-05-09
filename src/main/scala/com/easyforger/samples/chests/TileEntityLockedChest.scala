package com.easyforger.samples.chests

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.tileentity.TileEntityChest

class TileEntityLockedChest extends TileEntityChest {
  setCustomName("locked chest")

  override def isUseableByPlayer(player: EntityPlayer): Boolean = {
    player.getHeldItem != null && player.getHeldItem.getUnlocalizedName.contains("chestkey")
  }
}
