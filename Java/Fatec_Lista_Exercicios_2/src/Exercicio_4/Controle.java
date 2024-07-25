package Exercicio_4;

public class Controle {
    private boolean status;
    private int volume;
    private int canal;

    public Controle(boolean status, int volume, int canal) {
        this.status = status;
        this.volume = volume;
        this.canal = canal;

    }

    /**
     * Liga o controle
     * @return
     */
    public String ligar() {
        String mensagem = "Controle ligado!";
        this.status = true;
        return mensagem;
    }

    /**
     * Desliga o controle
     * @return
     */
    public String desligar() {
        String mensagem = "Controle desligado!";
        this.status = false;
        return mensagem;
    }

    /**
     * Aumenta o volume de 1 em 1
     * @param valor
     * @return
     */
    public String aumentarVolume(int valor) {
        String mensagem ="";
        if(status == true) {
            if (valor <= 1) {
                volume += valor;
                mensagem = "Volume = " + volume;
                return mensagem;
            } else {
                mensagem = "Não é possivel aumentar mais do que 1 por vez";
                return mensagem;

            }
        }else{
            return mensagem = "O controle esta desligado, ligue-o para realizar a operação";
        }
    }

    /**
     * Diminui o volume de 1 em 1
     * @param valor
     * @return
     */
    public String diminuirVolume(int valor) {
        String mensagem ="";
        if(status == true) {
            if (valor <= 1) {
                volume -= valor;
                mensagem = "Volume = " + volume;
                return mensagem;
            } else {
                mensagem = "Não é possivel Diminuir mais do que 1 por vez";
                return mensagem;

            }
        }else{
            return mensagem = "O controle esta desligado, ligue-o para realizar a operação";
        }
    }

    /**
     * Aumenta o canal de 1 em 1
     * @param valor
     * @return
     */
    public String aumentarCanal(int valor) {
        String mensagem = "";
        if (status == true) {
            if (valor <= 1) {
                canal += valor;
                mensagem = "Canal atual = " + volume;
                return mensagem;
            } else {
                mensagem = "Não é possivel trocar mais do que 1 canal por vez";
                return mensagem;

            }
        } else {
            return mensagem = "O controle esta desligado, ligue-o para realizar a operação";
        }
    }

    /**
     * Diminui o  canal de 1 em 1
     * @param valor
     * @return
     */
    public String diminuirCanal(int valor) {
        String mensagem = "";
        if (status == true) {
            if (valor <= 1) {
                canal -= valor;
                mensagem = "Canal atual = " + volume;
                return mensagem;
            } else {
                mensagem = "Não é possivel trocar mais do que 1 canal por vez";
                return mensagem;

            }
        } else {
            return mensagem = "O controle esta desligado, ligue-o para realizar a operação";
        }
    }

    @Override
    public String toString() {
        return "Controle \n" +
                "status=" + status +"\n"+
                "volume=" + volume +"\n"+
                "canal=" + canal;
    }
}
