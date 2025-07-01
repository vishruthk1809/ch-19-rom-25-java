class Projector{
    static int projectorId = 301;
    static String brand = "Epson";
    static String model = "EB-X41";
    static String resolution = "XGA";
    static int lumens = 3600;
    static String lampType = "UHE";
    static int lampLife = 10000;
    static boolean hdmiSupport = true;
    static boolean wireless = true;
    static String inputPorts = "HDMI, VGA";
    static String aspectRatio = "4:3";
    static String contrastRatio = "15000:1";
    static double weight = 2.5;
    static String size = "Medium";
    static String mountType = "Ceiling";
    static boolean keystoneCorrection = true;
    static String focusType = "Manual";
    static String speakerOutput = "2W";
    static boolean remoteControl = true;
    static String warranty = "3 Years";
    
    public static void main(String Epson[])
        System.out.println("Projector ID: " + Projector.projectorId);
        System.out.println("Brand: " + Projector.brand);
        System.out.println("Model: " + Projector.model);
        System.out.println("Resolution: " + Projector.resolution);
        System.out.println("Lumens: " + Projector.lumens);
        System.out.println("Lamp Type: " + Projector.lampType);
        System.out.println("Lamp Life: " + Projector.lampLife + " hours");
        System.out.println("HDMI Support: " + Projector.hdmiSupport);
        System.out.println("Wireless: " + Projector.wireless);
        System.out.println("Input Ports: " + Projector.inputPorts);
        System.out.println("Aspect Ratio: " + Projector.aspectRatio);
        System.out.println("Contrast Ratio: " + Projector.contrastRatio);
        System.out.println("Weight: " + Projector.weight + " kg");
        System.out.println("Size: " + Projector.size);
        System.out.println("Mount Type: " + Projector.mountType);
        System.out.println("Keystone Correction: " + Projector.keystoneCorrection);
        System.out.println("Focus Type: " + Projector.focusType);
        System.out.println("Speaker Output: " + Projector.speakerOutput);
        System.out.println("Remote Control: " + Projector.remoteControl);
        System.out.println("Warranty: " + Projector.warranty);
    }
}
