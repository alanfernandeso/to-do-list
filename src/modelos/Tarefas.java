package modelos;

import java.util.Date;

public class Tarefas {

    private String descricao;
    private String dataDeVencimento;
    private String status = "A fazer";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getStatus() {
        return status;
    }


    public void conclui(){
        this.status = "Concluida";
    }

    @Override
    public String toString() {
        return "Descrição: " + this.descricao + " | Data de venc.: "
                + this.dataDeVencimento + " | Status: " + this.status;
    }
}
