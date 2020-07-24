package xyz.przemyk.simpleplanes.setup;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.przemyk.simpleplanes.SimplePlanesMod;
import xyz.przemyk.simpleplanes.entities.LargePlaneEntity;
import xyz.przemyk.simpleplanes.entities.LargePlaneEntityType;
import xyz.przemyk.simpleplanes.entities.PlaneEntity;
import xyz.przemyk.simpleplanes.entities.PlaneEntityType;
import xyz.przemyk.simpleplanes.upgrades.UpgradeType;

@Mod.EventBusSubscriber(modid = SimplePlanesMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class SimplePlanesEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, SimplePlanesMod.MODID);

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().register(PLANE);
        event.getRegistry().register(LARGE_PLANE);
        GlobalEntityTypeAttributes.put(PLANE, BatEntity.func_233639_cI_().func_233813_a_());
        GlobalEntityTypeAttributes.put(LARGE_PLANE, BatEntity.func_233639_cI_().func_233813_a_());

    }


        public static final PlaneEntityType PLANE = (PlaneEntityType) new PlaneEntityType(false).setRegistryName("plane");
        public static final LargePlaneEntityType LARGE_PLANE = (LargePlaneEntityType) new LargePlaneEntityType(false).setRegistryName("large_plane");

    //    public static final RegistryObject<PlaneEntityType> SPRUCE_PLANE = ENTITIES.register("spruce_plane", () -> new PlaneEntityType(SimplePlanesItems.SPRUCE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/spruce.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/spruce.png"), false));
