import com.practice.example.basic.StructureClass;

public class Test{
    public static void main(String[] args) {
        //new StructureClass(); --->Create an object on the Heap memory
        //StructureClass obj -->Referrence craetion
        StructureClass obj1 = new StructureClass(10, "WelcomeJava");
        obj1.method1();
        int result = obj1.method3(15);
        System.out.println(result);
        String strRes = obj1.method4( "to batchno-3");
        System.out.println(strRes);

    }
}
