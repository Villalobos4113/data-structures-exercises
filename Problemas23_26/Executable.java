package Problemas23_26;

public class Executable {
    public static void main(String[] args) {
        ArraySet<Integer> arraySet1 = new ArraySet<>(), arraySet2 = new ArraySet<>(), arraySet3 = new ArraySet<>(), arraySet4 = null;

        for (int i = 1; i < 11; i++)
            arraySet1.add(i);

        for (int i = 6; i < 16; i++)
            arraySet2.add(i);

        System.out.println("\nArray Set 1 = " + arraySet1);
        System.out.println("Array Set 2 = " + arraySet2);
        System.out.println("Array Set 3 = " + arraySet3);
        System.out.println("Array Set 4 = " + arraySet4);

        System.out.println("\nAdd All");
        System.out.println("Array Set 1 y Array Set 1 = " + arraySet1.union(arraySet1));
        System.out.println("Array Set 1 y Array Set 2 = " + arraySet1.union(arraySet2));
        System.out.println("Array Set 1 y Array Set 3 = " + arraySet1.union(arraySet3));
        System.out.println("Array Set 1 y Array Set 4 = " + arraySet1.union(arraySet4));

        System.out.println("\nContains All");
        System.out.println("Array Set 1 y Array Set 1 = " + arraySet1.intersection(arraySet1));
        System.out.println("Array Set 1 y Array Set 2 = " + arraySet1.intersection(arraySet2));
        System.out.println("Array Set 1 y Array Set 3 = " + arraySet1.intersection(arraySet3));
        System.out.println("Array Set 1 y Array Set 4 = " + arraySet1.intersection(arraySet4));

        System.out.println("\nRemove All");
        System.out.println("Array Set 1 y Array Set 1 = " + arraySet1.difference(arraySet1));
        System.out.println("Array Set 1 y Array Set 2 = " + arraySet1.difference(arraySet2));
        System.out.println("Array Set 1 y Array Set 3 = " + arraySet1.difference(arraySet3));
        System.out.println("Array Set 1 y Array Set 4 = " + arraySet1.difference(arraySet4));
    }
}
