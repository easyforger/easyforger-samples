package com.easyforger.samples.blocks

import com.easyforger.recipes._
import net.minecraft.init.Items._
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = BlocksMod.modId, name = "EasyForger Blocks Sample Mod", version = "0.2", modLanguage = "scala")
object BlocksMod {
  final val modId = "easyforger_blocks"

  val cloth = new BlockCloth()

  @EventHandler
  def init(event: FMLInitializationEvent) = {
    cloth.register()

    crafting(
      string to cloth withShape
        """
          |sss
          |s.s
          |sss
        """.stripMargin
    )
  }
}
