package Execicio1.quiz;

public class PerguntaDissertativa extends Pergunta{
    public PerguntaDissertativa(String enunciado, String respostaCorreta){
        super(enunciado, respostaCorreta);
    }
    public PerguntaDissertativa(){
        this("","");
    }
    @Override
    public Boolean estahCorretaResposta(String resposta) {
        return resposta.equals(getRespostaCorreta());
    }

    @Override
    public String toString() {
        return "PerguntaDissertativa{}  ";
    }
}
