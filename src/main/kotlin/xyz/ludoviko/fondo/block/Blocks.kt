package xyz.ludoviko.fondo.block

import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Material
import net.minecraft.item.ItemGroup
import xyz.ludoviko.fondo.block.comp.CompBlock
import xyz.ludoviko.fondo.registry.BlockRegistry

object Blocks {
    private val COMP_COBBLE = BlockRegistry(
        CompBlock(
            "comp_cobble",
            Material.STONE,
            3.0f,
            7.0f,
            FabricToolTags.PICKAXES
        ),
        "comp_cobble",
        ItemGroup.BUILDING_BLOCKS
    )

    fun register() {
        COMP_COBBLE
    }
}