import java.util.Scanner;

public class Main {
    private static final String[] DEPARTMENTS = { "Technical", "Admin", "Human Resource", "Legal" };

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter the last name: ");
            String lastName = scanner.nextLine();

            Employee employee = new Employee(firstName, lastName);

            System.out.println("Please enter the department from the following");
            for (int i = 0; i < DEPARTMENTS.length; i++) {
                System.out.println((i + 1) + ". " + DEPARTMENTS[i]);
            }
            int departmentId = Integer.parseInt(scanner.nextLine());
            String department = DEPARTMENTS[departmentId-1];

            System.out.print("Enter the company name: ");
            String companyName = scanner.nextLine();


            CredentialService.showCredentials(employee, department, companyName);
        }catch (Exception e){
            System.out.println("Oops, Something went wrong.\nRe-run the program and enter valid option");
        }
    }
}