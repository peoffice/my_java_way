package mark.workspace.io_tutorial.netty;

import java.io.UnsupportedEncodingException;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import mark.workspace.io_tutorial.Calculator;

/**
 * Handles a server-side channel.
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

	/**
	 * æ”¶åˆ°å®¢æˆ·ç«¯æ¶ˆæ�¯
	 * @throws UnsupportedEncodingException 
	 */
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws UnsupportedEncodingException {
		ByteBuf in = (ByteBuf) msg;
		byte[] req = new byte[in.readableBytes()];
		in.readBytes(req);
		String body = new String(req,"utf-8");
		System.out.println("æ”¶åˆ°å®¢æˆ·ç«¯æ¶ˆæ�¯:"+body);
		String calrResult = null;
		try{
			calrResult = Calculator.Instance.cal(body).toString();
		}catch(Exception e){
			calrResult = "é”™è¯¯çš„è¡¨è¾¾å¼�ï¼š" + e.getMessage();
		}
		ctx.write(Unpooled.copiedBuffer(calrResult.getBytes()));
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	/**
	 * å¼‚å¸¸å¤„ç�†
	 */
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}
}