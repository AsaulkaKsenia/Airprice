public class Main {
    public static void main(String[] args) {

        int price = 25; // рублей
        int bonus = 20; // рублей за одну милю

        int mile = price / bonus;

        System.out.println("Количество начисленных миль составляет: " + mile);

    }
}