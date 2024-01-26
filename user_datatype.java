class a {
    // object literals ...
    public int marks;
    public String fname;
    public String lname;
}

public class user_datatype {
    public static void main(String[] args) {
        // Object is also an local variable
        a obj = new a();
        obj.marks = 40;
        obj.fname = "Ash";
        obj.lname = "Ketcham";
        a obj1 = new a();
        obj1.marks = 80;
        obj1.fname = "Pikachu";
        obj1.lname = "pikap";
        a objects[] = new a[2];
        // objects array can store 'a' class data type value

        objects[0] = obj1;
        objects[1] = obj;

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].marks + " " + objects[i].fname + " " + objects[i].lname);
        }
    }
}
