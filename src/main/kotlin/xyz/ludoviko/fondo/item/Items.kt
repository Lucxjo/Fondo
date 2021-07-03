package xyz.ludoviko.fondo.item

import net.minecraft.item.ItemGroup
import xyz.ludoviko.fondo.registry.ItemRegistry

object Items {
    private val SLATE_ITEM = ItemRegistry("slate_item", ItemGroup.MISC)
    private val QUARTZ = ItemRegistry("quartz", ItemGroup.MISC)

    fun register() {
        SLATE_ITEM
        QUARTZ
    }
}