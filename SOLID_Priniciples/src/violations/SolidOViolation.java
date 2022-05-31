/*
 * Solid principles
 * Solid is an acronym for the first five Object Oriented design (OOD)
 * S -
 * O - Open Closed Principle - object or entities should be open for extension but closed for modification
 * L -
 * I -
 * D -
 */

package violations;

class ArrayUtil {
    public static void sortAsc(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void sortDesc(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++ ) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class SolidOViolation {
    public static void main(String[] args) {
        int arr[] = {1,5,4,2,3};
        ArrayUtil.sortAsc(arr);

        System.out.println("Values in the array are ");
        for(int ele : arr){
            System.out.println(ele);
        }

        ArrayUtil.sortDesc(arr);
        System.out.println("Values in the array are ");
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}
