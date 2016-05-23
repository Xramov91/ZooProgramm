/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationzoo;

/**
 *
 * @author Alex
 */
public class Build {
   private String adress;
   private int kolbuild=0;
   public Build(String adress1){
       adress = adress1;
       kolbuild++;
   }
public String getadress(){
    return adress;
}
public int getBuild(){
    return kolbuild;
}
    
}
