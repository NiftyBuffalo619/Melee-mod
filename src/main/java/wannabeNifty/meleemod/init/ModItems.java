package wannabeNifty.meleemod.init;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.meleemod.Main;
import wannabeNifty.meleemod.items.TelescopicBaton;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , Main.MODID);



    //ITEMS
    /*public static final RegistryObject<TelescopicBaton> TELESCOPIC_BATON = ITEMS.register("telescopic_baton" ,
            () -> new TelescopicBaton(Tier))*/
    public static void Init(IEventBus bus) {
        ITEMS.register(bus);
    }

    /*public static void AddInventoryItems(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(Item)
        }
    }*/
}
