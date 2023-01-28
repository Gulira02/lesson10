
public class Main {
    public static void main(String[] args) {
        System.out.println(contains(15, 34, 5, 6, 7, 1, 3,15,33,56));
    }
    /*Кайтаруучу тиби boolean болгон метод түзүңүз,
     параметрине бир сан жана сандардын varargs-ын кабыл алсын.
    Методко биринчи берген аргументиңизди
     экинчи берген аргументтердин ичинен барбы же жокпу текшерип,
    бар болсо true, жок болсо false кайтарсын.*/

    static boolean contains (int a, int ... varargs) {
        for (int i = 0; i < varargs.length ; i++) {
            if (varargs[i] == a) {
                return true;
            }
        }
        return false;
    }
}