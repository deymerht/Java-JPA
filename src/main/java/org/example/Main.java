package org.example;

import org.example.entity.User;
import org.example.util.UtilEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = UtilEntity.getEntityManager();

//        String query = "SELECT e FROM User e";
//        List<User> user = entityManager.createQuery(query, User.class).getResultList();
//        System.out.println("-------LISTAR USERS------");
//        user.forEach(System.out::println);

//        System.out.println("-------FIND ONE USER------");
//        String idToFind = "db2632bf-8927-4cf8-9042-35835bd2a647";
//        String idDeymer = "0320c809-96a4-4673-8fa2-85f9eec40d6b";
//        User userToUpdate = entityManager.find(User.class, idDeymer);
//        System.out.println("The user is: " + userToUpdate);
//
//        userToUpdate.setLastName("Hernández");
//        userToUpdate.setWebsite("http://deymerh.co");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(userToUpdate);
//        entityManager.getTransaction().commit();
//        System.out.println("-------User updated successfully------ " + userToUpdate);

//        System.out.println("-------CREATE NEW USER------");
//        User newUser = new User();
//        newUser.setFirstName("Deymer");
//        newUser.setLastName("Hernadnez");
//        newUser.setEmail("deymerh@deymerh.com");
//        newUser.setLastConnection("2024-01-12");
//        newUser.setCountry("COL");
//        newUser.setWebsite("http://deymerh.com");
//        newUser.setUsername("deymerh");
//        newUser.setFollowers(1000);
//        newUser.setFollowing(2000);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(newUser);
//        entityManager.getTransaction().commit();
//
//        System.out.println("------- User creted succesfully: " + newUser + " --------------");

        System.out.println("-------FIND ONE USER FOR DELETE------");
        String idToFindForDelete = "482af935-c93f-4114-8e0b-e3b8d3a6770c";
        User userToDelete = entityManager.find(User.class, idToFindForDelete);
        System.out.println("The user to delete is: " + userToDelete);

        entityManager.getTransaction().begin();
        entityManager.remove(userToDelete);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("------- User deleted succesfully: --------------");
    }
}