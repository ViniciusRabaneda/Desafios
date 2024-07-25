package Exercicio_3;

public class Garrafa {
    private double litragemTotal;
    private double quantidadeAtual;
    private boolean status;

    public Garrafa(double litragemTotal, double quantidadeAtual, boolean status) {
        this.litragemTotal = litragemTotal;
        this.quantidadeAtual = quantidadeAtual;
        this.status = status;
    }

    public String abrir() {
        this.status = true;
        return " Garrafa Aberta!";
    }

    public String encher(double ml) {
        String mensagem = "A garrafa precisa ser aberta primeiro!";
        if (status == true) {
            if (quantidadeAtual + ml < litragemTotal) {
                quantidadeAtual += ml;
                mensagem = "Foram adicionados " + ml + " mls na garrafa! \n" + "A garrafa esta com " + quantidadeAtual + " mls no total";
                return mensagem;
            } else {
                mensagem = "O líquido não pode ser adicionado. Vai transboradar!";
                return mensagem;
            }
        } else {
            return mensagem;
        }
    }

    public String esvaziar(double ml) {
        String mensagem = "A garrafa precisa estar aberta primeiro!";
        if (status == true) {
            if (quantidadeAtual + ml < litragemTotal) {
                quantidadeAtual -= ml;
                mensagem = "Foram retirados " + ml + " mls da garrafa! \n" + "A garrafa esta com " + quantidadeAtual + " mls no total";
                return mensagem;
            } else {
                mensagem = "O líquido não pode ser adicionado. Vai transboradar!";
                return mensagem;
            }
        } else {
            return mensagem;
        }

    }

}
