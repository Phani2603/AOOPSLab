package undo_redo;
interface Receiver {
    void addData(String str);
    void removeData(String str);
    String getData();
}