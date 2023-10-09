package iterator;

import java.util.Stack;
import java.util.Iterator;
/**
 * The StackIterator class is used to create an iterator for a stack of strings.
 */
public class StackIterator {
    private Stack<String> items;
    private Iterator<String> iterator;
    /**
     * Initializes a new instance of the StackIterator class with the given stack of strings.
     *
     * @param items The stack of strings to iterate over.
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
        this.iterator = items.iterator();
    }
    /**
     * Gets the next element in the stack.
     *
     * @return The next element in the stack.
     */
    public String next() {
        return iterator.next();
    }
    /**
     * Checks if there are more elements in the stack to iterate over.
     *
     * @return `true` if there are more elements, `false` otherwise.
     */
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
