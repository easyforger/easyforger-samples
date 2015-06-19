package com.easyforger.samples.items

import com.easyforger.items.EFItemAxe
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.entity.EntityLivingBase
import net.minecraft.item.Item.ToolMaterial
import net.minecraft.item.ItemStack
import net.minecraft.util.BlockPos
import net.minecraft.world.World

class ItemHeavyAxe extends EFItemAxe(ItemsMod.modId, "heavyaxe", ToolMaterial.IRON) {
  override def getDigSpeed(stack: ItemStack, state: IBlockState): Float = super.getDigSpeed(stack, state) / 2

  override def onBlockDestroyed(stack: ItemStack, worldIn: World, blockIn: Block, pos: BlockPos, playerIn: EntityLivingBase): Boolean = {
    if (blockIn.getMaterial == Material.wood) {
      destroyAllConnectedWoodBlocks(worldIn, pos)
    }

    super.onBlockDestroyed(stack, worldIn, blockIn, pos, playerIn)
  }

  private def destroyAllConnectedWoodBlocks(world: World, startPos: BlockPos): Unit = {
    val allPositions = Vector(startPos.up(), startPos.down(), startPos.south(), startPos.north(), startPos.west(), startPos.east())

    for (pos <- allPositions) {
      if (world.getBlockState(pos).getBlock.getMaterial == Material.wood) {
        world.destroyBlock(pos, true)
        destroyAllConnectedWoodBlocks(world, pos)
      }
    }
  }
}
