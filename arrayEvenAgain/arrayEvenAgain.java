public class arrayEvenAgain {
    public static void main(String[] args) {
        int[] nums = numCreate();
        findEven(nums);
    }

    public static void findEven(int[] nums) {
        int[] againEven = new int[10];
        for (int i = 0; i < 5; i++) {
            int say = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == (i * 2 + 2)) {
                    say += 1;
                    againEven[i] = say;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("tekrar eden " + (i * 2 + 2) + " sayisi miktari: " + againEven[i]);
        }

    }

    public static int[] numCreate() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        return nums;
    }
}