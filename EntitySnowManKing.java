// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class EntitySnowManKing extends ModelBase {
	private final ModelRenderer hat;
	private final ModelRenderer snowman;
	private final ModelRenderer snowman_body;
	private final ModelRenderer snowman_face;

	public EntitySnowManKing() {
		textureWidth = 256;
		textureHeight = 256;

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 24.0F, 0.0F);
		hat.cubeList.add(new ModelBox(hat, 0, 0, -2.0F, -41.0F, -2.0F, 4, 2, 4, 0.0F, false));
		hat.cubeList.add(new ModelBox(hat, 0, 0, -6.0F, -37.0F, -6.0F, 12, 2, 12, 0.0F, false));
		hat.cubeList.add(new ModelBox(hat, 0, 0, -4.0F, -39.0F, -4.0F, 8, 2, 8, 0.0F, false));

		snowman = new ModelRenderer(this);
		snowman.setRotationPoint(0.0F, 24.0F, 0.0F);
		snowman.cubeList.add(new ModelBox(snowman, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		snowman_body = new ModelRenderer(this);
		snowman_body.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman.addChild(snowman_body);
		snowman_body.cubeList.add(new ModelBox(snowman_body, 0, 0, -4.0F, -35.0F, -4.0F, 8, 8, 8, 0.0F, false));
		snowman_body.cubeList.add(new ModelBox(snowman_body, 0, 0, -6.0F, -27.0F, -6.0F, 12, 12, 12, 0.0F, false));
		snowman_body.cubeList.add(new ModelBox(snowman_body, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F, false));

		snowman_face = new ModelRenderer(this);
		snowman_face.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman.addChild(snowman_face);
		snowman_face.cubeList.add(new ModelBox(snowman_face, 0, 0, 2.0F, -30.0F, -5.0F, 1, 1, 1, 0.0F, false));
		snowman_face.cubeList.add(new ModelBox(snowman_face, 0, 0, -2.0F, -29.0F, -5.0F, 4, 1, 1, 0.0F, false));
		snowman_face.cubeList.add(new ModelBox(snowman_face, 0, 0, -3.0F, -30.0F, -5.0F, 1, 1, 1, 0.0F, false));
		snowman_face.cubeList.add(new ModelBox(snowman_face, 0, 0, 1.0F, -32.0F, -5.0F, 1, 1, 1, 0.0F, false));
		snowman_face.cubeList.add(new ModelBox(snowman_face, 0, 0, -2.0F, -32.0F, -5.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hat.render(f5);
		snowman.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}