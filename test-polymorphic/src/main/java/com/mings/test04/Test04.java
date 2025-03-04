package com.mings.test04;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test04
 * @className: test04
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 21:23
 * @version: 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        Person person = new SurperMan();
        person.eat();
        person.work();
        if (person instanceof SurperMan){
            SurperMan surperMan = (SurperMan) person;
            surperMan.save();
        }
    }
}
