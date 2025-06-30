class Bank{
    static int bankId = 101;
    static String bankName = "State Bank";
    static String ifsc = "SBIN0001234";
    static String branch = "Main Branch";
    static String location = "New Delhi";
    static String manager = "Mr. Sharma";
    static int employees = 120;
    static double atmCount = 30;
    static String headOffice = "Mumbai";
    static boolean isInternational = true;
    static double interestRate = 6.5;
    static String establishedYear = "1955";
    static boolean onlineBanking = true;
    static String swiftCode = "SBININBBXXX";
    static String currency = "INR";
    static String contactEmail = "help@statebank.com";
    static long contactPhone = 1800123456L;
    static String licenseNo = "SB1234567";
    static boolean upiEnabled = true;
    static String bankType = "Public";

    public static void main(String Bank[]) {
        System.out.println("Bank Name: " + bankName);
        System.out.println("IFSC: " + ifsc);
        System.out.println("Branch: " + branch);
        System.out.println("Manager: " + manager);
        System.out.println("Location: " + location);
        System.out.println("Total Employees: " + employees);
        System.out.println("ATM Count: " + atmCount);
        System.out.println("Head Office: " + headOffice);
        System.out.println("Is International: " + isInternational);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Online Banking: " + onlineBanking);
        System.out.println("SWIFT Code: " + swiftCode);
        System.out.println("Currency: " + currency);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("License No: " + licenseNo);
        System.out.println("UPI Enabled: " + upiEnabled);
        System.out.println("Bank Type: " + bankType);
    }
}
