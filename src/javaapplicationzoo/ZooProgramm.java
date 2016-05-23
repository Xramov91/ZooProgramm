/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationzoo;


public class ZooProgramm {
    //Здания
    private int b = 0;
Build massBuild[] = new Build[10];
public void addBuild(String adress){
massBuild[b]=new Build(adress);
b++;
}

    //Гости
    private int g = 0;
    Guest massGuest[] = new Guest[10];
    public void addGuest(String day, String pol, int age){
    massGuest[g] = new Guest(day, pol, age);
    g++;
    }

    //Животные
    private int a = 0;
    Animal arAnimal[] = new Animal[10];
    //метод добавления по одному животному
    public void addAnimal(String kind){
    arAnimal[a] = new Animal(kind);
    a++;
    }
    //метод для добавления группой
    
    public void addArrAnimal(Animal ar[], int c){ // c - количество животных в группе
        for (int t = 0;t<=c;t++){
        arAnimal[a] = ar[t];
        a++;
        }
    }
    
    //работа с персоналом
    private int s = 0;
    Staff pers[] = new Staff[10];
    public void addPers(String post){
        pers[s]=new Staff(post);
        s++;
    }
    public void delPers(){
        s--;
    }

    //информация
    //кол-во зданий и их адресс
    void infoBuild(){
         System.out.println("Количество зданий: " + b);
        for(int i = 0;i<b;i++){
            System.out.println(massBuild[i].getadress());
        }
    }
    //инфо о гостях
    void infoGuest(){
        System.out.println("Количество посетителей: " + g);
        for(int i = 0;i<g;i++){
            System.out.println("Число:"+massGuest[i].getDay()+". Пол: "+massGuest[i].getPol()+". Возраст: "+massGuest[i].getAge());
        }
    }
    //инфо о животных
    void infoAnimal(){
        System.out.println("Количетво животных: "+ a);
         for(int i = 0;i<a;i++){
            System.out.println(arAnimal[i].getKind());
        }
    }
    //инфо о персонале
    void infoStaff(){
        System.out.println("Количество персонала: "+ s);
        for(int i = 0;i<s;i++){
            System.out.println(pers[i].getpost());
        }
        
    }
    

}
