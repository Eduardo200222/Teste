public class Personagem {
    private String nome;
    private double vida = 1000;
    private String tipo;

    public void Status(){
        System.out.println("--------------------");
        System.out.println(" Nome " + this.getNome());
        System.out.println(" Vida " + this.getVida());
        System.out.println(" Tipo " + this.getTipo());
    }

    public void escolherPersonagem(String tipo){
        this.setTipo(tipo);

        if (tipo == "Arqueiro"){
            this.vida += 50;

        } else if (tipo == "Feiticeiro") {
            this.vida += 150;

        } else if (tipo == "Guerreiro") {
            this.vida += 250;

        }
        System.out.println("Escolhemos o Personagem:");
    }

    public void vida(double life){
        this.setVida(getVida() + life);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
