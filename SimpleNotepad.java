import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple Notepad");
        frame.setSize(600, 400);

        // Text Area
        TextArea textArea = new TextArea();
        frame.add(textArea, BorderLayout.CENTER);

        // Menu Bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");

        // Menu Items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add Action Listeners
        newItem.addActionListener(e -> textArea.setText(""));
        openItem.addActionListener(e -> openFile(textArea));
        saveItem.addActionListener(e -> saveFile(textArea));
        exitItem.addActionListener(e -> System.exit(0));

        // Add to Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setMenuBar(menuBar);

        // Close Window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private static void openFile(TextArea textArea) {
        FileDialog fileDialog = new FileDialog((Frame) null, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);
        String filePath = fileDialog.getDirectory() + fileDialog.getFile();
        if (filePath != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                textArea.setText("");
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException e) {
                textArea.setText("Error opening file: " + e.getMessage());
            }
        }
    }

    private static void saveFile(TextArea textArea) {
        FileDialog fileDialog = new FileDialog((Frame) null, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);
        String filePath = fileDialog.getDirectory() + fileDialog.getFile();
        if (filePath != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                textArea.setText("Error saving file: " + e.getMessage());
            }
        }
    }
}
