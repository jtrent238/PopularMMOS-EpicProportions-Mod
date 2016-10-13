package com.jtrent238.epicproportions.client;

import java.util.HashMap;

import com.jtrent238.epicproportions.client.MCAClientLibrary.MCAModelRenderer;
import com.jtrent238.epicproportions.common.MCACommonLibrary.MCAVersionChecker;
import com.jtrent238.epicproportions.common.MCACommonLibrary.animation.AnimationHandler;
import com.jtrent238.epicproportions.common.MCACommonLibrary.math.Matrix4f;
import com.jtrent238.epicproportions.common.MCACommonLibrary.math.Quaternion;
import com.jtrent238.epicproportions.entity.EntityGiantTNT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelGiantTNT extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 5;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer tntPart0;
MCAModelRenderer tntPart1;
MCAModelRenderer tntPart2;
MCAModelRenderer tntPart3;
MCAModelRenderer tntPart4;
MCAModelRenderer tntPart5;
MCAModelRenderer tntPart6;
MCAModelRenderer tntPart7;
MCAModelRenderer tntPart8;
MCAModelRenderer tntPart9;

public ModelGiantTNT()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 32;
textureHeight = 64;

tntPart0 = new MCAModelRenderer(this, "tntPart0", 0, 0);
tntPart0.mirror = false;
tntPart0.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart0.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart0.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart0.setTextureSize(32, 64);
parts.put(tntPart0.boxName, tntPart0);

tntPart1 = new MCAModelRenderer(this, "tntPart1", 0, 0);
tntPart1.mirror = false;
tntPart1.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart1.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart1.setTextureSize(32, 64);
parts.put(tntPart1.boxName, tntPart1);

tntPart2 = new MCAModelRenderer(this, "tntPart2", 0, 0);
tntPart2.mirror = false;
tntPart2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart2.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart2.setTextureSize(32, 64);
parts.put(tntPart2.boxName, tntPart2);

tntPart3 = new MCAModelRenderer(this, "tntPart3", 0, 0);
tntPart3.mirror = false;
tntPart3.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart3.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart3.setTextureSize(32, 64);
parts.put(tntPart3.boxName, tntPart3);

tntPart4 = new MCAModelRenderer(this, "tntPart4", 0, 0);
tntPart4.mirror = false;
tntPart4.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart4.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart4.setTextureSize(32, 64);
parts.put(tntPart4.boxName, tntPart4);

tntPart5 = new MCAModelRenderer(this, "tntPart5", 0, 0);
tntPart5.mirror = false;
tntPart5.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart5.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart5.setTextureSize(32, 64);
parts.put(tntPart5.boxName, tntPart5);

tntPart6 = new MCAModelRenderer(this, "tntPart6", 0, 0);
tntPart6.mirror = false;
tntPart6.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart6.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart6.setTextureSize(32, 64);
parts.put(tntPart6.boxName, tntPart6);

tntPart7 = new MCAModelRenderer(this, "tntPart7", 0, 0);
tntPart7.mirror = false;
tntPart7.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart7.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart7.setTextureSize(32, 64);
parts.put(tntPart7.boxName, tntPart7);

tntPart8 = new MCAModelRenderer(this, "tntPart8", 0, 0);
tntPart8.mirror = false;
tntPart8.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart8.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart8.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart8.setTextureSize(32, 64);
parts.put(tntPart8.boxName, tntPart8);

tntPart9 = new MCAModelRenderer(this, "tntPart9", 0, 0);
tntPart9.mirror = false;
tntPart9.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
tntPart9.setInitialRotationPoint(0.0F, 0.0F, 0.0F);
tntPart9.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
tntPart9.setTextureSize(32, 64);
parts.put(tntPart9.boxName, tntPart9);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
//EntityGiantTNT entity = (EntityGiantTNT)par1Entity;

//AnimationHandler.performAnimationInModel(parts, entity);

//Render every non-child part
tntPart0.render(par7);
tntPart1.render(par7);
tntPart2.render(par7);
tntPart3.render(par7);
tntPart4.render(par7);
tntPart5.render(par7);
tntPart6.render(par7);
tntPart7.render(par7);
tntPart8.render(par7);
tntPart9.render(par7);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name);
}
}