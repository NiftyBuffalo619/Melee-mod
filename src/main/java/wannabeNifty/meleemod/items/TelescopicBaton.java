package wannabeNifty.meleemod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class TelescopicBaton extends SwordItem {
    private static final float AttackDamage = 4.0f;

    public TelescopicBaton(Tier tier, int i, float f, Properties properties) {
        super(tier, i, f, properties);
    }

    @Override
    public float getDamage() {
        return this.AttackDamage;
    }

}
