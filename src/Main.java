public class Main {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Mario", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Jonas", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Jose","Australia", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Leandro", "EUA", 28, 1.79f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Augusto", "Canada", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Lucas", "Russia", 30, 1.81f, 105.7f, 12, 2, 4);


        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[1]);
        UFC01.lutar();


    }
}