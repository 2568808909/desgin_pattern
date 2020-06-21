package cn.ccb.pattern.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class Staff {

    private List<Command> commands = new LinkedList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executes() {
        commands.forEach(Command::execute);
        commands.clear();
    }
}
