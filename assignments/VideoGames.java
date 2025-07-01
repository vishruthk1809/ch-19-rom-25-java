class VideoGames {
    static int gameId;
    static String name;
    static String genre;
    static String platform;
    static boolean isMultiplayer;
    static boolean isOnline;
    static int minAge;
    static boolean isFreeToPlay;
    static double price;
    static double rating;
    static String developer;
    static String publisher;
    static String releaseDate;
    static boolean hasInGamePurchases;
    static boolean supportsController;
    static boolean crossPlatformPlay;
    static boolean VRSupport;
    static int downloadSizeGB;
    static boolean storyModeAvailable;
    static boolean coOpModeAvailable;

    public static void main(String VideoGames[]) {
        System.out.println("Game ID: " + gameId);
        gameId = 1101;
        System.out.println("Game ID: " + gameId);

        System.out.println("Game Name: " + name);
        name = "Call of Duty";
        System.out.println("Game Name: " + name);

        System.out.println("Genre: " + genre);
        genre = "Action";
        System.out.println("Genre: " + genre);

        System.out.println("Platform: " + platform);
        platform = "PC";
        System.out.println("Platform: " + platform);

        System.out.println("Multiplayer: " + isMultiplayer);
        isMultiplayer = true;
        System.out.println("Multiplayer: " + isMultiplayer);

        System.out.println("Online: " + isOnline);
        isOnline = true;
        System.out.println("Online: " + isOnline);

        System.out.println("Minimum Age: " + minAge);
        minAge = 16;
        System.out.println("Minimum Age: " + minAge);

        System.out.println("Free to Play: " + isFreeToPlay);
        isFreeToPlay = false;
        System.out.println("Free to Play: " + isFreeToPlay);

        System.out.println("Price: " + price);
        price = 2999.0;
        System.out.println("Price: " + price);

        System.out.println("Rating: " + rating);
        rating = 4.5;
        System.out.println("Rating: " + rating);

        System.out.println("Developer: " + developer);
        developer = "Activision";
        System.out.println("Developer: " + developer);

        System.out.println("Publisher: " + publisher);
        publisher = "Activision";
        System.out.println("Publisher: " + publisher);

        System.out.println("Release Date: " + releaseDate);
        releaseDate = "10-Nov-2022";
        System.out.println("Release Date: " + releaseDate);

        System.out.println("In-game Purchases: " + hasInGamePurchases);
        hasInGamePurchases = true;
        System.out.println("In-game Purchases: " + hasInGamePurchases);

        System.out.println("Controller Support: " + supportsController);
        supportsController = true;
        System.out.println("Controller Support: " + supportsController);

        System.out.println("Cross Platform Play: " + crossPlatformPlay);
        crossPlatformPlay = true;
        System.out.println("Cross Platform Play: " + crossPlatformPlay);

        System.out.println("VR Support: " + VRSupport);
        VRSupport = false;
        System.out.println("VR Support: " + VRSupport);

        System.out.println("Download Size (GB): " + downloadSizeGB);
        downloadSizeGB = 120;
        System.out.println("Download Size (GB): " + downloadSizeGB);

        System.out.println("Story Mode Available: " + storyModeAvailable);
        storyModeAvailable = true;
        System.out.println("Story Mode Available: " + storyModeAvailable);

        System.out.println("Co-op Mode Available: " + coOpModeAvailable);
        coOpModeAvailable = true;
        System.out.println("Co-op Mode Available: " + coOpModeAvailable);
    }
}
