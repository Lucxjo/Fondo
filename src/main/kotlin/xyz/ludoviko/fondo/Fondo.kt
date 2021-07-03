package xyz.ludoviko.fondo

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import xyz.ludoviko.fondo.block.Blocks
import xyz.ludoviko.fondo.item.Items

object Fondo : ModInitializer {
    const val ID = "fondo"

    fun id(name: String) = Identifier(ID, name)

    val logger = LogManager.getFormatterLogger()

    override fun onInitialize() {
        Items.register()
        Blocks.register()
    }
}