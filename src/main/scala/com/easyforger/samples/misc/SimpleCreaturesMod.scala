/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import com.easyforger.creatures.SkeletonBehavior
import net.minecraft.init.Items
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "easyforger_creatures_simple", name = "EasyForger Vanilla Creatures Replacements", version = "0.2", modLanguage = "scala")
object SimpleCreaturesMod extends EasyForger {

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    creatures(
      creeper(
        common(
          dropItem = Items.diamond,
          heldItem = Items.diamond_sword
        ),
        explosionRadius = 100, // scalastyle:ignore
        powered = false
      ),
      zombie(
        common(
          heldItem = Items.diamond_sword,
          dropItem = Items.diamond
        )
      ),
      skeleton(
        common(
          dropItem = Items.diamond,
          heldItem = Items.stone_sword
        ),
        behavior = skeleton => new SkeletonBehavior {
          override def dropFewItems(recentlyHit: Boolean, lootingLevel: Int): Option[Unit] = {
            if (skeleton.getSkeletonType == 1) {
              skeleton.dropItem(Items.diamond, 1)
            } else {
              skeleton.dropItem(Items.emerald, 1)
            }
          }
        }
      )
    )
  }
}
