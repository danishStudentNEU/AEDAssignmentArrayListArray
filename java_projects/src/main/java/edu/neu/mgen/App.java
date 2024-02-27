package edu.neu.mgen;

import java.util.ArrayList;

public class App 
{

    public static void main( String[] args )
    {
        int x[] = {1,2,3,4,5};
        int y[] = {10,11,12,13,14};
        int z[]= new int[5];
        
        for(int i=0;i<5;i++){
            if(x[i]>y[i])
                z[i] = x[i];
            else
                z[i] = y[i];
        }
        System.out.print("Array x = {");
        for(int j=0;j<5;j++){
            System.out.print(x[j]);
            if(j<4)
                System.out.print(",");
            else
                System.out.print("}");

        }

        System.out.print("\nArray y = {");
        for(int j=0;j<5;j++){
            System.out.print(y[j]);
            if(j<4)
                System.out.print(",");
            else
                System.out.print("}");
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Part 2");


        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            String switchedName = switchFirstAndLastLetter(name);
            switchedNames.add(switchedName);
        }

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    public static String switchFirstAndLastLetter(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        String middle = name.substring(1, name.length() - 1);
        String switchedName = Character.toUpperCase(lastChar) + middle + Character.toLowerCase(firstChar);

        return switchedName;
    }
}
