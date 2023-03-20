package by.pvt.idea.Homework1;

public class HomeworkArrays {
    public static void main(String[] args) {

        /*int[] nums = new int[10];                         //#1
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.print(Arrays.toString(nums));
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.print(Arrays.toString(nums));*/


        /*Scanner scanner = new Scanner(System.in);       //#2
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print(Arrays.toString(nums));
        System.out.println();
        int min = nums[0];
        int max = nums[0];
        int imax = 0;
        int imin = 0;
        for (int i = 1; i < N; i++) {
            if (nums[i] < min) {
                min = nums[i];
                imin = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                imax = i;
            }
        }
        nums[imin] = max;
        nums[imax] = min;
        System.out.print(Arrays.toString(nums));*/


        /*int[] a = new int[] {-6, 66, 54, 2, -9};            //#3
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = a.length - 1; j > i; j--)
                if(a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
        }
        System.out.print(Arrays.toString(a));*/


       /* int[] a = new int[] {-8, 75, 34, 11, -9, -43};            //#4
        int i = 0;
        while(i < a.length - 1) {
            int j = a.length - 1;
            while( j > i) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
                j--;
            }
            i++;
        }
        System.out.print(Arrays.toString(a));*/
    }
}
