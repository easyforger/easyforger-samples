package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import net.minecraft.init.Items._
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "easyforger_chests", name = "EasyForger Chests Mod Examples", version = "0.2", modLanguage = "scala")
object VanillaChestsMod extends EasyForger {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) = {
    removeChestContent(
      chest = ChestName.bonusChest,
      item = stick
    )

    addChestContent(
      chest = ChestName.bonusChest,
      item = diamond_axe,
      minStack = 1,
      maxStack = 2,
      chance = 50
    )

    addChestContent(
      chest = ChestName.mineshaftCorridor,
      item = emerald,
      minStack = 3,
      maxStack = 20,
      chance = 13
    )
  }
}
