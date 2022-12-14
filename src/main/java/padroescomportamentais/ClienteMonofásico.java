package padroescomportamentais;

public class ClienteMonofásico extends Cliente {

    // resolução 505/2001 da ANEEL
    @Override
    public String verificarTensao() {
        int tn = 254;
        // Valores fase/fase
        float media = (this.calcularMedia() / tn);

        if (media >= 0.91f && media <= 1.04f) {
            return "Tensão Adequada";
        } else {
            if ((media < 0.91f && media >= 0.86f) || (media <= 1.06f && media > 1.04f)) {
                return "Tensão Precária";
            } else {
                //media < 0.86f || media > 1.06f
                return "Tensão Crítica";
            }
        }
    }

    @Override
    public String getTipo() {
        return "Cliente Monofásico";
    }
}

