//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class task12 {
    public static void main(String[] args) {
        int a1 = 9;    /** Начало Задача 1 **/
        int b1 = 9;
        System.out.printf("«Задача 1» : ");
        if (a1 % 2 == 0) {
            if (b1 % 2 == 0) {
                System.out.println("«Удачное совпадение»");
            }
            else {System.out.println(" ");}  /** Переход на новую строку **/
        }
        if (a1 % 2 != 0) {
            if (b1 % 2 != 0) {
                System.out.println("«Удачное совпадение»");
            }
            else {System.out.println(" ");}  /** Переход на новую строку **/
        }      /** Конец Задача 1 **/


        int a2 = 19;   /** Начало Задача 2 **/
        System.out.printf("«Задача 2» : ");
        if (a2 <= 10) {
            System.out.println(a2 + " - Первая декада месяца");
        }
        else if (a2 <= 20) {
            System.out.println(a2 + " - Вторая декада месяца");
        }
        else if (a2 <= 31) {
            System.out.println(a2 + " - Третья декада месяца");
        }             /** Конец Задача 2 **/
    }
}