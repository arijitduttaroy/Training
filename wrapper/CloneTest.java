public class CloneTest {

    public Employee cloneTest() throws Exception {
        return (Employee)super.clone();
    }

    public String toString() {
        return "name "+this.getName();
    }

    public static void main(String[] args) {
        
        try{
            Employee emp = new Employee();
            emp.setName("james");
            emp.setAge(20);

            Employee emp2 = emp.cloneTest();
        }catch(Exception e){
            System.out.println("Clone not possible \n");
        }

    }

}


