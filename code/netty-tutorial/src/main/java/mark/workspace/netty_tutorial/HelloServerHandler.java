package mark.workspace.netty_tutorial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

public class HelloServerHandler extends ChannelInboundHandlerAdapter{
	@Override
	public void channelRead(ChannelHandlerContext ctx,Object msg) throws Exception{
		try{
			ByteBuf in = (ByteBuf)msg;
			System.out.println(in.toString(CharsetUtil.UTF_8));
		}finally{
			ReferenceCountUtil.release(msg);
		}
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause) throws Exception{
		cause.printStackTrace();
		ctx.close();
	}
}
