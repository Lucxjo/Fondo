package xyz.ludoviko.fondo.block.comp

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.world.BlockView

class CompBlock(
    private val blockName: String,
    material: Material,
    hardness: Float,
    resistance: Float,
    tool: Tag<Item>,
    level: Int = 1
) : Block(
    FabricBlockSettings.of(material).strength(hardness, resistance).breakByTool(tool, level).requiresTool()
) {
    override fun appendTooltip(
        stack: ItemStack?,
        world: BlockView?,
        tooltip: MutableList<Text>?,
        options: TooltipContext?
    ) {
        tooltip?.add(TranslatableText("item.fondo.${blockName}.tooltip"))
    }
}