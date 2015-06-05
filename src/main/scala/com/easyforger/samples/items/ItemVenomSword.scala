package com.easyforger.samples.items

import com.easyforger.items.EFItemSword
import net.minecraft.entity.EntityLivingBase
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemStack
import net.minecraft.potion.{Potion, PotionEffect}

class ItemVenomSword extends EFItemSword(ItemsMod.modId, "venomsword", ToolMaterial.IRON) {
  val poisonDuration = 3 * 20
  val poisonLevel = 1

  override def hitEntity(stack: ItemStack, target: EntityLivingBase, attacker: EntityLivingBase): Boolean = {
    target.addPotionEffect(new PotionEffect(Potion.poison.id, poisonDuration, poisonLevel))
    super.hitEntity(stack, target, attacker)
  }
}
