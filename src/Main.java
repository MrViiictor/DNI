public class Main {
    public static void main(String[] args) {
        Dni dni1 = new Dni(24550510, 'B');
        System.out.println(dni1);
        System.out.println(dni1.isCorrect());
        Dni dni2 = new Dni(54879218, 'T');
        System.out.println(dni2);
        System.out.println(dni2.isCorrect());
        System.out.println(dni1.toFormattedString());
    }
}
