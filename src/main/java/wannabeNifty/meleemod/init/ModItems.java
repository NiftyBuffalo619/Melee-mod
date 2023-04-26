package wannabeNifty.meleemod.init;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import wannabeNifty.meleemod.Main;
import wannabeNifty.meleemod.items.TelescopicBaton;

import java.util.ArrayList;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS , Main.MODID);
    public static final ArrayList<DeferredRegister<Item>> LIST = new ArrayList<DeferredRegister<Item>>();



    //ITEMS
    public static final RegistryObject<SwordItem> TELESCOPIC_BATON = ITEMS.register("telescopic_baton" ,
            () -> new TelescopicBaton(Tiers.Iron_Tier , 2 , 5.0f ,new Item.Properties()));

    public static void Init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static void AddInventoryItems(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.COMBAT) {
            event.accept(TELESCOPIC_BATON);
        }
    }

    public static class Tiers {
        public static final Tier Iron_Tier = new ForgeTier(2 , 1500 , 5.0f ,
                3 , 1 , null , () -> Ingredient.of(Items.IRON_INGOT));
    }
}
