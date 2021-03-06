package src.com.IOFile;

import java.io.Serializable;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/3 - 下午10:14
 * @Description: src.com.IOFile
 * @version: 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 3075927249227107012L;
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
