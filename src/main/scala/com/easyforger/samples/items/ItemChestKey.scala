package com.easyforger.samples.items

import com.easyforger.items.EFItem
import net.minecraft.creativetab.CreativeTabs

class ItemChestKey extends EFItem(ItemsMod.modId, "chestkey", List("yellow", "red", "blue")) {
  setCreativeTab(CreativeTabs.tabMisc)
}
