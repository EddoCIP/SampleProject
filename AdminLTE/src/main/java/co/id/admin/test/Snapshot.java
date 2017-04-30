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
import java.util.ArrayList;

public class Snapshot {
    private ArrayList<Integer> data;
    
    public Snapshot(ArrayList<Integer> data)
    {
        this.data = data;
    }
    
    public ArrayList<Integer> restore()
    {
        return this.data;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,1);
        list.add(1,2);
        Snapshot snap = new Snapshot(list);
        list.set(3, 3);
       // list = snap.restore();
        System.out.println(snap.restore()); // Should output [1, 2]
        list.add(4);
       // list = snap.restore();
        System.out.println(snap.restore()); // Should output [1, 2]
    }
}