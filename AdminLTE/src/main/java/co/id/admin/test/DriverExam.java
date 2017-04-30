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
public class DriverExam {
    public static void executeExercise(IExercise exercise) throws Exception {
   exercise.start();
//        if (executeExercise(exercise)) {
//            
//        }
//   if(  exercise.start()) {
//   } else {
//       throw new Unsup/portedOperationException("Waiting to be implemented.");
  // }
    }
    
    public static void main(String[] args) throws Exception {
        DriverExam.executeExercise(new Exercise());
    }
}

class Exercise implements IExercise {
    public void start() { System.out.println("Start"); }
    public void execute() { System.out.println("Execute"); }
    public void markNegativePoints() { System.out.println("MarkNegativePoints"); }
    public void end() { System.out.println("End"); }
}

interface IExercise {
    void start() throws Exception;
    void execute();
    void markNegativePoints();
    void end();
}
