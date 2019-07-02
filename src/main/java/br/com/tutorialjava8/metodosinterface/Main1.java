package br.com.tutorialjava8.metodosinterface;

public class Main1 {

    public static void main(String[] args) {
        String msg = AlgumaInterface.getMensagem();
        System.out.println(msg);

        AlgumaInterface algumaInterface = new AlgumaImplementacao();

        String msgCompleta = algumaInterface.getMensagemCompleta();
        System.out.println(msgCompleta);
    }
}
