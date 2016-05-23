/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationzoo;


public class Guest {
    private String day;
    private String pol;
    int age;
    Guest(String day1, String pol1, int age1){
       day = day1;
       pol = pol1;
       age = age1;
   }
     String getDay(){
        return day;
    }
     String getPol(){
        return pol;
    }
     int getAge(){
    return age;    
    }
}
