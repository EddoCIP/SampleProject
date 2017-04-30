/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.test;

import co.id.admin.connection.HibernateUtil;
import co.id.admin.dao.impl.UserDaoImpl;
import co.id.admin.dao.impl.UserDaoImple;
import co.id.admin.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author gsp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        System.out.println(session.isConnected());
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        System.out.println("co.id.admin.test.Main.main()"+session.isConnected());
//        Date date = new Date();
//        UserDaoImpl userDaoImpl = new UserDaoImpl();
//       User user = new User();
//        user.setUserId(123);
//        user.setFirstName("Amin Turmudi");
//        user.setLastName("Yusup");
//        user.setEmail("amin@gmail.com");
//        user.setDob(date);
//        userDaoImpl.addUser(user);
//        List<User> arrayList=new ArrayList<User>();
//      arrayList=userDaoImpl.getUsers();
//        for (User user1 : arrayList) {
//            System.out.println("User Id "+user1.getUserId() +"First Name "+user1.getFirstName());
//        }
//     
       // userDaoImpl.deleteUser(2);
//       user.setFirstName("Galih sutrisno");
//       user.setLastName("Davi");
//       user.setEmail("galih@gmail.com");
//       user.setUserId(1);
//       user.setDob(date);
//       userDaoImpl.updateUser(user);
UserDaoImple userDaoImple=new UserDaoImple();
 List<Object> arrayList=new ArrayList<Object>();
      arrayList=userDaoImple.getObject();
        for (Object user1 : arrayList) {
            //System.out.println("User Id "+user1.getUserId +"First Name "+user1.getFirstName());
        }
    }

}
