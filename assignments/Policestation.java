class PoliceStation {
    static int stationCode;
    static String stationName;
    static String district;
    static String zone;
    static String landmark;
    static double latitude;
    static double longitude;
    static int dailyVisitors;
    static int activeComplaints;
    static boolean isHelplineDesk;
    static boolean isChildProtectionUnit;
    static boolean isSeniorCitizenHelp;
    static boolean isTrafficControlRoom;
    static String mainLanguage;
    static String secondaryLanguage;
    static String patrolCarType;
    static boolean hasTrainingFacility;
    static int yearsOfService;
    static String currentSP;
    static boolean biometricEntry;

    public static void main(String PoliceStation[]) {
        System.out.println("Station Code: " + stationCode);
        stationCode = 982;
        System.out.println("Station Code: " + stationCode);

        System.out.println("Station Name: " + stationName);
        stationName = "Gandhi Nagar Police Station";
        System.out.println("Station Name: " + stationName);

        System.out.println("District: " + district);
        district = "Sullia";
        System.out.println("District: " + district);

        System.out.println("Zone: " + zone);
        zone = "Zone 5";
        System.out.println("Zone: " + zone);

        System.out.println("Landmark: " + landmark);
        landmark = "Near City Mall";
        System.out.println("Landmark: " + landmark);

        System.out.println("Latitude: " + latitude);
        latitude = 19.2183;
        System.out.println("Latitude: " + latitude);

        System.out.println("Longitude: " + longitude);
        longitude = 72.9781;
        System.out.println("Longitude: " + longitude);

        System.out.println("Daily Visitors: " + dailyVisitors);
        dailyVisitors = 120;
        System.out.println("Daily Visitors: " + dailyVisitors);

        System.out.println("Active Complaints: " + activeComplaints);
        activeComplaints = 87;
        System.out.println("Active Complaints: " + activeComplaints);

        System.out.println("Helpline Desk Available: " + isHelplineDesk);
        isHelplineDesk = true;
        System.out.println("Helpline Desk Available: " + isHelplineDesk);

        System.out.println("Child Protection Unit: " + isChildProtectionUnit);
        isChildProtectionUnit = true;
        System.out.println("Child Protection Unit: " + isChildProtectionUnit);

        System.out.println("Senior Citizen Help Desk: " + isSeniorCitizenHelp);
        isSeniorCitizenHelp = true;
        System.out.println("Senior Citizen Help Desk: " + isSeniorCitizenHelp);

        System.out.println("Traffic Control Room: " + isTrafficControlRoom);
        isTrafficControlRoom = false;
        System.out.println("Traffic Control Room: " + isTrafficControlRoom);

        System.out.println("Main Language: " + mainLanguage);
        mainLanguage = "Kannada";
        System.out.println("Main Language: " + mainLanguage);

        System.out.println("Secondary Language: " + secondaryLanguage);
        secondaryLanguage = "English";
        System.out.println("Secondary Language: " + secondaryLanguage);

        System.out.println("Patrol Car Type: " + patrolCarType);
        patrolCarType = "SUV";
        System.out.println("Patrol Car Type: " + patrolCarType);

        System.out.println("Training Facility Available: " + hasTrainingFacility);
        hasTrainingFacility = true;
        System.out.println("Training Facility Available: " + hasTrainingFacility);

        System.out.println("Years of Service: " + yearsOfService);
        yearsOfService = 45;
        System.out.println("Years of Service: " + yearsOfService);

        System.out.println("Current Superintendent of Police: " + currentSP);
        currentSP = "Mr. Rajesh Shetty";
        System.out.println("Current Superintendent of Police: " + currentSP);

        System.out.println("Biometric Entry Enabled: " + biometricEntry);
        biometricEntry = true;
        System.out.println("Biometric Entry Enabled: " + biometricEntry);
    }
}
