package br.com.egcservice.front_controller;

/**
 * Created by elson on 12/06/2016.
 */
public class Comando {
    private ViewIndex viewIndex;
    private ViewPerfil viewPerfil;

    public Comando() {
        viewIndex = new ViewIndex();
        viewPerfil = new ViewPerfil();
    }

    public void abrirPaginaSelecionada(String pagina) {
        if (pagina.equals("index")) {
            viewIndex.abrirPagina();
        } else {
            viewPerfil.abrirPagina();
        }
    }
}
