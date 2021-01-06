package codec;

import protocol.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import protocol.PacketCodeC;

public class PacketEncoder extends MessageToByteEncoder<Packet> {

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out){

        // 不需要创建和返回ByteBuf对象，该对象作为参数out自动返回
        PacketCodeC.INSTANCE.encode(out, packet);

    }

}