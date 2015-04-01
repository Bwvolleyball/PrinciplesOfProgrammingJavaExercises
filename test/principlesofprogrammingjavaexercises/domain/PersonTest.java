/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principlesofprogrammingjavaexercises.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BrandonWard
 */
public class PersonTest {

    @Test
    public void testPerson() {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(7);
        Class clazz = null;
        try {
            clazz = Class.forName(Person.CLASSNAME);
        } catch (Exception e) {
            System.out.println(e.toString());
            fail();
        }
        Person person2 = null;
        try {
            person2 = (Person) clazz.newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
            fail();
        }
        person2.setName("Mary");
        person2.setAge(8);
        Field fieldStaticClassPath = null;
        Field fieldName = null;
        Field fieldAge = null;
        try {
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("fields length: " + fields.length );
            fieldStaticClassPath = fields[0];
            fieldName = fields[1];
            fieldAge = fields[2];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
        
        System.out.println(fieldStaticClassPath.getType().toGenericString());
        System.out.println(fieldName.getType().toGenericString());
        System.out.println(fieldAge.getType().toGenericString());
        
        System.out.println(fieldName.getName()+ " " + fieldName.getModifiers() + " " + fieldName.getType());
        try{
        fieldName.get(person1);
        fieldName.set(person1, "Mark");
        } catch (Exception e){
            System.out.println(e.getMessage());
            fail();
        }
        
        Method[] m = clazz.getDeclaredMethods();
    }

}
