package apps;
//Classe abstrata
public abstract class ServicoMensagemInstantanea {
    
    //Metodos abstratos
    //Metodos sem corpo, finalizados com ponto e virgula.
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um metodo que todos os filhos deverao implementar
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando mensagem.");
    }

    //somente os filhos conhecem este metodo
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet.");
    }
}
