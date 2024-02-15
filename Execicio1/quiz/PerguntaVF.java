package Execicio1.quiz;

public class PerguntaVF extends Pergunta{
    private String afirmativa;
    public PerguntaVF(String enunciado, String afirmativa, String respostaCorreta){
        super(enunciado, respostaCorreta);
        this.afirmativa = afirmativa;
    }
    public PerguntaVF(){
        this("","","");
    }
    public String getAfirmativa(){
        return this.afirmativa;
    }
    public void setAfirmativa(){
        this.afirmativa = afirmativa;
    }
    @Override
    public String toString(){
        return "afirmativas: "+"\n"
                + afirmativa;
    }
    @Override
    public Boolean estahCorretaResposta(String resposta) {
        return resposta.equals(getRespostaCorreta());
    }
}
