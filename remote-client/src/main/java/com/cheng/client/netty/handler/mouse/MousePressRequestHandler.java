package com.cheng.client.netty.handler.mouse;

import com.cheng.api.handler.MyHandler;
import com.cheng.api.protocol.Command;
import com.cheng.api.protocol.client.mouse.MousePressRequest;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service(Command.MOUSE_PRESS)
public class MousePressRequestHandler implements MyHandler {
    @Autowired
    Robot robot;

    @Override
    public void handler(Object params, ChannelHandlerContext handlerContext) {
        MousePressRequest releaseRequest = (MousePressRequest) params;
        robot.mousePress(releaseRequest.getBtn());
    }
}
