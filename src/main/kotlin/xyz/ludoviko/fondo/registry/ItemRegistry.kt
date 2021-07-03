package xyz.ludoviko.fondo.registry

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.registry.Registry
import xyz.ludoviko.fondo.Fondo

class ItemRegistry(id: String, group: ItemGroup) {
    init {
        Registry.register(Registry.ITEM, Fondo.id(id), Item(Item.Settings().group(group)))
    }
}