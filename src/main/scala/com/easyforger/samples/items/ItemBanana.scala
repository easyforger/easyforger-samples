/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.items

import com.easyforger.items.EFItemFood
import net.minecraft.potion.Potion

class ItemBanana extends EFItemFood(ItemsMod.modId, "banana", 5, 0.4f, false) {
  setPotionEffect(Potion.jump.id, 9, 1, 1f)
  addPotionEffect(Potion.digSlowdown.id, 5, 0, 0.5f)
}
