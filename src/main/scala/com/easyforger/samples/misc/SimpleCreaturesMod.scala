/*
 * This file is part of EasyForger which is released under GPLv3 License.
 * See file LICENSE.txt or go to http://www.gnu.org/licenses/gpl-3.0.en.html for full license details.
 */
package com.easyforger.samples.misc

import com.easyforger.base.EasyForger
import com.easyforger.creatures.SkeletonBehavior
import net.minecraft.entity.monster.SkeletonType
import net.minecraft.init.Items
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "easyforger_creatures_simple", name = "EasyForger Vanilla Creatures Replacements", version = "0.5", modLanguage = "scala")
object SimpleCreaturesMod extends EasyForger {

  // TODO: drop item apparently doesn't work any more (heldItem is ok)
  // See this issue: https://github.com/easyforger/easyforger/issues/73

  @EventHandler
  def preInit(event: FMLPreInitializationEvent): Unit = {
    creatures( this,
      creeper(
        common(
          dropItem = Items.DIAMOND,
          heldItem = Items.DIAMOND_SWORD
        ),
        explosionRadius = 100, // scalastyle:ignore
        powered = false
      ),
      zombie(
        common(
          heldItem = Items.DIAMOND_SWORD,
          dropItem = Items.DIAMOND
        )
      ),
      skeleton(
        common(
          dropItem = Items.DIAMOND,
          heldItem = Items.STONE_SWORD
        ),
        behavior = skeleton => new SkeletonBehavior {
          override def dropFewItems(recentlyHit: Boolean, lootingLevel: Int): Option[Unit] = {
            if (skeleton.getSkeletonType == SkeletonType.WITHER) {
              skeleton.dropItem(Items.DIAMOND, 1)
            } else {
              skeleton.dropItem(Items.EMERALD, 1)
            }
          }
        }
      )
    )
  }
}
