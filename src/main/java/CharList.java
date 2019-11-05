import java.util.*;

public class CharList {
    ArrayList<Character> container;

    private CharList(ArrayList<Character> list) {
        container = list;
    }

    public CharList() {
        container = new ArrayList<Character>();
    }

    public CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
    }

    @Override
    public String toString() {
        String a = container.toString();
        return a;
    }

    public int length() {
        return container.size();
    }

    public char charAt(int index) {
        return container.get(index);

    }

    public int indexOf(char c) {
        return container.indexOf(c);

    }

    CharList subString(int start, int end) {
        return new CharList(new ArrayList<Character>(container.subList(start, end)));

    }

    CharList removeDuplicates() {
        HashSet<Character> a = new HashSet<Character>();
        a.addAll(container);
        return new CharList(new ArrayList(a));
    }

    CharList removeFirst(Character c) {
        container.remove(c);
        return new CharList(new ArrayList<Character>(container));
    }

    CharList removeAll(Character c) {
        container.removeAll(Collections.singleton(c));
        return new CharList(container);
    }

    boolean isEmpty() {
        return container.isEmpty();
    }

    boolean contains(Character c) {
        return container.contains(c);
    }

    CharList clearList() {
        container.clear();
        return new CharList(container);
    }

    CharList sortList() {
        Collections.sort(container);
        return new CharList(container);
    }

    CharList reverseList() {
        Collections.reverse(container);
        return new CharList(container);
    }

    CharList mixedList() {
        Collections.shuffle(container);
        return new CharList(container);
    }


}
