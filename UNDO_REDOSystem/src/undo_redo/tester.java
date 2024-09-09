package undo_redo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tester {

    private Receiver receiver;
    private Invoker invoker;

    @BeforeEach
    public void setup() {
        receiver = new TextReceiver();
        invoker = new Invoker(receiver);
    }

    @Test
    public void testAddCommand() {
        // Arrange
        String data = "Hello";

        // Act
        invoker.executeCommand(new AddCommand(data, receiver));

        // Assert
        assertEquals("Hello", invoker.getData());
    }

    @Test
    public void testRemoveCommand() {
        // Arrange
        String data = "Hello";
        invoker.executeCommand(new AddCommand(data, receiver));

        // Act
        invoker.executeCommand(new RemoveCommand(data, receiver));

        // Assert
        assertEquals("", invoker.getData());
    }

    @Test
    public void testUndo() {
        // Arrange
        String data = "Hello";
        invoker.executeCommand(new AddCommand(data, receiver));

        // Act
        invoker.undo();

        // Assert
        assertEquals("", invoker.getData());
    }

    @Test
    public void testRedo() {
        // Arrange
        String data = "Hello";
        invoker.executeCommand(new AddCommand(data, receiver));
        invoker.undo();

        // Act
        invoker.redo();

        // Assert
        assertEquals("Hello", invoker.getData());
    }

    @Test
    public void testMultipleCommands() {
        // Arrange
        String data1 = "Hello";
        String data2 = " World";

        // Act
        invoker.executeCommand(new AddCommand(data1, receiver));
        invoker.executeCommand(new AddCommand(data2, receiver));

        // Assert
        assertEquals("Hello World", invoker.getData());
    }

    @Test
    public void testUndoMultipleCommands() {
        // Arrange
        String data1 = "Hello";
        String data2 = " World";
        invoker.executeCommand(new AddCommand(data1, receiver));
        invoker.executeCommand(new AddCommand(data2, receiver));

        // Act
        invoker.undo();
        invoker.undo();

        // Assert
        assertEquals("", invoker.getData());
    }

    @Test
    public void testRedoMultipleCommands() {
        // Arrange
        String data1 = "Hello";
        String data2 = " World";
        invoker.executeCommand(new AddCommand(data1, receiver));
        invoker.executeCommand(new AddCommand(data2, receiver));
        invoker.undo();
        invoker.undo();

        // Act
        invoker.redo();
        invoker.redo();

        // Assert
        assertEquals("Hello World", invoker.getData());
    }
}