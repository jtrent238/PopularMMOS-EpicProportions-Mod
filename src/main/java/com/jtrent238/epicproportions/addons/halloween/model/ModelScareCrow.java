package com.jtrent238.epicproportions.addons.halloween.model;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScareCrow extends ModelBase {
	private final ModelRenderer stand;
	private final ModelRenderer body;
	private final ModelRenderer hat;

	public ModelScareCrow() {
		textureWidth = 64;
		textureHeight = 64;

		stand = new ModelRenderer(this);
		stand.setRotationPoint(0.0F, 24.0F, 0.0F);
		stand.cubeList.add(new ModelBox(stand, 16, 25, -1.0F, -14.0F, -1.0F, 2, 14, 2, 0.0F));
		stand.cubeList.add(new ModelBox(stand, 0, 0, -4.0F, -1.0F, -4.0F, 8, 1, 8, 0.0F));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 9, -4.0F, -17.0F, -2.0F, 8, 10, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 24, 25, 5.0F, -16.0F, -1.0F, 2, 7, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 24, 9, -7.0F, -16.0F, -1.0F, 2, 7, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 3, 4.0F, -17.0F, -1.0F, 1, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 3, 5.0F, -17.0F, -1.0F, 1, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -17.0F, -1.0F, 1, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -17.0F, -1.0F, 1, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 23, -2.0F, -21.0F, -2.0F, 4, 4, 4, 0.0F));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 24.0F, 0.0F);
		hat.cubeList.add(new ModelBox(hat, 18, 18, -3.0F, -22.0F, -3.0F, 6, 1, 6, 0.0F));
		hat.cubeList.add(new ModelBox(hat, 24, 0, -2.0F, -24.0F, -2.0F, 4, 2, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stand.render(f5);
		body.render(f5);
		hat.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}