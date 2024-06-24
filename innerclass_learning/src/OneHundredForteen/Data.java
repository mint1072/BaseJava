package OneHundredForteen;

import java.util.ArrayList;

//泛型接口
public interface Data<T> {//接口泛型也可以是继承其他类的
    void add(T t);//增加学生数据或者老师数据 所以类型为T
    ArrayList<T> getName(String name);//返回查询学生对象和老师对象集合 类型用泛型代表

}
