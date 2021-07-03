package xyz.ludoviko.fondo.block

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.Item
import net.minecraft.tag.Tag

class Block(material: Material, tool: Tag<Item>?, reqTool: Boolean = false) : Block(
    when {
        tool == null -> FabricBlockSettings.of(material)
        reqTool -> FabricBlockSettings.of(material).breakByTool(tool).requiresTool()
        else -> FabricBlockSettings.of(material).breakByTool(tool)
    }
)