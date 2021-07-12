package lesson3;

// данный класс переворачивает строку, передаваемую в конструктор

public class ReverseString {
    MyStack<Character> reverseString = new MyStack<>();

    String inputString;

    public ReverseString(String inputString) {
        this.inputString = inputString;
    }

    public void stringToStack() {
        for (int i = 0; i < inputString.length(); i++) {
            reverseString.push(inputString.charAt(i));
        }

        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(reverseString.pop());
        }
        System.out.println();
    }
}
