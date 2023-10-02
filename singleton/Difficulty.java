package singleton;
/**
 * The Difficulty enum represents the difficulty levels for anagrams.
 */
public enum Difficulty {
   /**
     * Easy difficulty level.
     */
    EASY("singleton/txt/three.txt"), 
     /**
     * Medium difficulty level.
     */
    MEDIUM("singleton/txt/four.txt"), 
      /**
     * Hard difficulty level.
     */
    HARD("singleton/txt/five.txt");
    /**
     * The file name associated with the difficulty level.
     */
    public final String fileName;
 /**
     * Constructor to associate a file name with a difficulty level.
     *
     * @param fileName The file name as a String.
     */
    private Difficulty(String fileName) {
        this.fileName = fileName;
    }
}
