package xyz.przemyk.simpleplanes.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;

import xyz.przemyk.simpleplanes.SimplePlanesMod;
import xyz.przemyk.simpleplanes.entities.AbstractPlaneEntityType;
import xyz.przemyk.simpleplanes.entities.LargePlaneEntity;

public class LargePlaneRenderer extends AbstractPlaneRenderer<LargePlaneEntity> {

    protected final LargeFurnacePlaneModel planeModel = new LargeFurnacePlaneModel();

    public LargePlaneRenderer(EntityRendererManager renderManager) {
        super(renderManager);
        shadowSize = 1.0f;
    }

    @Override
    protected EntityModel<LargePlaneEntity> getModel() {
        return planeModel;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public ResourceLocation getEntityTexture(LargePlaneEntity entity) {
//        if (entity.isPowered()) {
//            return new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/large_furnace_powered/"+entity.getMaterial().name+".png");
//        }
        return new ResourceLocation(SimplePlanesMod.MODID, "textures/entity/plane/furnace/"+entity.getMaterial().name+".png");
    }
}
