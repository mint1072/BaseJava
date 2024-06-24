package OopOneHundrenNine;

import java.util.ArrayList;

public class PrintOperateImpl1 implements PrintOperate{
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("——————————————————全部学生信息———————————————————");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名:" + students.get(i).getName() + "性别" +
                    students.get(i).getSex() + "成绩" + students.get(i).getScore());
        }
    }

    @Override
    public void printScores(ArrayList<Student> students) {
        System.out.println("——————————————————全部学生成绩———————————————————");
        double sumScores = 0;
        for (int i = 0; i < students.size(); i++) {
            sumScores += students.get(i).getScore();
            System.out.println("全部平均分为" + sumScores / students.size());
        }
    }
}
