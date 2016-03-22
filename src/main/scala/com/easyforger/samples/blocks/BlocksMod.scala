/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.blocks

// TODO: change the DSL to avoid this import to be even necessary at all
import com.easyforger.recipes._ //scalastyle:ignore
import net.minecraft.init.Items
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = BlocksMod.modId, name = "EasyForger Blocks Sample Mod", version = "0.2", modLanguage = "scala")
object BlocksMod {
  final val modId = "easyforger_blocks"

  val cloth = new BlockCloth()

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    cloth.register()

    crafting(
      Items.string to cloth withShape
        """
          |sss
          |s.s
          |sss
        """.stripMargin
    )
  }
}
