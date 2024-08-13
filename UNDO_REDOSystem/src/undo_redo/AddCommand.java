package undo_redo;

class AddCommand implements Command {
    private String data;
    private Receiver receiver;

    public AddCommand(String data, Receiver receiver) {
        this.data = data;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addData(data);
    }

    @Override
    public void undo() {
        receiver.removeData(data);
    }
}