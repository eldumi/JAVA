import java.util.*;

public class Main
{
    public static void main (String[] args)
    {
        System.out.println("\nExercitiul 1");
        //1.
        ArrayList<String> nume = new ArrayList<String>();
        nume.add("Andrei");
        nume.add("Paul");
        nume.add("Mario");
        nume.add("Maria");
        nume.add("Cristi");

        System.out.println(nume);

        nume.remove(2);
        System.out.println(nume);

        System.out.println("\nExercitiul 2");
        //2.
        List<Integer> numere = new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
        {
            numere.add(i);
        }
        System.out.println(numere);
        int suma=0;
        double avg;
        for(int i :numere)
        {
            suma+=i;

        }
        System.out.println("Suma= "+ suma);
        avg=suma/(numere.size()*1.0);
        System.out.println("Avg= "+ avg);
        System.out.println("\nExercitiul 3");
        //3.
        for(int i=0;i<numere.size()/2;i++)
        {
            int aux = numere.get(i);
            numere.set(i, numere.get(numere.size()-1-i));
            numere.set(numere.size()-1-i, aux);
        }
        System.out.println("Lista inversata: "+ numere);

        System.out.println("\nExercitiul 4");
        //4.
        String propozitie = "Andrei vrea sa se joace cu mingea!";
        String[] split = propozitie.split(" ");

        Set<String> set = new HashSet<String>();
        for(String s : split)
        {
            set.add(s);
        }
        System.out.println("Cuvinte separate: " + set);
        System.out.println("Nr cuvinte separate: " + set.size());

        System.out.println("\nExercitiul 5");
        //5.
        String input = "apple banana apple orange banana apple";
        String[] splitInput = input.split(" ");

        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s : splitInput)
        {
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s, 1);
            }
        }
        System.out.println("Frecventa cuvinte: " + map);

        System.out.println("\nExercitiul 6");
        //6.
        Map<String,String> agenda = new HashMap<String,String>();
        agenda.put("Andrei", "0773123002");
        agenda.put("Paul", "0771088661");
        agenda.put("Mario", "0772993991");

        String numeCautat ="Andrei";
        if(agenda.containsKey(numeCautat))
            System.out.println("Numarul de telefon al "+ numeCautat +" este: "+ agenda.get(numeCautat));
        else
            System.out.println("Persoana nu exista in agenda!");


        for(Map.Entry<String,String> intrare :agenda.entrySet())
        {
            System.out.println(intrare.getKey() + " " + intrare.getValue());
        }

        System.out.println("\nExercitiul 7");
        //7.
        List<Student> studenti = new ArrayList<Student>();

        studenti.add(new Student("Andrei", 5));
        studenti.add(new Student("Paul", 4));
        studenti.add(new Student("Mario", 3));

        for(Student s : studenti)
        {
            System.out.println(s);
        }

        Student geniu = studenti.get(0);
        for(Student s : studenti)
        {
            if(s.grade>geniu.grade)
                geniu=s;
        }
        System.out.println("Geniu: "+ geniu.name);

        System.out.println("\nExercitiul 8");
        //8.
        studenti.sort(Comparator.comparing((Student s)->s.name));
        System.out.println("Ordonare alfabetica dupa nume: " + studenti);

        studenti.sort(Comparator.comparingInt((Student s)->s.grade).reversed());
        System.out.println("Ordonare descrescatoare dupa nota: " + studenti);

        System.out.println("\nExercitiul 9");
        //9.
        studenti.add(new Student("Andrei", 5));
        System.out.println("Studenti cu duplicat: \n" + studenti);

        Set<Student> studentiNeduplicat = new HashSet<>(studenti);
        System.out.println("Studenti fara duplicat: \n" + studentiNeduplicat);

    }
}
