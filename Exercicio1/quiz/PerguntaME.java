package Exercicio1.quiz;

import java.util.Arrays;

public class PerguntaME extends Pergunta{
    private String[] alternativas;
    public PerguntaME (String enunciado, String[] alternativas, String respostaCorreta){
        super(enunciado,respostaCorreta);
        this.alternativas = alternativas;
    }
    public PerguntaME (){
        this("",new String[]{},"");
    }
    public String[] getAlternativas(){
        return alternativas;
    }
    public void setAlternativas(String[] alternativas){   
        this.alternativas = alternativas;
    }
    @Override
    public String toString(){
        String tmp = "Alternativas:"+"\n";
        for(String s : this.alternativas){
            tmp += s+"\n";
        }
        return tmp;
    }
    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;

        PerguntaME that = (PerguntaME) o;

        return Arrays.equals(getAlternativas(),that.getAlternativas());
    }
    @Override
    public int hashCode(){
        return Arrays.hashCode(alternativas);
    }
    @Override
    public Boolean estahCorretaResposta(String resposta) {
        return (resposta.equals(this.getRespostaCorreta()));
    }
}
