package com.jtrent238.epicproportions.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class Handler  implements IMessageHandler<MyMessage, IMessage>{

	private IMessage packets;

	@Override
    public IMessage onMessage(MyMessage message, MessageContext ctx) {
        System.out.println(String.format("Received %s from %s", message.text, ctx.getServerHandler().playerEntity.getDisplayName()));
        return packets; // no response in this case
    }

}
