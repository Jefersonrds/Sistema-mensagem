import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;
        /*
         * Nao se sabe qual app
         * mas qualquer um devera enviar e receber mensagem
         */

         String appEscolhido = "msn";
         if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
            
         }else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
            
         }else if (appEscolhido.equals("telegram")) {
            smi = new TelegramMessenger();
            
         }

         smi.enviarMensagem();
         smi.receberMensagem();
    }
}
