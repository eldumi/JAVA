import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args)
    {
       try {
           //1.
           Class<?> s = Student.class;

           System.out.println("\nClass name:");
           System.out.println(s.getName());

           System.out.println("\nPackage name:");
           System.out.println(s.getPackage().getName());

           System.out.println("\nSuper class:");
           System.out.println(s.getSuperclass().getName());

           System.out.println("\nInterfaces:");
           for (Class<?> c : s.getInterfaces()) {
               System.out.println(c.getName());
           }

            //2.
           System.out.println("\nDeclared methods:");
           Field[] fields = s.getDeclaredFields();
           for (Field f : fields)
           {
               System.out.println(f.getType().getSimpleName() + " " + f.getName());
           }

           //3.
           System.out.println("\nMethods:");
           Method[] methods = s.getDeclaredMethods();
           for (Method m : methods)
           {
               System.out.println(m.getReturnType().getSimpleName() + " " + m.getName());
           }

           //4.
           System.out.println("\nCreating object dynamically:");
           Constructor<?> constructor = s.getConstructor(String.class,int.class);
           Object obj = constructor.newInstance("Viorel",20);
           System.out.println(obj);

           //5.
           Method sayHello=s.getMethod("sayHello");
           sayHello.invoke(obj);

           //6.
           Field nameField = s.getDeclaredField("name");
           nameField.setAccessible(true);

           System.out.println("\nOriginal private name field:");
           System.out.println(nameField.get(obj));

           nameField.set(obj,"Vasili");
           System.out.println("\nModified object:");
           System.out.println(obj);

           //7.
           Method secretMethod = s.getDeclaredMethod("secretMethod");
           secretMethod.setAccessible(true);
           secretMethod.invoke(obj);

           //8.
           Constructor<?> emptyConstr = s.getConstructor();
           Object studentEmpty = emptyConstr.newInstance();
           System.out.println(studentEmpty);
           System.out.println();

           Constructor<?> constrName = s.getConstructor(String.class);
           Object studentWithName = constrName.newInstance("Georgel");
           System.out.println(studentWithName);
           System.out.println();

           Constructor<?> constrNameAge = s.getConstructor(String.class,int.class);
           Object student = constrNameAge.newInstance("Euclentiu",28);
           System.out.println(student);

           //9.
           inspect(student);

       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }


    public static void inspect(Object obj) throws Exception
    {
        try
        {
            Class<?> c = obj.getClass();
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                f.setAccessible(true);
                String fieldName = f.getName();
                String fieldType = f.getType().getSimpleName();
                Object fieldValue = f.get(obj);
                System.out.println("\nField: " + fieldType + " " + fieldName+ " = " + fieldValue);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}