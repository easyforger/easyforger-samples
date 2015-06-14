package com.easyforger.samples.items

import com.easyforger.items.EFItemSpade
import net.minecraft.block.state.IBlockState
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemStack

class ItemQuickSpade extends EFItemSpade(ItemsMod.modId, "quickspade", ToolMaterial.IRON) {

  override def getDigSpeed(stack: ItemStack, state: IBlockState): Float =
    super.getDigSpeed(stack, state) * 2
}
