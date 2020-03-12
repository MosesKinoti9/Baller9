/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniregistration;


public class UniRegistration {

    

    
    public static void main(String[] args) {
      
        CSStudents one = new CSStudents("Moses Kinoti",18,115384,"IT","Informatics and Computer Science","Bachelor's of Science Degree","4 years","July 2019");
        BACStudents two = new BACStudents("Tammy Abraham",20,100148,"BS","Business and Commerce","Bachelor's of Science Degree","4 years","April 2018");
        System.out.println(one.toString());
        System.out.println("\n");
        System.out.println(two.toString());
      
    }
    
}
