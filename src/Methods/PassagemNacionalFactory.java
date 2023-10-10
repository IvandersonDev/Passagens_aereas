package Methods;

import Abstract.Passagem;
import Interfaces.AbstractPassagemFactory;

public class PassagemNacionalFactory implements AbstractPassagemFactory {
    public Passagem criarPassagem() {
        return new PassagemNacional();
    }
}