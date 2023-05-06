public class Dog extends Animal {
private String sex;//represent sexual appearance.
    void setBasic(String type,String name,int age,String sex){
        setAge(age);
        setType(type);
        setName(name);
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    void sleep(){

    };
}
