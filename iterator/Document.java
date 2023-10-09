//Laura Nolan
package iterator;

import java.util.Stack;
/**
 * The Document class represents a document and tracks changes made to it (undo and redo)
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;
    /**
     * Initializes a new instance of the Document class with the given title.
     *
     * @param title The title of the document.
     */
    public Document(String title) {
        this.title = title;
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }
/**
 * The makeChange method allows the user to make changes to the document and records those changes
 * in the undo stack.
 *
 * @param change The change to be made.
 * @return A message indicating the successful change.
 */
    public String makeChange(String change) {
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;
    }
/**
 * The undoChange method lets the user undo the most recent change that was made to the document.
 *
 * @return A message that shows what is being undone, or an error message if no changes can be undone.
 */
    public String undoChange() {
        if (canUndo()) {
            String undoneChange = undoStack.pop();
            redoStack.push(undoneChange);
            return "Undoing: " + undoneChange;
        } else {
            return "Sorry, there is nothing to undo";
        }
    }
/**
 * The canUndo method checks whether there are any changes than can be undone or not.
 *
 * @return `true` if there are changes to undo, `false` if not.
 */
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }
/**
 * The redoChange method lets the user redo a previously undone change.
 *
 * @return A message showing what was redone, or an error message if no changes can be redone.
 */
    public String redoChange() {
        if (canRedo()) {
            String redoneChange = redoStack.pop();
            undoStack.push(redoneChange);
            return "Redoing: " + redoneChange;
        } else {
            return "Sorry, there is nothing to redo";
        }
    }

/**
 * The canRedo method checks whether there are changes that can be redone.
 *
 * @return `true` if there are changes to redo, `false` if not.
 */
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
     /**
     * Gets an iterator for the undo stack.
     *
     * @return A `StackIterator` for the undo stack.
     */
    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }
    /**
     * Gets an iterator for the redo stack.
     *
     * @return A `StackIterator` for the redo stack.
     */
    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}
