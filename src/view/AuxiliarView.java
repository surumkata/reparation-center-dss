package view;

public class AuxiliarView implements ANSIICores {
    public AuxiliarView(){};


    public void errorMessage(String error){

        System.out.println(RED + error + RESET);
    }

    public void perguntaNomeDeUtilizador(){
        System.out.println("Nome de Utilizador: ");
    }

    public void perguntaPasseDeUtilizador(){
        System.out.println("Password: ");
    }

    public void perguntaNomeCliente(){
        System.out.println("Nome do cliente: ");
    }

    public void perguntaTelemovel(){
        System.out.println("Numero de telemovel: ");
    }

    public void perguntaEmail(){
        System.out.println("Email: ");
    }

}
