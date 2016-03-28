/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import net.minecraft.enchantment.Enchantment
import net.minecraft.init.{Blocks, Items}
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "easyforger_recipes", name = "EasyForger Recipes Examples", version = "0.2", modLanguage = "scala")
object RecipesMod extends EasyForger {

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    smelting(
      Blocks.gravel to Blocks.diamond_block(10) withXp 0.5,
      Blocks.dirt to Blocks.emerald_block,
      Items.arrow to Items.flint withXp 0.1,
      Blocks.torch(10) to Items.coal,
      Items.apple to Items.cake
    )

    crafting(
      Items.coal + Blocks.sand to Items.diamond,
      Items.coal + Blocks.sand + Blocks.red_flower to Blocks.tnt,
      Items.stone_sword + Items.flint to enchanted(Items.stone_sword, Enchantment.sharpness, 1),
      Blocks.sapling('s') to Blocks.red_flower(2) withShape
        """
          |...
          |.s.
          |.s.
        """.stripMargin,
      Items.stick + Items.diamond to Items.diamond_sword withShape
        """
          |..d
          |.d.
          |s..
        """.stripMargin,
      Blocks.dirt + Blocks.sand to Blocks.diamond_block,
      Items.diamond_shovel + Blocks.obsidian to Blocks.diamond_block(5),
      Items.diamond + Items.carrot to Items.armor_stand
    )
  }
}
