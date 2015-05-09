package com.easyforger.samples.items

import com.easyforger.items.EFItem
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.EntityLivingBase
import net.minecraft.item.ItemStack

class ItemExplosionRod extends EFItem(ItemsMod.modId, "explosionrod") {
  setCreativeTab(CreativeTabs.tabMisc)

  override def onEntitySwing(entity: EntityLivingBase, stack: ItemStack): Boolean = {
    val target = entity.rayTrace(100, 1f)
    entity.worldObj.createExplosion(entity, target.getBlockPos.getX, target.getBlockPos.getY, target.getBlockPos.getZ, 4f, true)

    false
  }
}
