package com.yogpc.qp;

import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class YogpstopPacketCodec extends FMLIndexedMessageToMessageCodec<YogpstopPacket> {

    public YogpstopPacketCodec() {
        addDiscriminator(0, YogpstopPacket.class);
    }

    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final YogpstopPacket msg, final ByteBuf target)
        throws Exception {
        msg.writeData(target);
    }

    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf source, final YogpstopPacket msg) {
        msg.readData(source, ctx);
    }

}
