//1. Написать программу по возведению числа в степень с помощью рекурсии.
//2. Написать программу «Задача о рюкзаке» с помощью рекурсии.


public class Main {

    public static void main(String[] args) {
        Exponentiation ex = new Exponentiation();
        int result = ex.expNumber(2, 30);
        System.out.println(result);

    }

}
