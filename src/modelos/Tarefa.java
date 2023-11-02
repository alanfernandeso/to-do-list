package modelos;

import java.time.LocalDate;

public class Tarefa {

    private String descricao;
    private LocalDate dataDeVencimento;
    private boolean status;

    public Tarefa(String descricao, LocalDate dataDeVencimento) {
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public boolean getStatus() {
        return status;
    }


    public void conclui(){
        this.status = true;
    }

    @Override
    public String toString() {
        return "Descrição: " + this.descricao + " | Data de venc.: "
                + this.dataDeVencimento + " | Concluido: " + this.status;
    }
}
