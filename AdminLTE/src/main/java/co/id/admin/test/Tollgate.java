/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.test;

/**
 *
 * @author gsp
 */
public class Tollgate {
    public void enter(String licensePlate) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public String exit() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        Tollgate tollgate = new Tollgate();
        tollgate.enter("New York");
        tollgate.enter("LA");
        System.out.println(tollgate.exit());
        System.out.println(tollgate.exit());
    }
}
