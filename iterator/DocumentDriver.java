package iterator;

import java.util.Scanner;
/**
 * The DocumentDriver class runs the document editor
 * application and handles user interactions.
 */
public class DocumentDriver {
    private Scanner scanner;
    private Document document;
    /**
     * Initializes a new instance of the DocumentDriver class.
     */
    public DocumentDriver() {
        scanner = new Scanner(System.in);
    }
    /**
     * Runs the document editor application, which allows users to make changes to a document.
     */
    public void run() {
        System.out.println("Document Editor Opened");

        String documentName = getInput("Enter Document Name: ");
        document = new Document(documentName);

        
        while (executeUserChange())
            ;

        System.out.println("Goodbye :(");
    }
/**
 * The executeUserChange method handles user input for making changes, undoing or redoing something, etc.
 *
 * @return `true` if the program should continue running, `false` to exit.
 */
    private boolean executeUserChange() {
        
        String command = getInput(getMenu());

        switch (command.toLowerCase()) {
            case "u":
                undo();
                return true;
            case "r":
                redo();
                return true;
            case "c":
                change();
                return true;
            case "l":
                showChangeList();
                return true;
            case "q":
                return false;
            default:
                System.out.println("Sorry, invalid input.");
                return true;
        }
    }

/**
 * The showChangeList method displays a list of everything the user had undone and redone.
 */
    private void showChangeList() {
        System.out.println("Undo Command List:");
        showList(document.getUndoIterator());
        System.out.println("Redo Command List:");
        showList(document.getRedoIterator());
    }
/**
 * The showList method displays the items in the undo or redo stack.
 *
 * @param iterator The iterator for the stack of items.
 */
    private void showList(StackIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("  - " + iterator.next());
        }
    }

/**
 * The `change` method allows the user to make a new change to the document.
 */
    private void change() {
        String change = getInput("Enter Change: ");
        System.out.println(document.makeChange(change));
    }

/**
 * The `redo` method allows the user to redo a previously undone change.
 */
    private void redo() {
        if (document.canRedo()) {
            System.out.println(document.redoChange());
        } else {
            System.out.println("Sorry there is nothing to redo");
        }
    }
/**
 * The `undo` method allows the user to undo the most recent change.
 */
    private void undo() {
        if (document.canUndo()) {
            System.out.println(document.undoChange());
        } else {
            System.out.println("Sorry there is nothing to undo");
        }
    }
/**
 * The `getInput` method prompts the user for input and returns the text the user enterered.
 *
 * @param prompt The message to be displayed.
 * @return The user's text.
 */
    private String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

/**
 * The `getMenu` method returns the menu text.
 *
 * @return The menu text to display to the user.
 */
    private String getMenu() {
        String menu = "Press 'C' for change";
        if (document.canUndo()) {
            menu += ", 'U' for undo";
        }
        if (document.canRedo()) {
            menu += ", 'R' for redo";
        }

        return menu + ", L for change list, or Q for quit: ";
    }
    /**
     * The entry point of the application.
     *
     * @param args The command-line arguments.
     */
    public static final void main(String[] args) {
        DocumentDriver driver = new DocumentDriver();
        driver.run();
    }
}
