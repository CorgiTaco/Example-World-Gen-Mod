package corgitaco.exampleworldgenmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExampleWorldGenMod.MODID)
public class ExampleWorldGenMod {
    public static final String MODID = "exampleworldgenmod";

    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleWorldGenMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {}
}
