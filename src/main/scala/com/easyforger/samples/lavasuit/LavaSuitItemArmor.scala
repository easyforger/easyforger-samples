/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.lavasuit

import com.easyforger.items.{ArmorType, EFItemArmor}
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemArmor.ArmorMaterial
import net.minecraft.item.ItemStack
import net.minecraft.potion.{Potion, PotionEffect}
import net.minecraft.world.World

class LavaSuitItemArmor(material: ArmorMaterial, armorType: ArmorType)
  extends EFItemArmor(LavaSuitMod.modId, material, armorType) {

  override def onArmorTick(world: World, player: EntityPlayer, itemStack: ItemStack): Unit = {
    player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10, 0))
  }
}
