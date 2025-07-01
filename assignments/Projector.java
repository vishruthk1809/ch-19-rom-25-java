class Projector {
    static int deviceId;
    static String manufacturer;
    static String seriesName;
    static String displayTechnology;
    static int brightness;
    static String lightSource;
    static int operationalHours;
    static boolean bluetoothEnabled;
    static boolean smartFeatures;
    static String connectivityOptions;
    static String nativeResolution;
    static String dynamicRange;
    static double netWeight;
    static String formFactor;
    static String installationMode;
    static boolean autoFocus;
    static String zoomCapability;
    static String builtInAudio;
    static boolean includesTripod;
    static String serviceCoverage;

    public static void main(String projector[]) {
        System.out.println("Device ID: " + deviceId);
        deviceId = 789;
        System.out.println("Device ID: " + deviceId);

        System.out.println("Manufacturer: " + manufacturer);
        manufacturer = "BenQ";
        System.out.println("Manufacturer: " + manufacturer);

        System.out.println("Series Name: " + seriesName);
        seriesName = "TK800M";
        System.out.println("Series Name: " + seriesName);

        System.out.println("Display Technology: " + displayTechnology);
        displayTechnology = "DLP";
        System.out.println("Display Technology: " + displayTechnology);

        System.out.println("Brightness: " + brightness);
        brightness = 3000;
        System.out.println("Brightness: " + brightness + " lumens");

        System.out.println("Light Source: " + lightSource);
        lightSource = "LED";
        System.out.println("Light Source: " + lightSource);

        System.out.println("Operational Hours: " + operationalHours);
        operationalHours = 20000;
        System.out.println("Operational Hours: " + operationalHours);

        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);
        bluetoothEnabled = false;
        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);

        System.out.println("Smart Features: " + smartFeatures);
        smartFeatures = true;
        System.out.println("Smart Features: " + smartFeatures);

        System.out.println("Connectivity Options: " + connectivityOptions);
        connectivityOptions = "USB, HDMI";
        System.out.println("Connectivity Options: " + connectivityOptions);

        System.out.println("Native Resolution: " + nativeResolution);
        nativeResolution = "1080p";
        System.out.println("Native Resolution: " + nativeResolution);

        System.out.println("Dynamic Range: " + dynamicRange);
        dynamicRange = "HDR10";
        System.out.println("Dynamic Range: " + dynamicRange);

        System.out.println("Net Weight: " + netWeight);
        netWeight = 3.2;
        System.out.println("Net Weight: " + netWeight + " kg");

        System.out.println("Form Factor: " + formFactor);
        formFactor = "Compact";
        System.out.println("Form Factor: " + formFactor);

        System.out.println("Installation Mode: " + installationMode);
        installationMode = "Tabletop";
        System.out.println("Installation Mode: " + installationMode);

        System.out.println("Auto Focus: " + autoFocus);
        autoFocus = true;
        System.out.println("Auto Focus: " + autoFocus);

        System.out.println("Zoom Capability: " + zoomCapability);
        zoomCapability = "1.2x Optical Zoom";
        System.out.println("Zoom Capability: " + zoomCapability);

        System.out.println("Built-in Audio: " + builtInAudio);
        builtInAudio = "5W Mono";
        System.out.println("Built-in Audio: " + builtInAudio);

        System.out.println("Includes Tripod: " + includesTripod);
        includesTripod = false;
        System.out.println("Includes Tripod: " + includesTripod);

        System.out.println("Service Coverage: " + serviceCoverage);
        serviceCoverage = "2 Years On-site";
        System.out.println("Service Coverage: " + serviceCoverage);
    }
}
