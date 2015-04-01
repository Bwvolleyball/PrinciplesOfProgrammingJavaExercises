/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principlesofprogrammingjavaexercises.domain;

/**
 *
 * @author BrandonWard
 */
public class Person {
    
    public static final String CLASSNAME = "principlesofprogrammingjavaexercises.domain.Person";
    public String name;
    public Integer age;
    
    public Person(){
        name = "";
        age = 0;
    }
    
    public Person(String name){
        this.name = name;
        this.age= 0;
    }
    
    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
}
