package Execicio1.quiz;

import java.util.LinkedList;
import java.util.List;

public class SistemaQuizAyla implements SistemaQuiz {
    private List<Pergunta> perguntas;
    public SistemaQuizAyla(){
        this.perguntas = new LinkedList<>();
    }
    public SistemaQuizAyla(List<Pergunta> perguntas){
        this.perguntas = perguntas;
    }
    @Override
    public void cadastraPergunta(Pergunta p){
        perguntas.add(p);
    }
    @Override
    public Pergunta sorteiaPergunta(){
        if(this.perguntas.size() == 0){
            return null;
        } else {
            // Fazer a opção de random
        return null;
        }
    }
}
