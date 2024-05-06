package ExtendsNithyNine;

public class Teacher1 extends people1{
    private String skill;
    public String getSkill(){
        return skill;
    }
    public void setSkill(String skill){
        this.skill = skill;
    }
    public void getInfo(){
        System.out.println(getName() + "具备的技能" + skill);
    }
}
