package xyz.ludoviko.fondo.registry

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.registry.Registry
import xyz.ludoviko.fondo.Fondo

class BlockRegistry(block: Block, name: String, group: ItemGroup) {

    init {
        Registry.register(Registry.BLOCK, Fondo.id(name), block)
        Registry.register(Registry.ITEM, Fondo.id(name), BlockItem(block, Item.Settings().group(group)))
    }
}