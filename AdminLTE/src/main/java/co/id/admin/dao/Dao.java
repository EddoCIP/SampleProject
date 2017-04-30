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
public interface Dao {
     public List <Object> getObject();
    public User getObject(int Id);
    public void addObject(Object user);
    public void updateObject(Object user);
    public void deleteObject(int Id);
}
