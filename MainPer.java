public class MainPer {
    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.setNome(" artemis ");
        p1.escolherPersonagem(" Arqueiro ");
        p1.vida(500);

        Personagem p2 = new Personagem();
        p2.setNome("eduardo");
        p2.escolherPersonagem("Feiticeiro");
        p2.vida(500);




        p1.Status();
        p2.Status();
    }
}
