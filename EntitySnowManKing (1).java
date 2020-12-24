// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class EntitySnowManKing extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer snowman;
	private final ModelRenderer snowman_body;
	private final ModelRenderer snowman_face;
	private final ModelRenderer snowman_buttons;
	private final ModelRenderer snowman_arms;
	private final ModelRenderer snowman_arm_left;
	private final ModelRenderer arm_left_2_r1;
	private final ModelRenderer arm_left_1_r1;
	private final ModelRenderer arm_left_0_r1;
	private final ModelRenderer arm_left_r1;
	private final ModelRenderer snowman_arm_right;
	private final ModelRenderer arm_right_3_r1;
	private final ModelRenderer arm_right_2_r1;
	private final ModelRenderer arm_right_1_r1;
	private final ModelRenderer arm_right_r1;
	private final ModelRenderer hat;

	public EntitySnowManKing() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		snowman = new ModelRenderer(this);
		snowman.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(snowman);
		

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

		snowman_buttons = new ModelRenderer(this);
		snowman_buttons.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman.addChild(snowman_buttons);
		snowman_buttons.cubeList.add(new ModelBox(snowman_buttons, 0, 0, -1.0F, -6.0F, -9.0F, 2, 2, 1, 0.0F, false));
		snowman_buttons.cubeList.add(new ModelBox(snowman_buttons, 0, 0, -1.0F, -10.0F, -9.0F, 2, 2, 1, 0.0F, false));
		snowman_buttons.cubeList.add(new ModelBox(snowman_buttons, 0, 0, -1.0F, -14.0F, -9.0F, 2, 2, 1, 0.0F, false));
		snowman_buttons.cubeList.add(new ModelBox(snowman_buttons, 0, 0, -1.0F, -20.0F, -7.0F, 2, 2, 1, 0.0F, false));
		snowman_buttons.cubeList.add(new ModelBox(snowman_buttons, 0, 0, -1.0F, -24.0F, -7.0F, 2, 2, 1, 0.0F, false));

		snowman_arms = new ModelRenderer(this);
		snowman_arms.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman.addChild(snowman_arms);
		

		snowman_arm_left = new ModelRenderer(this);
		snowman_arm_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman_arms.addChild(snowman_arm_left);
		

		arm_left_2_r1 = new ModelRenderer(this);
		arm_left_2_r1.setRotationPoint(-11.0F, -19.5F, -0.5F);
		snowman_arm_left.addChild(arm_left_2_r1);
		setRotationAngle(arm_left_2_r1, 0.0436F, 2.3562F, -0.4363F);
		arm_left_2_r1.cubeList.add(new ModelBox(arm_left_2_r1, 0, 0, -7.0F, -10.5F, -0.5F, 7, 1, 1, 0.0F, false));

		arm_left_1_r1 = new ModelRenderer(this);
		arm_left_1_r1.setRotationPoint(-11.0F, -19.5F, -0.5F);
		snowman_arm_left.addChild(arm_left_1_r1);
		setRotationAngle(arm_left_1_r1, 0.0F, 1.309F, -0.4363F);
		arm_left_1_r1.cubeList.add(new ModelBox(arm_left_1_r1, 0, 0, -7.0F, -10.5F, -0.5F, 7, 1, 1, 0.0F, false));

		arm_left_0_r1 = new ModelRenderer(this);
		arm_left_0_r1.setRotationPoint(-17.0F, -22.5F, 0.5F);
		snowman_arm_left.addChild(arm_left_0_r1);
		setRotationAngle(arm_left_0_r1, 0.0F, 0.0F, -0.5236F);
		arm_left_0_r1.cubeList.add(new ModelBox(arm_left_0_r1, 0, 0, -2.0F, -4.5F, -0.5F, 7, 1, 1, 0.0F, false));

		arm_left_r1 = new ModelRenderer(this);
		arm_left_r1.setRotationPoint(-13.0F, -19.5F, 0.5F);
		snowman_arm_left.addChild(arm_left_r1);
		setRotationAngle(arm_left_r1, 0.0F, 0.0F, 0.7854F);
		arm_left_r1.cubeList.add(new ModelBox(arm_left_r1, 0, 0, -9.0F, -5.5F, -0.5F, 16, 1, 1, 0.0F, false));

		snowman_arm_right = new ModelRenderer(this);
		snowman_arm_right.setRotationPoint(26.0F, -1.0F, 8.0F);
		snowman_arms.addChild(snowman_arm_right);
		setRotationAngle(snowman_arm_right, 0.0F, 2.7925F, -0.0436F);
		

		arm_right_3_r1 = new ModelRenderer(this);
		arm_right_3_r1.setRotationPoint(11.7054F, -27.0268F, 1.541F);
		snowman_arm_right.addChild(arm_right_3_r1);
		setRotationAngle(arm_right_3_r1, 0.0436F, 2.3562F, -0.4363F);
		arm_right_3_r1.cubeList.add(new ModelBox(arm_right_3_r1, 0, 0, -5.4189F, -2.237F, 0.4458F, 7, 1, 1, 0.0F, false));

		arm_right_2_r1 = new ModelRenderer(this);
		arm_right_2_r1.setRotationPoint(11.7054F, -27.0268F, 1.541F);
		snowman_arm_right.addChild(arm_right_2_r1);
		setRotationAngle(arm_right_2_r1, 0.0F, 1.309F, -0.4363F);
		arm_right_2_r1.cubeList.add(new ModelBox(arm_right_2_r1, 0, 0, -5.079F, -2.2861F, -1.2166F, 7, 1, 1, 0.0F, false));

		arm_right_1_r1 = new ModelRenderer(this);
		arm_right_1_r1.setRotationPoint(11.7054F, -27.0268F, 1.541F);
		snowman_arm_right.addChild(arm_right_1_r1);
		setRotationAngle(arm_right_1_r1, 0.0F, 0.0F, -0.5236F);
		arm_right_1_r1.cubeList.add(new ModelBox(arm_right_1_r1, 0, 0, -6.6063F, -1.9324F, -1.541F, 7, 1, 1, 0.0F, false));

		arm_right_r1 = new ModelRenderer(this);
		arm_right_r1.setRotationPoint(11.7054F, -27.0268F, 1.541F);
		snowman_arm_right.addChild(arm_right_r1);
		setRotationAngle(arm_right_r1, 0.0F, 0.0F, 0.7854F);
		arm_right_r1.cubeList.add(new ModelBox(arm_right_r1, 0, 0, -2.7624F, -1.0932F, -1.541F, 16, 1, 1, 0.0F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowman.addChild(hat);
		hat.cubeList.add(new ModelBox(hat, 0, 0, -2.0F, -41.0F, -2.0F, 4, 2, 4, 0.0F, false));
		hat.cubeList.add(new ModelBox(hat, 0, 0, -6.0F, -37.0F, -6.0F, 12, 2, 12, 0.0F, false));
		hat.cubeList.add(new ModelBox(hat, 0, 0, -4.0F, -39.0F, -4.0F, 8, 2, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}