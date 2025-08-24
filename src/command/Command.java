package command;

/**
 * 命令模式命令接口
 */
public interface Command {
    void execute();
}

class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.action();
    }
}