//    public static final RegistryObject<PlaneEntityType> BIRCH_PLANE = ENTITIES.register("birch_plane", () -> new PlaneEntityType(SimplePlanesItems.BIRCH_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/birch.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/birch.png"), false));
//    public static final RegistryObject<PlaneEntityType> JUNGLE_PLANE = ENTITIES.register("jungle_plane", () -> new PlaneEntityType(SimplePlanesItems.JUNGLE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/jungle.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/jungle.png"), false));
//    public static final RegistryObject<PlaneEntityType> ACACIA_PLANE = ENTITIES.register("acacia_plane", () -> new PlaneEntityType(SimplePlanesItems.ACACIA_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/acacia.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/acacia.png"), false));
//    public static final RegistryObject<PlaneEntityType> DARK_OAK_PLANE = ENTITIES.register("dark_oak_plane", () -> new PlaneEntityType(SimplePlanesItems.DARK_OAK_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/dark_oak.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/dark_oak.png"), false));
//    public static final RegistryObject<PlaneEntityType> CRIMSON_PLANE = ENTITIES.register("crimson_plane", () -> new PlaneEntityType(SimplePlanesItems.CRIMSON_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/crimson.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/crimson.png"), true));
//    public static final RegistryObject<PlaneEntityType> WARPED_PLANE = ENTITIES.register("warped_plane", () -> new PlaneEntityType(SimplePlanesItems.WARPED_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/warped.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/warped.png"), true));
//
//    public static final RegistryObject<LargePlaneEntityType> OAK_LARGE_PLANE = ENTITIES.register("oak_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.OAK_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/oak.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/oak.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> SPRUCE_LARGE_PLANE = ENTITIES.register("spruce_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.SPRUCE_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/spruce.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/spruce.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BIRCH_LARGE_PLANE = ENTITIES.register("birch_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BIRCH_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/birch.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/birch.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> JUNGLE_LARGE_PLANE = ENTITIES.register("jungle_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.JUNGLE_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/jungle.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/jungle.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> ACACIA_LARGE_PLANE = ENTITIES.register("acacia_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.ACACIA_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/acacia.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/acacia.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> DARK_OAK_LARGE_PLANE = ENTITIES.register("dark_oak_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.DARK_OAK_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/dark_oak.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/dark_oak.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> CRIMSON_LARGE_PLANE = ENTITIES.register("crimson_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.CRIMSON_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/crimson.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/crimson.png"), true));
//    public static final RegistryObject<LargePlaneEntityType> WARPED_LARGE_PLANE = ENTITIES.register("warped_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.WARPED_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/warped.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/warped.png"), true));
//
//    ////////////////////////////////// Everything below is for mod compatibility //////////////////////////////////
//    //////////// Fruit Trees
//    public static final RegistryObject<PlaneEntityType> FT_CHERRY_PLANE = ENTITIES.register("ft_cherry_plane", () -> new PlaneEntityType(SimplePlanesItems.FT_CHERRY_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/ft_cherry.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/ft_cherry.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> FT_CHERRY_LARGE_PLANE = ENTITIES.register("ft_cherry_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.FT_CHERRY_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/ft_cherry.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/ft_cherry.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> FT_CITRUS_PLANE = ENTITIES.register("ft_citrus_plane", () -> new PlaneEntityType(SimplePlanesItems.FT_CITRUS_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/ft_citrus.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/ft_citrus.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> FR_CITRUS_LARGE_PLANE = ENTITIES.register("ft_citrus_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.FR_CITRUS_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/ft_citrus.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/ft_citrus.png"), false));
//
//    //////////// Biomes O' Plenty
//    public static final RegistryObject<PlaneEntityType> BOP_CHERRY_PLANE = ENTITIES.register("bop_cherry_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_CHERRY_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_cherry.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_cherry.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_CHERRY_LARGE_PLANE = ENTITIES.register("bop_cherry_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_CHERRY_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_cherry.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_cherry.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_DEAD_PLANE = ENTITIES.register("bop_dead_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_DEAD_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_dead.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_dead.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_DEAD_LARGE_PLANE = ENTITIES.register("bop_dead_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_DEAD_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_dead.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_dead.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_FIR_PLANE = ENTITIES.register("bop_fir_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_FIR_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_fir.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_fir.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_FIR_LARGE_PLANE = ENTITIES.register("bop_fir_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_FIR_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_fir.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_fir.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_HELLBARK_PLANE = ENTITIES.register("bop_hellbark_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_HELLBARK_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_hellbark.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_hellbark.png"), true));
//    public static final RegistryObject<LargePlaneEntityType> BOP_HELLBARK_LARGE_PLANE = ENTITIES.register("bop_hellbark_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_HELLBARK_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_hellbark.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_hellbark.png"), true));
//
//    public static final RegistryObject<PlaneEntityType> BOP_JACARANDA_PLANE = ENTITIES.register("bop_jacaranda_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_JACARANDA_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_jacaranda.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_jacaranda.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_JACARANDA_LARGE_PLANE = ENTITIES.register("bop_jacaranda_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_JACARANDA_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_jacaranda.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_jacaranda.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_MAGIC_PLANE = ENTITIES.register("bop_magic_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_MAGIC_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_magic.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_magic.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_MAGIC_LARGE_PLANE = ENTITIES.register("bop_magic_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_MAGIC_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_magic.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_magic.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_MAHOGANY_PLANE = ENTITIES.register("bop_mahogany_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_MAHOGANY_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_mahogany.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_mahogany.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_MAHOGANY_LARGE_PLANE = ENTITIES.register("bop_mahogany_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_MAHOGANY_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_mahogany.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_mahogany.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_PALM_PLANE = ENTITIES.register("bop_palm_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_PALM_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_palm.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_palm.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_PALM_LARGE_PLANE = ENTITIES.register("bop_palm_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_PALM_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_palm.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_palm.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_REDWOOD_PLANE = ENTITIES.register("bop_redwood_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_REDWOOD_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_redwood.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_redwood.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_REDWOOD_LARGE_PLANE = ENTITIES.register("bop_redwood_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_REDWOOD_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_redwood.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_redwood.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_UMBRAN_PLANE = ENTITIES.register("bop_umbran_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_UMBRAN_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_umbran.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_umbran.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_UMBRAN_LARGE_PLANE = ENTITIES.register("bop_umbran_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_UMBRAN_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_umbran.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_umbran.png"), false));
//
//    public static final RegistryObject<PlaneEntityType> BOP_WILLOW_PLANE = ENTITIES.register("bop_willow_plane", () -> new PlaneEntityType(SimplePlanesItems.BOP_WILLOW_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/bop_willow.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace_powered/bop_willow.png"), false));
//    public static final RegistryObject<LargePlaneEntityType> BOP_WILLOW_LARGE_PLANE = ENTITIES.register("bop_willow_large_plane", () -> new LargePlaneEntityType(SimplePlanesItems.BOP_WILLOW_LARGE_PLANE.get(), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace/bop_willow.png"), new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/bop_willow.png"), false));

}
