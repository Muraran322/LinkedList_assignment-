
package studdybuddy_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class StuddyBuddy_LinkedList {

    public static void main(String[] args) {
        LinkedList<String>st = new LinkedList<>();

        st.add("Studdy 1");
        st.add("Studdy 2");
        st.add("Studdy 3");
        st.add("Studdy 4");
        st.add("Studdy 5");
        st.add("Studdy 6");
        st.add("Studdy 7");
        st.add("Studdy 8");
        st.add("Studdy 9");
        st.add("Studdy 10");
        
        JOptionPane.showMessageDialog(null, st, "After Appending Elements: ", JOptionPane.INFORMATION_MESSAGE);
        
         // Iterate through all elements in the linked list
        for (String element : st) {
            JOptionPane.showMessageDialog(null, element, "Iterating through Elements: ", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Iterate a linked list in reverse order
        ListIterator<String> iterator = st.listIterator(st.size());
        while (iterator.hasPrevious()) {
            JOptionPane.showMessageDialog(null, iterator.previous(), "Iterating in reverse Order: ", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Insert the specified element at the specified position in the linked list
        st.add(5, "HELLO LILIAN");
        JOptionPane.showMessageDialog(null, st, "Afret inserting at Position 5: ", JOptionPane.INFORMATION_MESSAGE);
        
        // Insert elements into the linked list at the first and last positions
        st.addFirst("Our Group is called StuddyBuddy");
        st.addLast("So How do you rate our Work💀");
        JOptionPane.showMessageDialog(null, st, "After inserting at first and last positions: ", JOptionPane.INFORMATION_MESSAGE);

        // Insert the specified element at the front of a linked list
        st.addFirst("Morning Dr");
        JOptionPane.showMessageDialog(null, st, "After inserting at the front: ", JOptionPane.INFORMATION_MESSAGE);

        // Display elements and their positions in a linked list
        for (int i = 0; i < st.size(); i++) {
            JOptionPane.showMessageDialog(null, st.get(i), "Position "+i, JOptionPane.INFORMATION_MESSAGE);
        }
        
        // Remove a specified element from a linked list
        st.remove("HELLO LILIAN");
        JOptionPane.showMessageDialog(null, st, "After removing 'Hello Lilian': ", JOptionPane.INFORMATION_MESSAGE);

        // Remove the first and last elements from a linked list
        st.removeFirst();
        st.removeLast();
        JOptionPane.showMessageDialog(null, st, "After removing first and last elements ", JOptionPane.INFORMATION_MESSAGE);

        // Remove all elements from a linked list
        st.clear();
        JOptionPane.showMessageDialog(null, st, "After removing ALL elements ", JOptionPane.INFORMATION_MESSAGE);
    }
}   
