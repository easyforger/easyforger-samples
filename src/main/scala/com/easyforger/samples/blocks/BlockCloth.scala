/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
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
