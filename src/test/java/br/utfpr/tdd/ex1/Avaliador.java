package br.utfpr.tdd.ex1;

/**
 *
 * @author andreendo
 */
class Avaliador {
    int limiteFaltas;
    
    void setLimiteFaltas(int limite) {
        limiteFaltas = limite;
    }

    /*public String getStatusFinal(Aluno aluno) {
        if(aluno.getNF() >= 6.0 && aluno.getFaltas() > limiteFaltas)
            return "reprovado por falta";

        if(aluno.getNF() < 6.0 && aluno.getFaltas() > limiteFaltas)
            return "reprovado por nota e falta";

        
        if(aluno.getNF() < 6.0)
            return "reprovado por nota";
        
        return "aprovado";
    }*/
    
    public String getStatusFinal(Aluno aluno) {
        boolean reprovadoPorNota = aluno.getNF() < 6.0;
        boolean reprovadoPorFalta = aluno.getFaltas() > limiteFaltas;
        
        String status = "aprovado";
        if(reprovadoPorNota) {
            status = "reprovado por nota";
            if(reprovadoPorFalta)
                status = status + " e falta";
        }
        else if(reprovadoPorFalta)
            status = "reprovado por falta";
        
        return status;
    }    
    
}
