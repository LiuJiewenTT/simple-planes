package xyz.przemyk.simpleplanes.setup;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.przemyk.simpleplanes.container.RemoveUpgradesContainer;
import xyz.przemyk.simpleplanes.SimplePlanesMod;
import xyz.przemyk.simpleplanes.container.PlaneWorkbenchContainer;
import xyz.przemyk.simpleplanes.container.FurnaceEngineContainer;
import xyz.przemyk.simpleplanes.container.StorageContainer;

public class SimplePlanesContainers {
    public static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, SimplePlanesMod.MODID);

    public static void init() {
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<ContainerType<PlaneWorkbenchContainer>> PLANE_WORKBENCH = CONTAINERS.register("plane_workbench", () -> new ContainerType<>(PlaneWorkbenchContainer::new));
    public static final RegistryObject<ContainerType<FurnaceEngineContainer>> FURNACE_ENGINE = CONTAINERS.register("furnace_engine", () -> new ContainerType<>(FurnaceEngineContainer::new));
    public static final RegistryObject<ContainerType<RemoveUpgradesContainer>> UPGRADES_REMOVAL = CONTAINERS.register("upgrades_removal", () -> IForgeContainerType.create(RemoveUpgradesContainer::new));
    public static final RegistryObject<ContainerType<StorageContainer>> STORAGE = CONTAINERS.register("storage", () -> new ContainerType<>(StorageContainer::new));
}
