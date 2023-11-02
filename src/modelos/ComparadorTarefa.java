package modelos;

import java.util.Comparator;

public class ComparadorTarefa implements Comparator<Tarefa> {

    @Override
    public int compare(Tarefa tarefa1, Tarefa tarefa2) {
        return tarefa1.getDataDeVencimento().compareTo(tarefa2.getDataDeVencimento());
    }
}
