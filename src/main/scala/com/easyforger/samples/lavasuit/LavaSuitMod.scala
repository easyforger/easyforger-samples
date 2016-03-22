/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.lavasuit

import com.easyforger.items.{Boots, ChestPlate, Helmet, Leggings}
// TODO: change the DSL to avoid this import to be even necessary at all
import com.easyforger.recipes._ //scalastyle:ignore
import net.minecraft.init.Items
import net.minecraftforge.common.util.EnumHelper
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = LavaSuitMod.modId, name = "EasyForger Armor LavaSuit Mod", version = "0.2", modLanguage = "scala")
object LavaSuitMod {
  final val modId = "easyforger_lavasuit"
  val materialName = "lavasuit"
  val textureName = materialName
  val durability = 20
  val armorReductions = Array(4, 9, 7, 4)
  val enchantability = 10

  val lavaMaterial = EnumHelper.addArmorMaterial(materialName, textureName, durability, armorReductions, enchantability)

  val lavaHelmet = new LavaSuitItemArmor(lavaMaterial, Helmet)
  val lavaChestPlate = new LavaSuitItemArmor(lavaMaterial, ChestPlate)
  val lavaLeggings = new LavaSuitItemArmor(lavaMaterial, Leggings)
  val lavaBoots = new LavaSuitItemArmor(lavaMaterial, Boots)

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    lavaHelmet.register()
    lavaChestPlate.register()
    lavaLeggings.register()
    lavaBoots.register()

    crafting(
      Items.iron_ingot + Items.lava_bucket to lavaHelmet withShape
        """
          |iii
          |ili
          |...
        """.stripMargin,
      Items.iron_ingot + Items.lava_bucket to lavaChestPlate withShape
        """
          |ili
          |iii
          |iii
        """.stripMargin,
      Items.iron_ingot + Items.lava_bucket to lavaLeggings withShape
        """
          |iii
          |ili
          |i.i
        """.stripMargin,
      Items.iron_ingot + Items.lava_bucket to lavaBoots withShape
        """
          |...
          |i.i
          |ili
        """.stripMargin
    )
  }
}
