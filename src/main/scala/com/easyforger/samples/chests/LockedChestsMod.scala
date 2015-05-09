package com.easyforger.samples.chests

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.registry.GameRegistry

@Mod(modid = LockedChestsMod.modId, name = "EasyForger Locked Chests Mod", version = "0.2", modLanguage = "scala")
object LockedChestsMod {
  final val modId = "easyforger_lockedchests"

  val lockedChest = new BlockLockedChest()

  @EventHandler
  def init(event: FMLInitializationEvent) = {
    lockedChest.register()
    GameRegistry.registerTileEntity(classOf[TileEntityLockedChest], "LockedChestTileEntity")
  }
}
