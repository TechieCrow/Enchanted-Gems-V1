
package net.mcreator.enchantedgems.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.enchantedgems.procedures.TestRightclickedOnBlockProcedure;
import net.mcreator.enchantedgems.init.EnchantedGemsModTabs;

public class GeodeItem extends Item {
	public GeodeItem() {
		super(new Item.Properties().tab(EnchantedGemsModTabs.TAB_ENCHANTING_GEMS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TestRightclickedOnBlockProcedure.execute(entity);
		return ar;
	}
}
