/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniregistration;

/**
 *
 * @author mkino
 */
public class UniversityStudent {
    
    private String name;
    private int age;
    private int registrationNumber;
    
    public UniversityStudent()
    {
    
        this.name = " ";
        this.age = 0;
        this.registrationNumber = 0;
    
    }
    
    public UniversityStudent(String name, int age, int registrationNumber)
    {
       this.name = name;
       this.age = age;
       this.registrationNumber = registrationNumber;
    
    }
    
    public String getName()
    {
      return name;
    }
    
    public void setName(String name)
    {
    
        this.name = name;
      
    }
    
    public int getAge()
    {
      
        return age;
    
    }
    
    public void setAge(int age)
    {
    
        this.age = age;
    
    }
    
    public double getregistrationNumber()
    {
    
        return registrationNumber;
       
    
    }
    
    public void setregistrationNumber(int registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    
    
    
    @Override
    public String toString()
    {
    
        return ("Name :"+name+"\n"+"Age :"+age+"\n"+"Registration Number :"+registrationNumber);
   
    }
    
}  
    
    
       