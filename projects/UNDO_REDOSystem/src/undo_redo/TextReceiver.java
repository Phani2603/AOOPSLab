package undo_redo;

class TextReceiver implements Receiver {
    private String data = "";

    @Override
    public void addData(String str) {
        data += str;
    }

    @Override
    public void removeData(String str) {
        data = data.replace(str, "");
    }

    @Override
    public String getData() {
        return data;
    }
}
