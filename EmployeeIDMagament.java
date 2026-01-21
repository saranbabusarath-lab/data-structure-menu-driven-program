import java.util.Scanner;

public class EmployeeIDMagament
 {
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int[] emp = new int[100]; // array to store employee IDs
        int n = 0;                // number of employee IDs
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                // INSERTION
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    emp[n] = id;   // insert at end
                    n++;
                    System.out.println("Employee ID added.");
                    break;

                // DELETION using LINEAR SEARCH
                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int delId = sc.nextInt();
                    int pos = -1;

                    // SEARCH
                    for (int i = 0; i < n; i++) {
                        if (emp[i] == delId) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos != -1) {
                        // shift elements after deletion
                        for (int i = pos; i < n - 1; i++) {
                            emp[i] = emp[i + 1];
                        }
                        n--;
                        System.out.println("Employee ID removed.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                // TRAVERSAL
                case 3:
                    if (n == 0) {
                        System.out.println("No employee IDs to display.");
                    } else {
                        System.out.println("\nEmployee IDs:");
                        for (int i = 0; i < n; i++) {
                            System.out.print(emp[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
