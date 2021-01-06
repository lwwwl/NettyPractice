package client.console;

import io.netty.channel.Channel;
import protocol.request.ListGroupMembersRequestPacket;

import java.util.Scanner;

public class ListGroupMembersConsoleCommand implements ConsoleCommand{

    @Override
    public void exec(Scanner scanner, Channel channel){
        ListGroupMembersRequestPacket listGroupMembersRequestPacket = new ListGroupMembersRequestPacket();

        System.out.println("输入 groupId 获取成员列表：");
        String groupId = scanner.next();

        listGroupMembersRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(listGroupMembersRequestPacket);
    }

}
