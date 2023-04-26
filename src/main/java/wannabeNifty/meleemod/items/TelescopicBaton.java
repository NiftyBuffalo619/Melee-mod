package wannabeNifty.meleemod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import wannabeNifty.meleemod.init.ModItems;

public class TelescopicBaton extends SwordItem {
    private static final int AttackDamage = 15;

    public TelescopicBaton(Tier tier, int bonus_attack, float attack_speed, Item.Properties properties) {
        super(tier , bonus_attack , attack_speed , properties);
    }

   /* @Override
    public void setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, AttackDamage);
    }
    */
}
