public class Employee implements Cloneable {

    protected String name;
    protected int age;


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


}

