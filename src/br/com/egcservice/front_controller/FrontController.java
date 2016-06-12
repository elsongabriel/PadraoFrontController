package br.com.egcservice.front_controller;


/**
 * Created by elson on 12/06/2016.
 */
public class FrontController {
    private Comando comando;

    public FrontController() {
        comando = new Comando();
    }

    private void paginaSelecionada(String pagina) {
        System.out.println("Página selecionada : " + pagina);
    }

    private boolean usuarioLogado() {
        System.out.println("Usuário está atualmente logado..");
        return true;
    }

    public void entrarPage(String page) {
        paginaSelecionada(page);

        if (usuarioLogado()) {
            comando.abrirPaginaSelecionada(page);
        }
    }
}
