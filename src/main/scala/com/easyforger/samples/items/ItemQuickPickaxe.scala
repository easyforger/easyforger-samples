package com.easyforger.samples.items

import com.easyforger.items.EFItemPickaxe
import net.minecraft.block.state.IBlockState
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemStack

class ItemQuickPickaxe extends EFItemPickaxe(ItemsMod.modId, "quickpick", ToolMaterial.IRON) {

  override def getDigSpeed(stack: ItemStack, state: IBlockState): Float =
    super.getDigSpeed(stack, state) * 2
}
