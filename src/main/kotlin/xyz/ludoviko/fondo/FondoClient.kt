package xyz.ludoviko.fondo

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate
import net.fabricmc.api.ClientModInitializer

object FondoClient : ClientModInitializer {
    override fun onInitializeClient() {
        CrowdinTranslate.downloadTranslations("ludofondomc", Fondo.ID)
    }
}