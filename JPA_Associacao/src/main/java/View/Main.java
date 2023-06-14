package View;

import Model.Compra;
import Model.ItemCompra;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author joaoc
 */
public class Main {

    public static void main(String[] args) {
        
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_Associacao");
        
        EntityManager gerencia = fabrica.createEntityManager();
        
        Compra compra = new Compra();
        
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        
        prod1.setDescricao("Arroz");
        prod2.setDescricao("Feijão");
        
        ItemCompra item1 = new ItemCompra();
        ItemCompra item2 = new ItemCompra();
        
        item1.setProduto(prod1);
        item2.setProduto(prod2);
        
        item1.setQuantidade(2);
        item2.setQuantidade(5);
        
        List<ItemCompra> itens = new ArrayList();                
        compra.setItens(itens);
        itens.add(item1);
        itens.add(item2);
        
        // Iniciar a persistencia de tudo 
        gerencia.getTransaction().begin();
        gerencia.persist(compra);        
        gerencia.getTransaction().commit();
        
    }
}
