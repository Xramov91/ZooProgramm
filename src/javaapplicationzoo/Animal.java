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
public class Animal {
    private String kind;
    private static int kol=0;
    Animal(String kind1){ //вид животного
        kind = kind1;
        kol++; //для подсчета вызова констркутора
    }
    public int get(){
        return kol;
    }
    public String getKind(){
        return kind;
    }
}
