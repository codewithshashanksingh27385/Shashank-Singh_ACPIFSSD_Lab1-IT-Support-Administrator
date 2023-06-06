import java.util.Random;

class CredentialService {
    private static final String COMPANY_DOMAIN = "company.com";
    private static final String[] DEPARTMENTS = { "Technical", "Admin", "Human Resource", "Legal" };
    private static final String PASSWORD_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";

    public static String generateEmailAddress(Employee employee, String department, String companyName) {
        String email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" +
                department.toLowerCase().replace(" ", "") + "." + companyName + ".com";
        return email;
    }

    public static String generatePassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(PASSWORD_CHARS.length());
            password.append(PASSWORD_CHARS.charAt(index));
        }
        return password.toString();
    }

    public static void showCredentials(Employee employee, String department, String companyName) {
        String email = generateEmailAddress(employee, department, companyName);
        String password = generatePassword();
        System.out.println("Credentials for " + employee.getFirstName() + " " + employee.getLastName() + ":");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
