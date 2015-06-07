package com.easyforger.samples.items

import com.easyforger.base.EasyForger
import com.easyforger.recipes._
import net.minecraft.init.{Blocks, Items}
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = ItemsMod.modId, name = "EasyForger Items Sample Mod", version = "0.2", modLanguage = "scala")
object ItemsMod extends EasyForger {
  final val modId = "easyforger_items"

  val chestKey = new ItemChestKey()
  val banana = new ItemBanana()
  val explosionRod = new ItemExplosionRod()
  val venomSword = new ItemVenomSword()
  val quickPick = new ItemQuickPickaxe()

  @EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    chestKey.register()
    banana.register()
    explosionRod.register()
    venomSword.register()
    quickPick.register()

    val yellowChestKey = new ItemStack(chestKey, 1, chestKey.metaForSubItemName("yellow"))
    val redChestKey = new ItemStack(chestKey, 1, chestKey.metaForSubItemName("red"))
    val blueChestKey = new ItemStack(chestKey, 1, chestKey.metaForSubItemName("blue"))

    crafting(
      Items.iron_ingot + yellowDye('y') to yellowChestKey withShape
        """
          |...
          |iiy
          |..i
        """.stripMargin,
      Items.iron_ingot + redDye to redChestKey withShape
        """
          |...
          |iir
          |..i
        """.stripMargin,
      Items.iron_ingot + blueDye('b') to blueChestKey withShape
        """
          |...
          |iib
          |..i
        """.stripMargin,
      Items.stick + Blocks.tnt to explosionRod withShape
        """
          |..t
          |.s.
          |s..
        """.stripMargin,
      Items.iron_sword + Items.poisonous_potato to venomSword,
      Items.iron_pickaxe + Items.diamond to quickPick
    )
  }
}
