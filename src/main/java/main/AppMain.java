package main;

import Managers.ContractorManager;
import Managers.ContractorRepository;
import Models.ContractorEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactory;

/**
 * Created by Nick on 05.09.2015.
 */
public class AppMain {

    public static void main(String[] args) {
        System.out.println("Enter");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();
        ContractorEntity contactEntity = new ContractorEntity();
        contactEntity.setFullName("Name123");
        session.save(contactEntity);
        session.getTransaction().commit();
        session.getSessionFactory().close();

        ContractorManager manager = new ContractorManager();
        if (manager!=null) {
            manager.retrieveAllContractors();
        }

    }
}
