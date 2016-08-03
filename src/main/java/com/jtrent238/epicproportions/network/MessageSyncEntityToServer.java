package com.jtrent238.epicproportions.network;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.entity.EntityPat;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class MessageSyncEntityToServer implements IMessage 
{
    private int entityId ;
    private NBTTagCompound entitySyncDataCompound;

    public MessageSyncEntityToServer() 
    { 
     // need this constructor
    }

    public MessageSyncEntityToServer(int parEntityId, NBTTagCompound parTagCompound) 
    {
     entityId = parEntityId;
        entitySyncDataCompound = parTagCompound;
        // DEBUG
        System.out.println("SyncEntityToClient constructor");
    }

    @Override
    public void fromBytes(ByteBuf buf) 
    {
     entityId = ByteBufUtils.readVarInt(buf, 4);
     entitySyncDataCompound = ByteBufUtils.readTag(buf); // this class is very useful in general for writing more complex objects
     // DEBUG
     System.out.println("fromBytes");
    }

    @Override
    public void toBytes(ByteBuf buf) 
    {
     ByteBufUtils.writeVarInt(buf, entityId, 4);
     ByteBufUtils.writeTag(buf, entitySyncDataCompound);
        // DEBUG
        System.out.println("toBytes encoded");
    }

    public static class Handler implements IMessageHandler<MessageSyncEntityToServer, IMessage> 
    {
        @Override
        public IMessage onMessage(MessageSyncEntityToServer message, MessageContext ctx) 
        {
            EntityPlayer thePlayer = EpicProportionsMod.proxy.getPlayerEntityFromContext(ctx);
            EntityPat theEntity = (EntityPat)thePlayer.worldObj
                  .getEntityByID(message.entityId);
            theEntity.setSyncDataCompound(message.entitySyncDataCompound);
            // DEBUG
            System.out.println("MessageSyncEnitityToClient onMessage(), entity ID = "
                  +message.entityId);
            return null; // no response in this case
        }

    }
}