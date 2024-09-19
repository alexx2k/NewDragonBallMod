
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.alexbalsillie.dragonball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.alexbalsillie.dragonball.entity.ShenronEntity;
import com.alexbalsillie.dragonball.entity.Namekian3Entity;
import com.alexbalsillie.dragonball.entity.Namekian2Entity;
import com.alexbalsillie.dragonball.entity.Namekian1Entity;
import com.alexbalsillie.dragonball.entity.KiBlastProjectileEntity;
import com.alexbalsillie.dragonball.DragonBallMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonBallModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DragonBallMod.MODID);
	public static final RegistryObject<EntityType<ShenronEntity>> SHENRON = register("shenron",
			EntityType.Builder.<ShenronEntity>of(ShenronEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(ShenronEntity::new).fireImmune().sized(8f, 18f));
	public static final RegistryObject<EntityType<KiBlastProjectileEntity>> KI_BLAST_PROJECTILE = register("ki_blast_projectile", EntityType.Builder.<KiBlastProjectileEntity>of(KiBlastProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(KiBlastProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Namekian1Entity>> NAMEKIAN_1 = register("namekian_1",
			EntityType.Builder.<Namekian1Entity>of(Namekian1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Namekian1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Namekian2Entity>> NAMEKIAN_2 = register("namekian_2",
			EntityType.Builder.<Namekian2Entity>of(Namekian2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Namekian2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Namekian3Entity>> NAMEKIAN_3 = register("namekian_3",
			EntityType.Builder.<Namekian3Entity>of(Namekian3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Namekian3Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShenronEntity.init();
			Namekian1Entity.init();
			Namekian2Entity.init();
			Namekian3Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHENRON.get(), ShenronEntity.createAttributes().build());
		event.put(NAMEKIAN_1.get(), Namekian1Entity.createAttributes().build());
		event.put(NAMEKIAN_2.get(), Namekian2Entity.createAttributes().build());
		event.put(NAMEKIAN_3.get(), Namekian3Entity.createAttributes().build());
	}
}
