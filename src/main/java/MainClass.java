

public class MainClass {
    public static void main(String[] args) {
        CharList a = new CharList("acb123123");
        System.out.println("Method toString: " + a.toString());
        System.out.println("Method length: " + a.length());
        System.out.println("Method charAt: " + a.charAt(2));
        System.out.println("Method indexOf: " + a.indexOf('1'));
        System.out.println("Method subString: " + a.subString(3, 5));
        System.out.println("Method removeDublicate: " + a.removeDuplicates());
        System.out.println(a.toString());
        System.out.println("Method removeFirst: " + a.removeFirst('1'));
        System.out.println("Method removeAll: " + a.removeAll('1'));
        System.out.println("Method contains: " + a.contains('q'));
        System.out.println("Method contains: " + a.contains('a'));
        System.out.println("Method sortList: " + a.sortList());
        System.out.println(a.toString());
        System.out.println("Method reversList: " + a.reverseList());
        System.out.println("Method mixedList: " + a.mixedList());
        System.out.println("Method clearList: " + a.clearList());
        System.out.println("Method isEmpty: " + a.isEmpty());

    }
}
