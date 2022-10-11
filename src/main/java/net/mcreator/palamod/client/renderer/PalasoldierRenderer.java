
package net.mcreator.palamod.client.renderer;

public class PalasoldierRenderer extends HumanoidMobRenderer<PalasoldierEntity, HumanoidModel<PalasoldierEntity>> {

	public PalasoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(PalasoldierEntity entity) {
		return new ResourceLocation("pala_mod:textures/entities/pala-texture.png");
	}

}
