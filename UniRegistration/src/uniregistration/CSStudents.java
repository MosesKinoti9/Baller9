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
public class CSStudents extends UniversityStudent 
{
      
     private String faculty;
     private String course;
     private String courseType;
     private String courseDuration;
     private String courseIntake;
        
      
        
        public CSStudents(String name, int age,int registrationNumber,String faculty,String course,String courseType,String courseDuration,String courseIntake)
        {
        
            super(name,age,registrationNumber);
            this.faculty = faculty;
            this.course = course;
            this.courseType = courseType;
            this.courseDuration = courseDuration;
            this.courseIntake = courseIntake;
        
        
        }
        
        public String getFaculty()
        {
          return faculty;
        }
        
        public void setFaculty(String faculty)
        {
            this.faculty = faculty;
        
        }
        
        public String getCourse()
        {
          return course;
        }
        
        public void setCourse(String course)
        {
          this.course = course;
        }
        
        public String getcourseType()
        {
          return courseType; 
        }
        
        public void setcourseType(String courseType)
        {
        
            this.courseType = courseType;
        
        }
        
        public String getcourseDuration()
        {
        
            return courseDuration;
        }
        
        public void setcourseDuration(String courseDuration)
        {
        
            this.courseDuration = courseDuration;
        
        }
        
        public String getcourseIntake()
        {
        
            return courseIntake;
        
        }
        
        public void setcourseIntake(String courseIntake)
        {
        
            this.courseIntake = courseIntake;
        
        }
              
        @Override
        public String toString()
        {
        
            return(super.toString()+"\n"+"Faculty :"+faculty+"\n"+"Course :"+course+"\n"+"Course Type :"+courseType+"\n"+"Course Duration :"+courseDuration+"\n"+"Course Intake :"+courseIntake);
        }
    
    
    }


    

