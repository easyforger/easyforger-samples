/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import net.minecraft.init.{Blocks, Items}
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "easyforger_dungeons", name = "EasyForger Dungeons Mod Examples", version = "0.2", modLanguage = "scala")
object DungeonsMod extends EasyForger {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    dungeonMobs(
      EntityName.Creeper -> 100,
      EntityName.Zombie -> 400,
      EntityName.Enderman -> 50
    )

    dungeonChest(
      item = Blocks.diamond_block,
      minStack = 1,
      maxStack = 5,
      chance = 2
    )

    dungeonChest(
      item = Items.spawn_egg,
      minStack = 1,
      maxStack = 1,
      chance = 1
    )
  }
}
