/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O - Open Closed Principle - object or entities should be open for extension but closed for modification
 * L -
 * I -
 * D -
 */

package nonViolations;

interface ValueComparator {
     /**
      * @return +ve if value1 > value2, -ve if value1 < value2, 0 if value1 = value2,
      * */
    int compare(int value1, int value2);
}

class ArrayUtil {
    public static void sortAsc(int a[], ValueComparator comparator) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (comparator.compare(a[i] , a[j]) > 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void sortDesc(int a[], ValueComparator comparator) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (comparator.compare(a[i] , a[j]) > 0){
//                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

class AscComparator implements ValueComparator {
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}

class DescComparator implements ValueComparator {
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}

public class SolidO {
    public static void main(String[] args) {
        int arr[] = {1,5,4,2,3};
        ArrayUtil.sortAsc(arr, new AscComparator());

        System.out.println("Values in the ascending order are ");
        for(int ele : arr){
            System.out.println(ele);
        }

        ArrayUtil.sortDesc(arr, new DescComparator());
        System.out.println("Values in the descending order are ");
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
