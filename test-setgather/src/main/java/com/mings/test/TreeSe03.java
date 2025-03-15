package com.mings.test;


import java.util.Comparator;
import java.util.TreeSet;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: TreeSe02
 * @author: mings
 * @description: TODO
 * @date: 2025/3/15 19:52
 * @version: 1.0
 */
public class TreeSe03 {
    public static void main(String[] args) {

        /*//比较器排序
        TreeSet<Teacher> teacher =new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });*/
        //比较器排序
        TreeSet<Teacher> teacher =new TreeSet<>((o1, o2) -> {
            int result = o1.getAge() - o2.getAge();
            result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            return result;
        });
        teacher.add(new Teacher("张三", 18));
        teacher.add(new Teacher("李四", 17));
        teacher.add(new Teacher("王五", 20));
        teacher.add(new Teacher("赵六", 20));

        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
    }
}
