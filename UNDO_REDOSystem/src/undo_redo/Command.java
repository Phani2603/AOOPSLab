package undo_redo;
interface Command {
    void execute();
    void undo();
}