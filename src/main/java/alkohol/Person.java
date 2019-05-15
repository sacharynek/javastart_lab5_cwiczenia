package alkohol;

public class Person {

    String fname, lname;
    int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public void orderDrink(Drink drink){
        if(this.age<18 && drink.isHasAlco() ){
            System.out.println("sorry, you are not permited to drink alcohol");
        } else {
            System.out.println( this.fname + " your drink is ready. You have to pay "+drink.getPrice());
        }
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
