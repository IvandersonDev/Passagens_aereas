package Methods;

import Abstract.Passagem;
import Interfaces.AbstractPassagemFactory;

public class PassagemInternacionalFactory implements AbstractPassagemFactory {
    public Passagem criarPassagem() {
        return new PassagemInternacional();
    }
}