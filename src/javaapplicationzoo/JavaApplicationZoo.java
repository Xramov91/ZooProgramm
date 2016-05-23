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
public class JavaApplicationZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ZooProgramm zoo = new ZooProgramm();
//создаем два здания
        zoo.addBuild("Green, 5");
        zoo.addBuild("Orange, 3");
//создаем трех гостей        
        zoo.addGuest("21", "male", 25);
        zoo.addGuest("21", "famale", 52);
        zoo.addGuest("21", "male", 5);
//создаем двух животных
        zoo.addAnimal("Leo");
        zoo.addAnimal("Owl"); //сова
//добавим животных группой: две обезьяны  и 4 бегемота
//создадим массив и поместим туда животных
        Animal AnimMass[] = new Animal[6];
        AnimMass[0] = new Animal("hippo");
        AnimMass[1] = new Animal("hippo");
        AnimMass[2] = new Animal("hippo");
        AnimMass[3] = new Animal("hippo");
        AnimMass[4] = new Animal("monkey");
        AnimMass[5] = new Animal("monkey");
        zoo.addArrAnimal(AnimMass, 5);
//добавим персонал
        zoo.addPers("Уборщик");
        zoo.addPers("Кассир");
        zoo.addPers("Охранник");
//удалим одного
        zoo.delPers();
        
//вывод информации
          zoo.infoStaff();//Персонал
       // zoo.infoBuild(); //здания
       // zoo.infoGuest(); //гости
     //   zoo.infoAnimal(); //Животные
     
    }
    
}
