public class Animal {
    private String type;//represent Animal type.
    private String name;//represent Animal name.
    private int age;//represent Animal's age.
    void setBasic(String type,String name,int age){
this.age=age;
this.name=name;
this.type=type;
    }//有参构造器setbasic.

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//getter
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }//setter
}