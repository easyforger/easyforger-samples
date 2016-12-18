/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.chests

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.tileentity.TileEntityChest

class TileEntityLockedChest extends TileEntityChest {
  setCustomName("locked chest")

  // TODO: support offhand, as part of https://github.com/easyforger/easyforger/issues/63
  override def isUseableByPlayer(player: EntityPlayer): Boolean = {
    player.getHeldItemMainhand != null && player.getHeldItemMainhand.getUnlocalizedName.contains("chestkey") // scalastyle:ignore
  }
}
