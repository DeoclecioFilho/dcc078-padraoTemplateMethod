package padroescomportamentais;

public abstract class Cliente {

    private int numeroInstalacao;
    protected String nomeCliente;
    private float medicao1;
    private float medicao2;

    public int getNumeroInstalacao() {
        return numeroInstalacao;
    }

    public void setNumeroInstalacao(int numeroInstalacao) {
        this.numeroInstalacao = numeroInstalacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getMedicao1() {
        return medicao1;
    }

    public void setMedicao1(float medicao1) {
        this.medicao1 = medicao1;
    }

    public float getMedicao2() {
        return medicao2;
    }

    public void setMedicao2(float medicao2) {
        this.medicao2 = medicao2;
    }

    public float calcularMedia() {
        return (this.medicao1 + this.medicao2) / 2;
    }

    public abstract String verificarTensao();

    public String getTipo() {
        return "Cliente";
    }

    public String getInfo() {
        return getTipo() + " {" +
                "Numero de Instalação: " + this.numeroInstalacao +
                ", Nome do cliente: " + this.nomeCliente +
                ", Nível de tensão: " + this.verificarTensao() +
                '}';
    }
}
