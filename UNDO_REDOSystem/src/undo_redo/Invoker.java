package undo_redo;
import java.util.Stack;

class Invoker {
    private Receiver receiver;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public Invoker(Receiver receiver) {
        this.receiver = receiver;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }

    public String getData() {
        return receiver.getData();
    }
}
