/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pkg9.pkg5;

/*

   Programmer: Trent Giever
   Assignment Chapter: 9
   Purpose: Course Grades
   Date modified: 1/4/2021
   IDE/Tool used: NetBeans 8.2

   */
import static java.lang.System.*;
public class Ch95 
{

   
    public static void main(String[] args)
    {
       //Lab
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        //Pass/Fail
        PassFailExam passfail = new PassFailExam(10, 2, 70); //10 questions, 2 missed, max missed is 3
        //Essay
        GradedActivity essay = new GradedActivity();
        essay.setScore(90);
        //FinalExam
        FinalExam finalexam = new FinalExam(50,5); //50 questions, 5 missed
        
        //coursegrades
        CourseGrades grades = new CourseGrades();
        grades.setLab(lab);
        grades.setPassFailExam(passfail);
        grades.setEssay(essay);
        grades.setFinalExam(finalexam);
        out.println(grades);
        
        
    }
    
}
