import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        Cidade c = new Cidade();
        c.setNome("Pidaíba");
        PessoaRecordShallow pShallow = new PessoaRecordShallow("José", c);
        System.out.println(pShallow);
        pShallow.cidade().setNome("São Paulo");
        System.out.println(pShallow);
    }
}
