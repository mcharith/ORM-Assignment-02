package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        //        Query query = session.createQuery("from Customer");
//        List<Customer>customerList=query.list();
//        for (Customer customer : customerList){
//            System.out.println(customer.getId());
//            System.out.println(customer.getName());
//        }

//        unique one data from customer
//            Query query = session.createQuery("from Customer where id = : customerId");
//            query.setParameter("customerId",1);
//
//            Customer customer=(Customer) query.uniqueResult();
//            System.out.println(customer.getName());

//        get only one column
//        Query query = session.createQuery("select name from Customer where id = : customerId");
//        query.setParameter("customerId",1);
//
//        String name =(String) query.uniqueResult();
//        System.out.println(name);

//

        // -----UPDATE-----
//        Query query = session.createQuery("UPDATE Customer SET name = :name WHERE id = :id");
//        query.setParameter("name", "Bimal");
//        query.setParameter("id", 1);
//
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);

        // ---DELETE-----
//        Query query = session.createQuery("DELETE FROM Customer WHERE id = :id");
//        query.setParameter("id", 1);
//
//        int result = query.executeUpdate();
//        System.out.println("Rows affected: " + result);
//
//        transaction.commit();
//        session.close();

        //----JOIN QUERY-----
        //Error mata theren na
//        Query query = session.createQuery(
//                "SELECT a FROM Address a INNER JOIN a.customer c WHERE c.id = :id");
//        query.setParameter("id", 1);
//
//        List<Address> addressList = query.list();
//        for (Address address : addressList) {
//            System.out.println("Address: " + address);
//        }


        transaction.commit();
        session.close();
    }
}