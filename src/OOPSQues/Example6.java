package OOPSQues;

import java.util.Objects;

class Hashcodeex{
    String name;
    int id;
    Hashcodeex(String name,int id){
       this.name=name;
       this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Hashcodeex that = (Hashcodeex) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
public class Example6 {
    public static void main(String[] args) {
Hashcodeex e=new Hashcodeex("diya",9);
        Hashcodeex e2=new Hashcodeex("diya",9);
        boolean b=e.equals(e2);
        System.out.println(b);
        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());;
    }
}
