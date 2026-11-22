enum NivelAcesso {
    BASICO,
    INTERMEDIARIO,
    ADMIN
}

class Usuario {
    private String nome;
    private NivelAcesso nivelAcesso;

    public Usuario(String nome, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public boolean verificarPermissao(String recurso) {
        if (nivelAcesso == null || recurso == null) {
            return false;
        }

        switch (nivelAcesso) {
            case BASICO:
                return "CONSULTAR".equals(recurso);

            case INTERMEDIARIO:
                return "CONSULTAR".equals(recurso) || "EDITAR".equals(recurso);

            case ADMIN:
                return true;

            default:
                return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }
}

public class exercicio6 {
    public static void main(String[] args) {
        Usuario contaBasica = new Usuario("Mariana", NivelAcesso.BASICO);
        Usuario contaIntermediaria = new Usuario("Diego", NivelAcesso.INTERMEDIARIO);
        Usuario contaAdmin = new Usuario("Fernanda", NivelAcesso.ADMIN);

        String[] acoes = {"CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS"};
        Usuario[] contas = {contaBasica, contaIntermediaria, contaAdmin};

        for (Usuario conta : contas) {
            System.out.println("=== Usuário: " + conta.getNome() + " (" + conta.getNivelAcesso() + ") ===");
            for (String acao : acoes) {
                boolean temAcesso = conta.verificarPermissao(acao);
                System.out.println("  -> " + acao + ": " + (temAcesso ? "AUTORIZADO" : "BLOQUEADO"));
            }
            System.out.println();
        }
    }
}