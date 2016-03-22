/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import net.minecraft.init.Items
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "easyforger_chests", name = "EasyForger Chests Mod Examples", version = "0.2", modLanguage = "scala")
object VanillaChestsMod extends EasyForger {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    removeChestContent(
      chest = ChestName.bonusChest,
      item = Items.stick
    )

    addChestContent(
      chest = ChestName.bonusChest,
      item = Items.diamond_axe,
      minStack = 1,
      maxStack = 2,
      chance = 50 // scalastyle:ignore
    )

    addChestContent(
      chest = ChestName.mineshaftCorridor,
      item = Items.emerald,
      minStack = 3,
      maxStack = 20, // scalastyle:ignore
      chance = 13
    )
  }
}
