package aulagui.View;

import aulagui.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Cordeiro
 *
 * Classe para modelar o que será apresentado em uma JTable
 */
public class AlunoModel extends AbstractTableModel {

    String colunas[] = {"Nome", "RA"};
    List<Aluno>alunos = new ArrayList();
    
    public AlunoModel(){
        alunos.add(new Aluno("João Victor Cordeiro", "27099-5"));
        alunos.add(new Aluno("Lucas Gabryel", "12345-5"));
        alunos.add(new Aluno("Henrique Magnoli", "67890-5"));
    }
    
    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Buscar o aluno a ser montado na linha 
        Aluno aluno = alunos.get(rowIndex);
        
        // Buscar a informação do aluno de acordo com a posição da coluna 
        switch(columnIndex)
        {
            case 0: 
                return aluno.getNome();                
            case 1:
                return aluno.getRa();                
        }
        return "Erro";
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
}
