package luis.POOIphone.Navegador;

public class NavegadorWebImpl implements NavegadorWeb {
    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo Página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🌐 Nova aba adicionada com sucesso.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 Página atualizada.");
    }
}

