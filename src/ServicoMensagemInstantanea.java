public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //verifica se esta conectada a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem.");
        //depois de enviar mensagem, salva a mensagem no historico
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Reebendo mensagem.");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet.");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem.");
    }
}
