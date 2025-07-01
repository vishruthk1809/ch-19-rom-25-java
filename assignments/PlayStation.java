class PlayStation {
    static int consoleId;
    static String model;
    static String manufacturer;
    static int releaseYear;
    static String processor;
    static String gpu;
    static int ramGB;
    static int storageGB;
    static boolean isSSD;
    static boolean supports4K;
    static boolean supports8K;
    static boolean hasBluRayDrive;
    static int usbPorts;
    static boolean wifiEnabled;
    static boolean bluetoothEnabled;
    static boolean vrSupported;
    static String controllerModel;
    static boolean hasHDMIOutput;
    static double weightKg;
    static double priceINR;

    public static void main(String PlayStation[]) {
        System.out.println("Console ID: " + consoleId);
        consoleId = 701;
        System.out.println("Console ID: " + consoleId);

        System.out.println("Model: " + model);
        model = "PlayStation 5";
        System.out.println("Model: " + model);

        System.out.println("Manufacturer: " + manufacturer);
        manufacturer = "Sony";
        System.out.println("Manufacturer: " + manufacturer);

        System.out.println("Release Year: " + releaseYear);
        releaseYear = 2020;
        System.out.println("Release Year: " + releaseYear);

        System.out.println("Processor: " + processor);
        processor = "AMD Zen 2";
        System.out.println("Processor: " + processor);

        System.out.println("GPU: " + gpu);
        gpu = "RDNA 2";
        System.out.println("GPU: " + gpu);

        System.out.println("RAM (GB): " + ramGB);
        ramGB = 16;
        System.out.println("RAM (GB): " + ramGB);

        System.out.println("Storage (GB): " + storageGB);
        storageGB = 825;
        System.out.println("Storage (GB): " + storageGB);

        System.out.println("Is SSD: " + isSSD);
        isSSD = true;
        System.out.println("Is SSD: " + isSSD);

        System.out.println("Supports 4K: " + supports4K);
        supports4K = true;
        System.out.println("Supports 4K: " + supports4K);

        System.out.println("Supports 8K: " + supports8K);
        supports8K = false;
        System.out.println("Supports 8K: " + supports8K);

        System.out.println("Has Blu-Ray Drive: " + hasBluRayDrive);
        hasBluRayDrive = true;
        System.out.println("Has Blu-Ray Drive: " + hasBluRayDrive);

        System.out.println("USB Ports: " + usbPorts);
        usbPorts = 4;
        System.out.println("USB Ports: " + usbPorts);

        System.out.println("WiFi Enabled: " + wifiEnabled);
        wifiEnabled = true;
        System.out.println("WiFi Enabled: " + wifiEnabled);

        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);
        bluetoothEnabled = true;
        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);

        System.out.println("VR Supported: " + vrSupported);
        vrSupported = true;
        System.out.println("VR Supported: " + vrSupported);

        System.out.println("Controller Model: " + controllerModel);
        controllerModel = "DualSense";
        System.out.println("Controller Model: " + controllerModel);

        System.out.println("Has HDMI Output: " + hasHDMIOutput);
        hasHDMIOutput = true;
        System.out.println("Has HDMI Output: " + hasHDMIOutput);

        System.out.println("Weight (kg): " + weightKg);
        weightKg = 4.5;
        System.out.println("Weight (kg): " + weightKg);

        System.out.println("Price (INR): " + priceINR);
        priceINR = 49990.00;
        System.out.println("Price (INR): " + priceINR);
    }
}
