package com.easyforger.samples.blocks

import com.easyforger.blocks.EFBlock
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.init.Items

class BlockCloth extends EFBlock(BlocksMod.modId, "clothblock", Material.cloth) {
  setHardness(0.5f)
  setResistance(1.0f)
  setStepSound(Block.soundTypeWood)

  dropItem = Items.book
  quantityDropped = 3
}
