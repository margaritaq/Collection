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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character b : container) {
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
    }

    public int length() {
        return container.size();
    }

    public char charAt(int index) {
        return container.get(index);
    }


    public int indexOf(char character) {
        return container.indexOf(character);
    }

    CharList subString(int start, int end) {
        return new CharList(new ArrayList<Character>(container.subList(start, end)));
    }

    CharList removeDuplicates() {
        HashSet<Character> listOfCharacters = new HashSet<Character>(container);
        return new CharList(new ArrayList(listOfCharacters));
    }

    CharList removeFirst(Character character) {
        container.remove(character);
        return new CharList(new ArrayList<Character>(container));
    }

    CharList removeAll(Character character) {
        container.removeAll(Collections.singleton(character));
        return new CharList(container);
    }

    boolean isEmpty() {
        return container.isEmpty();
    }

    boolean contains(Character character) {
        return container.contains(character);
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
        ArrayList<Character> mix = new ArrayList<Character>(container);
        Collections.shuffle(mix);
        return new CharList(mix);
    }


}
