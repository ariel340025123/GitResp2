package com.cjy.test02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: 城际云科技开发有限公司
 * @Date: 2021/1/7 - 上午10:38
 * @Description: com.cjy.test02
 * @version: 1.0
 */
public class Test002 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取类的构造器和创建对象
        /*Class cls = Student.class;
        //通过字节码信息可以获取构造器：
        Constructor[] cons = cls.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        //getDeclaredConstructors:获取运行时类的全部修饰符的构造器
        Constructor[] cons2 = cls.getDeclaredConstructors();
        for (Constructor c : cons2) {
            System.out.println(c);
        }
        System.out.println("-------------------");
        //获取指定的构造器：
        //得到空构造器
        Constructor cons3 = cls.getConstructor();
        System.out.println(cons3);
        //得到两个参数的有参构造器：
//        Constructor cons4 = cls.getConstructor(double.class, double.class);
//        System.out.println(cons4);
        //得到一个参数的有参构造器：并且是private修饰的
        Constructor cons5 = cls.getDeclaredConstructor(int.class);
        System.out.println(cons5);
        //有了构造器以后我就可以创建对象：
        Object o1 = cons3.newInstance();
        System.out.println(o1);
        Constructor cons6 = cls.getDeclaredConstructor(int.class, double.class);
        Object o2 = cons6.newInstance(16, 180.5);
        System.out.println(o2);*/
        //获取属性和对属性赋值
        /*Class cls = Student.class;
        //getFields：获取运行时类和父类中被public修饰的属性
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("---------------------");
        //getDeclaredFields：获取运行时类中的所有属性
        Field[] fields1 = cls.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println(f);
        }
        System.out.println("---------------------");
        //获取指定的属性：
        Field field = cls.getField("score");
        System.out.println(field);
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("---------------------");
        //属性的具体结构：
        //获取修饰符
        int modifiers = sno.getModifiers();
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));
        System.out.println(Modifier.toString(sno.getModifiers()));
        //获取属性的数据类型：
        Class type = sno.getType();
        System.out.println(type.getName());
        //获取属性的名字：
        String name = sno.getName();
        System.out.println(name);
        System.out.println("-------------------------------");
        //给属性赋值：(给属性设置值，必须要有对象)
        Field sco = cls.getField("score");
        Object o = cls.newInstance();
        sco.set(o, 98);
        System.out.println(o);*/
        //获取方法和调用方法
        //getMethods:获取运行时类的方法还有所有父类中的方法（被public修饰）
        /*Class cls = Student.class;
        Method[] methods = cls.getMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //getDeclaredMethods:获取运行时类中的所有方法：
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
        //获取指定的方法：
        Method showInfo = cls.getMethod("showInfo");
        System.out.println(showInfo);
        Method showInfo2 = cls.getMethod("showInfo", int.class, int.class);
        System.out.println(showInfo2);
        Method work = cls.getDeclaredMethod("work",int.class);
        System.out.println(work);
        System.out.println("-----------------------");
        //名字：
        System.out.println(work.getName());
        //修饰符：
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        //返回值：
        System.out.println(work.getReturnType());
        //参数列表：
        Class[] parameterTypes = work.getParameterTypes();
        for(Class c:parameterTypes){
            System.out.println(c);
        }
        //获取注解：
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for(Annotation a:annotations){
            System.out.println(a);
        }
        //获取异常
        Class[] exceptionTypes = myMethod.getExceptionTypes();
        for (Class c : exceptionTypes) {
            System.out.println(c);
        }
        //调用方法：
        Object o = cls.newInstance();
        myMethod.invoke(o);
        System.out.println(showInfo2.invoke(o, 12, 14));*/
        //获取运行是类的接口，所在包，注解完整性
        Class cls = Student.class;
        Class[] interfaces = cls.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }
        //得到父类的接口：
        //先得到父类的字节码信息：
        Class superclass = cls.getSuperclass();
        Class[] superInterfaces = superclass.getInterfaces();
        for (Class c : superInterfaces) {
            System.out.println(c);
        }
        //获取运行时类所在的包：
        Package aPackage = cls.getPackage();
        System.out.println(aPackage);
        System.out.println(aPackage.getName());
        //获取运行类的注解：
        Annotation[] annotations = cls.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }
}
