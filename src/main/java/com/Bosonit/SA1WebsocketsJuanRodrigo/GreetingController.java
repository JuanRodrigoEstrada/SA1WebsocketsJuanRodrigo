package com.Bosonit.SA1WebsocketsJuanRodrigo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting (HelloMessage helloMessage) throws Exception{
        Thread.sleep(1000);
        return new GreetingMessage("hello, " + HtmlUtils.htmlEscape(helloMessage.getName()) + "!");
    }

}
