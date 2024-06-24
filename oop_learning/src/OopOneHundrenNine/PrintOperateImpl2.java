package OopOneHundrenNine;

import java.util.ArrayList;

public class PrintOperateImpl2 implements PrintOperate{
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("———————————————打印包含男女数的学生信息——————————————");
        int mCount = 0;
        int wCount = 0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名:" + students.get(i).getName() + "性别" +
                    students.get(i).getSex() + "成绩" + students.get(i).getScore());
            if (students.get(i).getSex() == 'm') ++mCount;
            else ++wCount;
        }

    }

    @Override
    public void printScores(ArrayList<Student> students) {
        System.out.println("——————————————————全部学生成绩除去最高和最低分———————————————————");
        double sumScores = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            sumScores += students.get(i).getScore();
            max = compareScoreMax(max, students.get(i).getScore());
            min = compareScoreMin(min, students.get(i).getScore());
            System.out.println("全部平均分为" + (sumScores - max - min) / students.size());
//            System.out.println("全部平均分为" + (sumScores - max - min) / students.size());
        }
    }

    private double compareScoreMax(double max, double score){
        return Math.max(max, score);
    }
    private double compareScoreMin(double min, double score){
        return Math.min(min, score);
    }
}
