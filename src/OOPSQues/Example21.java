package OOPSQues;
class Hospital{
    int id;
    String name;
    public int getid(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }

    public void setName(String name) {
        this.name = name;
    }
public String getName(){
        return name;
}
    public void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
class doctor extends Hospital{
    String name;
    public void display(){
        super.display();
//        System.out.println(name);
    }

}
public class Example21 {
    public static void main(String[] args) {
doctor d=new doctor();
d.setId(8);
        d.setName("diya");
//        System.out.println(d.getid());
        d.display();
//        System.out.println(d.getName());
    }
}
