package br.com.tutorialjava8.metodosinterface;

public interface AlgumaInterface {

    static String getMensagem() {
        return "Mensagem de método estático de uma interface java.";
    }

    default String getMensagemCompleta() {
        return "Resultado: " + getMensagem();
    }
}