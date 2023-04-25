package wannabeNifty.meleemod.init;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import wannabeNifty.meleemod.Main;

public class ModBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS , Main.MODID);


    //BLOCKS


    public static void Init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
