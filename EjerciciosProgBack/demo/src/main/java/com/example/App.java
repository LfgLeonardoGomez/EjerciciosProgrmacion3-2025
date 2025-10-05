package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
       
        
      /* 
      Agrega medicamentos
      Medicamento med1 = Medicamento.builder()
                .nombre("Ibupirac")
                .droga("Paracetamol")
                .pesoEnGramos(1)
                .build();

        Medicamento med2 = Medicamento.builder()
                .nombre("Aspirineta")
                .droga("aspirina")
                .pesoEnGramos(1)
                .build();

        Medicamento med3 = Medicamento.builder()
                .nombre("Ketorolac")
                .droga("Ketorolaco")
                .pesoEnGramos(1)
                .build();*/

                /*Persiste y merge Consultas 

                Consulta con1 = Consulta.builder()
                    .fecha(LocalDate.of(2025, 10, 2))
                    .diagnostico("Malestar estomacal por exceso de comida")
                    .build();

                Consulta con2 = Consulta.builder()
                    .fecha(LocalDate.of(2025, 10, 3))
                    .diagnostico("Migrañas")
                    .build();

                Consulta con3 = Consulta.builder()
                    .fecha(LocalDate.of(2025, 9, 30))
                    .diagnostico("Deshidratacion")
                    .build();

                Consulta con4 = Consulta.builder()
                    .fecha(LocalDate.of(2025,9,28))
                    .diagnostico("Posible Hepatitis")
                    .build();

        em.persist(con1);
        em.persist(con2);
        em.persist(con3);
        em.persist(con4);
        Paciente paciente1 = em.find(Paciente.class, 3L);
        Paciente paciente2 = em.find(Paciente.class, 4L);
        
        paciente1.getConsultas().add(con1);
        paciente1.getConsultas().add(con2);
        paciente2.getConsultas().add(con3);
        paciente2.getConsultas().add(con4);

        em.merge(paciente1);
        em.merge(paciente2);
        */

        /* Agrego medicos y consultas*/

       /*  Medico med1 = Medico.builder()
        .nombre("Gerardo Gutierrez")
        .especialidad("Cardiologo")
        .matricula("12345")
        .edad(53)
        .build();
        
        Medico med2 = Medico.builder()
        .nombre("Juanfer Quintero")
        .especialidad("Pediatra")
        .matricula("54321")
        .edad(42)
        .build();
        
        em.persist(med1);
        em.persist(med2);
        */

        /* asigno las consultas a los medicos con merge */

        /*
        Medico med = em.find(Medico.class, 1);

        for(int i = 1 ; i<5 ; i++){
            Consulta con = em.find(Consulta.class, i);
           if(con != null){
            med.getConsultas().add(con);
            
           }    
        }
        em.merge(med);
        */ 


        /*
         







         
         */

        //  Listar todos los pacientes mayores de 30 años.
        //  List<Paciente> lista = em.createQuery("Select p From Paciente p Where p.edad > :edad",Paciente.class)
        //   .setParameter("edad", 30)
        //   .getResultList();
        //  for(Paciente p : lista){
        //      System.out.println(p);
        //   }

//  4. Obtener todas las consultas realizadas por un médico específico.
        //  List<Consulta> listaCon = em.createQuery("Select c From Medico m Join m.consultas c Where m.id = :id",Consulta.class)
        //  .setParameter("id", 1)
        //  .getResultList();
        //   for(Consulta c : listaCon){
        //       System.out.println(c);
        //    }


   // 5. Mostrar todos los medicamentos asociados a un paciente.
        // List<Medicamento> listaMedicamentos = em.createQuery("Select m From Paciente p Join p.medicamentos m",Medicamento.class)
        //     .getResultList();
        //     System.out.println(listaMedicamentos);


      //  6. Listar las consultas con su diagnóstico y el nombre del paciente.
        // List<Object[]> listaConsultas = em.createQuery("Select c.diagnostico, p.nombre, p.apellido From Paciente p Join p.consultas c"
        //             , Object[].class)
        //             .getResultList();
        //             for(Object[] c : listaConsultas){
        //                 String nombre = (c[1] + " " + c[2]).toString();
        //                 String diagnostico = c[0].toString();
        //                 System.out.println("Diagnostico: " + diagnostico + " - Paciente: " + nombre);
        //                 }
      
        // 7. Calcular el promedio de edad de los pacientes.

        // Object promObject = em.createQuery("Select AVG(p.edad) From Paciente p",Paciente.class)
        //             .getSingleResult();
        //         System.out.println("Promedio: " + promObject);

        //  8. Listar todos los pacientes que tienen una obra social específica.
        //         String obraSocial = "Osep";
        // List<Paciente> listaPacientes = em.createQuery("Select p From Paciente p where p.obraSocial = :obraSocial",Paciente.class)
        //             .setParameter("obraSocial", obraSocial)
        //             .getResultList();
        //             for(Paciente p : listaPacientes){
        //             System.out.println(p);
        //             }

        // 9. Mostrar los médicos y la cantidad de consultas que atendieron.
            // List<Medico> listaMedicos = em.createQuery("Select m From Medico m ", Medico.class)
            //                 .getResultList();
 
            //                 for (Medico m : listaMedicos){
            //                     System.out.println("Medico: " + m.getNombre());
            //                     System.out.println("Consultas atendidas: " +  m.getConsultas().size()  );
            //                     System.out.println("----------------------------------------------");
            //                 }

        // 10. Obtener todos los pacientes junto con la descripción de su historia clínica 
            // List<HistoriaClinica> listaPacientes = em.createQuery("Select h From HistoriaClinica h Join h.paciente "
            //             ,HistoriaClinica.class)
            //             .getResultList();
            //             for (HistoriaClinica hist : listaPacientes){
            //                 String nombreCompleto = hist.getPaciente().getNombre() + " " + hist.getPaciente().getApellido();
            //                 System.out.println("Paciente: " + nombreCompleto);
            //                 System.out.println("Historia Clinica: " + hist.getDescripcion());
            //             }

      em.getTransaction().commit();
        em.close();
        emf.close();


    }
}
