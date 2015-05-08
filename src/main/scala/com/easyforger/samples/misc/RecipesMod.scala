package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import com.easyforger.recipes._
import net.minecraft.enchantment.Enchantment._
import net.minecraft.init.Blocks._
import net.minecraft.init.Items._
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "easyforger_recipes", name = "EasyForger Recipes Examples", version = "0.2", modLanguage = "scala")
object RecipesMod extends EasyForger {

  @EventHandler
  def init(event: FMLInitializationEvent) = {
    smelting(
      gravel to diamond_block(10) withXp 0.5,
      dirt to emerald_block,
      arrow to flint withXp 0.1,
      torch(10) to coal
    )

    crafting(
      coal + sand to diamond,
      coal + sand + red_flower to tnt,
      stone_sword + flint to enchanted(stone_sword, sharpness, 1),
      sapling('s') to red_flower(2) withShape
        """
          |...
          |.s.
          |.s.
        """.stripMargin,
      stick + diamond to diamond_sword withShape
        """
          |..d
          |.d.
          |s..
        """.stripMargin,
      dirt + sand to diamond_block,
      diamond_shovel + obsidian to diamond_block(5)
    )
  }
}
