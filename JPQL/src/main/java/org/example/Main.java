package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        INSERT
        /*Customer customer = new Customer();
        customer.setId(2);
        customer.setName("Kamal");
        customer.setAddressList(new ArrayList<>());

        Address address = new Address();
        address.setaId(3);
        address.setNo("123");
        address.setRoad("Main Street");
        address.setCity("Matale");
        address.setCustomer(customer);

        Address address1 = new Address();
        address1.setaId(4);
        address1.setNo("1234");
        address1.setRoad("Olter salgadu road");
        address1.setCity("Panadura");
        address.setCustomer(customer);

        customer.getAddressList().add(address);
        customer.getAddressList().add(address1);*/


//      DELETE
         /*String addressToDelete = "3";
        String jpql = "DELETE FROM Address a WHERE a.aId = :aId";
        session.createQuery(jpql)
                .setParameter("aId", addressToDelete)
                .executeUpdate();*/

//        UPDATE
       /* int customerId = 1;
        String newName = "Sumith";
        String jpql = "UPDATE Customer c SET c.name = :newName WHERE c.id = :id";
        session.createQuery(jpql).setParameter("newName", newName)
                .setParameter("id", customerId)
                .executeUpdate();*/

//        SELECT ALL
        /*String jpql = "SELECT c FROM Customer c";
        List<Customer> customerList = session.createQuery(jpql, Customer.class).getResultList();

        System.out.println("Customer List:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }*/


//        SEARCH
        /*String searchName = "Sumith";
        String jpql = "SELECT c FROM Customer c WHERE c.name = :name";
        List<Customer> customers = session.createQuery(jpql, Customer.class)
                .setParameter("name", searchName)
                .getResultList();*/

        transaction.commit();
        session.close();
    }
}