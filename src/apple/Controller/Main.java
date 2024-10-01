package apple.Controller;

import apple.Model.Atributes;
import apple.Model.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone s10 = new Smartphone("Samsung", "S10", "Android", 1111);

        s10.atender();
        s10.ligar("(85)99188-9471");
        s10.exibirPagina("www.Google.com");
    }
}
