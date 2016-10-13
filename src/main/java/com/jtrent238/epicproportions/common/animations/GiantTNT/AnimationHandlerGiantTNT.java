package com.jtrent238.epicproportions.common.animations.GiantTNT;

import java.util.HashMap;

import com.jtrent238.epicproportions.common.MCACommonLibrary.IMCAnimatedEntity;
import com.jtrent238.epicproportions.common.MCACommonLibrary.animation.AnimationHandler;
import com.jtrent238.epicproportions.common.MCACommonLibrary.animation.Channel;

public class AnimationHandlerGiantTNT extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
static
{
}
	public AnimationHandlerGiantTNT(IMCAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame) {
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name) {
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, float prevFrame, float frame) {
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame, float frame) {
	}}