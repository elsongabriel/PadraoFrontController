package br.com.egcservice;

import br.com.egcservice.front_controller.FrontController;

public class Main {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.entrarPage("index");
        frontController.entrarPage("perfil");
        frontController.entrarPage("index");
    }
}
