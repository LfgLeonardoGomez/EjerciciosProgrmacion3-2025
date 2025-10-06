package org.example;
        import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Main {
    public static void main(String[] args) {
    
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

          System.out.println("¡Conexión establecida correctamente!");
        
        em.close();
        emf.close();

    }    
}