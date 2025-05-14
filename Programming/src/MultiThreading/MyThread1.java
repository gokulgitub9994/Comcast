package MultiThreading;

import java.io.*;

class MyThread1 extends Thread {
    private String operation;
    private String fileName;
    private String content;

    public MyThread1(String operation, String fileName, String content) {
        this.operation = operation;
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public void run() {
        try {
            switch (operation.toLowerCase()) {
                case "create":
                    createFile();
                    break;
                case "read":
                    readFile();
                    break;
                case "update":
                    updateFile();
                    break;
                case "delete":
                    deleteFile();
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file operation: " + e.getMessage());
        }
    }

    private void createFile() throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            file.createNewFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(content);
            }
            System.out.println("File created successfully.");
        }
    }

    private void readFile() throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } else {
            System.out.println("File not found.");
        }
    }

    private void updateFile() throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.newLine();
                writer.write(content);
            }
            System.out.println("File updated successfully.");
        } else {
            System.out.println("File not found.");
        }
    }

    private void deleteFile() {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}
