package MultiThreading;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\nFile CRUD Operations");
            System.out.println("1. Create File");
            System.out.println("2. Read File");
            System.out.println("3. Update File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 5) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();
            String content = "";

            if (choice == 1 || choice == 3) {
                System.out.print("Enter the content (for create/update): ");
                content = scanner.nextLine();
            }

            // Create and start the corresponding thread for the chosen operation
            String operation = "";
            switch (choice) {
                case 1:
                    operation = "create";
                    break;
                case 2:
                    operation = "read";
                    break;
                case 3:
                    operation = "update";
                    break;
                case 4:
                    operation = "delete";
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            // Start the thread for file operation
            MyThread1 thread = new MyThread1(operation, fileName, content);
            thread.start();
        }
        scanner.close();
	}

}
