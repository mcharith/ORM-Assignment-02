package org.example;

import jakarta.persistence.criteria.Order;
import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.example.entity.Orders;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        Customer c1 = new Customer();
//        c1.setCusId("C001");
//        c1.setName("Kamal");
//        c1.setAddress("Kandy");
//
//        Customer c2 = new Customer();
//        c2.setCusId("C002");
//        c2.setName("Piumal");
//        c2.setAddress("Matale");
//
//        Customer c3 = new Customer();
//        c3.setCusId("C003");
//        c3.setName("Upul");
//        c3.setAddress("Nuwaraeliya");
//
//        List<Orders> ordersList = new ArrayList<>();
//        Orders order1 = new Orders("O001", LocalDate.now(),c1);
//        Orders order2 = new Orders("O002", LocalDate.now(),c1);
//
//        ordersList.add(order1);
//        ordersList.add(order2);
//        c1.setOrdersList(ordersList);
//
//        session.save(c1);
//        session.save(c2);
//        session.save(c3);
//        session.save(order1);
//        session.save(order2);

//        -----SAVE------
//        String SQL = "SELECT * FROM Customer";
//        NativeQuery sqlQuery = session.createNativeQuery(SQL);
//
//        sqlQuery.addEntity(Customer.class);
//
//        List<Customer> customers = sqlQuery.list();
//
//        for (Customer c:customers) {
//            System.out.println(c.getCusId() +" : "+c.getName() +" : "+ c.getAddress());
//        }

//        -------DELETE-------
//        String customerId = "C001";
//        String SQL = "DELETE FROM Customer WHERE cusId = :cusId";
//        NativeQuery sqlQuery = session.createNativeQuery(SQL);
//
//        sqlQuery.setParameter("cusId", customerId);
//        int result = sqlQuery.executeUpdate();
//
//        if (result > 0) {
//            System.out.println("Customer with ID " + customerId + " was deleted successfully.");
//        } else {
//            System.out.println("No customer found with ID " + customerId);
//        }

//        -----UPDATE-----
//        String customerId = "C001";
//        String newName = "Sunna";
//
//        String SQL = "UPDATE Customer SET name = :newName WHERE cusId = :cusId";
//
//        NativeQuery<?> sqlQuery = session.createNativeQuery(SQL);
//
//        sqlQuery.setParameter("newName", newName);
//        sqlQuery.setParameter("cusId", customerId);
//
//        int result = sqlQuery.executeUpdate();
//
//        if (result > 0) {
//            System.out.println("Customer with ID " + customerId + " was updated successfully.");
//        } else {
//            System.out.println("No customer found with ID " + customerId);
//        }

//        ----SearchByName----
//        String searchName = "Sunna";
//        String SQL = "SELECT * FROM Customer WHERE name = :name";
//
//        NativeQuery<Customer> sqlQuery = session.createNativeQuery(SQL, Customer.class);
//        sqlQuery.setParameter("name", searchName);
//
//        List<Customer> customers = sqlQuery.getResultList();
//        for (Customer customer : customers) {
//            System.out.println("ID: " + customer.getCusId() + ", Name: " + customer.getName() + ", Address: " + customer.getAddress());
//        }
        transaction.commit();
        session.close();
    }
}
