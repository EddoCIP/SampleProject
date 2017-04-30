/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.dao;

import co.id.admin.model.User;
import java.util.List;

/**
 *
 * @author gsp
 */
public interface UserDao {
    public List <User> getUsers();
    public User getUser(int UserId);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int userId);
}
