package OopOneHundrenNine;

import java.util.ArrayList;

public class ClassManger {
    private ArrayList<Student> list = new ArrayList<>();
    private PrintOperate p =new PrintOperateImpl2();
    public ClassManger() {
        list.add(new Student("111", 'm', 24));
        list.add(new Student("222", 'w', 28));
        list.add(new Student("333", 'm', 70));
        list.add(new Student("444", 'm', 12));
    }
    public void printStudentsInfo(){
        p.printInfo(list);
    }

    public void printStudentScores(){
        p.printScores(list);
    }
}
