package br.utfpr.tdd.ex1;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author andreendo
 */
public class LeitorCSVTest {
    
    @Test
    public void testCSVBemFormado() {
        String arqCsv01 = "./res/csv01.csv";
        LeitorCSV leitor = new LeitorCSV();
        List<Aluno> alunos = leitor.getAlunosDe(arqCsv01);
        assertEquals(3, alunos.size());
    }
    
}
