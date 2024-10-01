package apple.Model;

public class Smartphone extends Atributes implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

    public Smartphone(String marca, String nome, String sistemaOperacional, int id) {
        super(marca, nome, sistemaOperacional, id);
    }

    public void exibirPagina(String url) {
        System.out.println(url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarNovaAba() {
        System.out.println("Atualizando nova aba");
    }

    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo Musica - " + musica);
    }

    public void pausar() {
        System.out.println("Pausando");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para numero - " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIAR CORREIO VOZ");
    }
}
