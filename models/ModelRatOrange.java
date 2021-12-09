// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRatOrange extends EntityModel<Entity> {
	private final ModelRenderer Null;
	private final ModelRenderer bb_main;

	public ModelRatOrange() {
		textureWidth = 16;
		textureHeight = 16;

		Null = new ModelRenderer(this);
		Null.setRotationPoint(0.0F, 24.0F, 0.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 0.0F, 0.0F);
		Null.addChild(bb_main);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Null.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}