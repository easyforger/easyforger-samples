/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.chests

import com.easyforger.blocks.{ChestType, EFBlockChest}
import net.minecraft.tileentity.TileEntity
import net.minecraft.world.World

class BlockLockedChest extends EFBlockChest(LockedChestsMod.modId, "lockedchest", ChestType.Normal) {
  override def createNewTileEntity(worldIn: World, meta: Int): TileEntity = new TileEntityLockedChest()
}
