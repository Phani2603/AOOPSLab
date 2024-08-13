package undo_redo;

class RemoveCommand implements Command {
    private String data;
    private Receiver receiver;

    public RemoveCommand(String data, Receiver receiver) {
        this.data = data;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.removeData(data);
    }

    @Override
    public void undo() {
        receiver.addData(data);
    }
}