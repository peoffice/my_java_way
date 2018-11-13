package mark.workspace.io_tutorial.netty;

import java.io.UnsupportedEncodingException;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter {
	
	ChannelHandlerContext ctx;
	/**
	 * tcpé“¾è·¯ç®€åŽ†æˆ�åŠŸå�Žè°ƒç”¨
	 */
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		this.ctx = ctx;
		sendMsg("å®¢æˆ·ç«¯æ¶ˆæ�¯");
	}
	
	public boolean sendMsg(String msg){
		System.out.println("å®¢æˆ·ç«¯å�‘é€�æ¶ˆæ�¯ï¼š"+msg);
		byte[] req = msg.getBytes();
		ByteBuf m = Unpooled.buffer(req.length);
		m.writeBytes(req);
		ctx.writeAndFlush(m);
		return msg.equals("q")?false:true;
	}
	
	/**
	 * æ”¶åˆ°æœ�åŠ¡å™¨æ¶ˆæ�¯å�Žè°ƒç”¨
	 * @throws UnsupportedEncodingException 
	 */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws UnsupportedEncodingException {
        ByteBuf buf = (ByteBuf) msg;
		byte[] req = new byte[buf.readableBytes()];
		buf.readBytes(req);
		String body = new String(req,"utf-8");
		System.out.println("æœ�åŠ¡å™¨æ¶ˆæ�¯ï¼š"+body);
    }
    /**
     * å�‘ç”Ÿå¼‚å¸¸æ—¶è°ƒç”¨
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
