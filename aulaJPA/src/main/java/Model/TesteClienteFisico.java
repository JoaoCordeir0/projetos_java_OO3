package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author joaoc
 */
public class TesteClienteFisico {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("persistencia_jpu");              
        
        EntityManager gerencia = fabrica.createEntityManager();
        
        gerencia.getTransaction().begin();
        
        for (int c = 0; c < 10; c++)
        {
            ClienteFisico cli = new ClienteFisico();            
            cli.setNome("Nome " + c);
            cli.setCpf("CPF_" + c);
            
            if (c % 2 == 0)            
                cli.setSexo("masculino");            
            else             
                cli.setSexo("feminino");
            
            
            gerencia.persist(cli);
        }        
        
        gerencia.getTransaction().commit();
        
        ClienteFisico cli = new ClienteFisico();
        cli.setId(1l);
        
        ClienteFisico cli2 = gerencia.find(ClienteFisico.class, cli.getId());
        
        System.out.println("Cliente encontrado: " + cli2.getNome());
    }
}
