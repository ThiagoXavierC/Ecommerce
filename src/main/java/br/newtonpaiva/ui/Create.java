package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Create {
    public static void main(String[] args) {
        //Cria factory e passa como parametro a conexão com o BD
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();

        //inicio do bd
        em.getTransaction().begin();

        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

        //insert no BD
        em.persist(c);

        //envia comandos pro bd
        em.getTransaction().commit();

        //fim do bd
        em.close();
        factory.close();
    }
}
