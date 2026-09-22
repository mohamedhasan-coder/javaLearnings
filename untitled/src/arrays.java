import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        // =========================================================
        // 1. DECLARATION
        // =========================================================

        int[] a;
        int b[];

        // =========================================================
        // 2. CREATION
        // =========================================================

        a = new int[5];

        // =========================================================
        // 3. DECLARATION + INITIALIZATION
        // =========================================================

        int[] numbers = {10, 20, 30, 40, 50};

        // =========================================================
        // 4. CREATE ARRAY WITH new
        // =========================================================

        int[] marks = new int[]{90, 80, 70, 60, 50};

        // =========================================================
        // 5. ACCESS ELEMENT
        // =========================================================

        System.out.println(numbers[0]); // 10
        System.out.println(numbers[2]); // 30

        // =========================================================
        // 6. CHANGE ELEMENT
        // =========================================================

        numbers[0] = 100;
        System.out.println(numbers[0]);

        // =========================================================
        // 7. ARRAY LENGTH
        // =========================================================

        System.out.println(numbers.length);

        // =========================================================
        // 8. TRAVERSE USING FOR LOOP
        // =========================================================

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // =========================================================
        // 9. TRAVERSE USING ENHANCED FOR LOOP
        // =========================================================

        for (int x : numbers) {
            System.out.println(x);
        }

        // =========================================================
        // 10. PRINT ARRAY
        // =========================================================

        System.out.println(Arrays.toString(numbers));

        // =========================================================
        // 11. SORT ARRAY
        // =========================================================

        int[] arr = {50, 20, 40, 10, 30};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // =========================================================
        // 12. SORT PART OF ARRAY
        // =========================================================

        int[] arr2 = {50, 40, 30, 20, 10};

        Arrays.sort(arr2, 1, 4);

        System.out.println(Arrays.toString(arr2));

        // =========================================================
        // 13. COPY ARRAY
        // =========================================================

        int[] original = {1, 2, 3, 4, 5};

        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println(Arrays.toString(copy));

        // =========================================================
        // 14. COPY FIRST N ELEMENTS
        // =========================================================

        int[] copy2 = Arrays.copyOf(original, 3);

        System.out.println(Arrays.toString(copy2));

        // =========================================================
        // 15. COPY RANGE
        // =========================================================

        int[] copy3 = Arrays.copyOfRange(original, 1, 4);

        System.out.println(Arrays.toString(copy3));

        // =========================================================
        // 16. FILL ENTIRE ARRAY
        // =========================================================

        int[] fillArray = new int[5];

        Arrays.fill(fillArray, 10);

        System.out.println(Arrays.toString(fillArray));

        // =========================================================
        // 17. FILL PART OF ARRAY
        // =========================================================

        int[] fillArray2 = new int[5];

        Arrays.fill(fillArray2, 1, 4, 99);

        System.out.println(Arrays.toString(fillArray2));

        // =========================================================
        // 18. SEARCH USING binarySearch
        // Array must be sorted first
        // =========================================================

        int[] searchArray = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(searchArray, 30);

        System.out.println(index);

        // =========================================================
        // 19. CHECK EQUALITY
        // =========================================================

        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};

        System.out.println(Arrays.equals(x, y));

        // =========================================================
        // 20. COMPARE ARRAYS
        // =========================================================

        int[] p = {1, 2, 3};
        int[] q = {1, 2, 4};

        System.out.println(Arrays.compare(p, q));

        // =========================================================
        // 21. MISMATCH
        // Finds first different index
        // =========================================================

        System.out.println(Arrays.mismatch(p, q));

        // =========================================================
        // 22. CLONE ARRAY
        // =========================================================

        int[] originalArray = {10, 20, 30};

        int[] clonedArray = originalArray.clone();

        System.out.println(Arrays.toString(clonedArray));

        // =========================================================
        // 23. SUM OF ARRAY
        // =========================================================

        int sum = 0;

        for (int value : numbers) {
            sum += value;
        }

        System.out.println("Sum = " + sum);

        // =========================================================
        // 24. FIND MAXIMUM
        // =========================================================

        int max = numbers[0];

        for (int value : numbers) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Max = " + max);

        // =========================================================
        // 25. FIND MINIMUM
        // =========================================================

        int min = numbers[0];

        for (int value : numbers) {
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Min = " + min);

        // =========================================================
        // 26. REVERSE ARRAY
        // =========================================================

        int[] reverse = {1, 2, 3, 4, 5};

        int left = 0;
        int right = reverse.length - 1;

        while (left < right) {

            int temp = reverse[left];
            reverse[left] = reverse[right];
            reverse[right] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(reverse));

        // =========================================================
        // 27. INSERT ELEMENT
        // =========================================================

        int[] oldArray = {10, 20, 40, 50};

        int position = 2;
        int value = 30;

        int[] newArray = new int[oldArray.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i == position) {
                newArray[i] = value;
            } else {
                newArray[i] = oldArray[j++];
            }
        }

        System.out.println(Arrays.toString(newArray));

        // =========================================================
        // 28. DELETE ELEMENT
        // =========================================================

        int[] deleteArray = {10, 20, 30, 40, 50};

        int deleteIndex = 2;

        int[] result = new int[deleteArray.length - 1];

        for (int i = 0, j = 0; i < deleteArray.length; i++) {

            if (i != deleteIndex) {
                result[j++] = deleteArray[i];
            }
        }

        System.out.println(Arrays.toString(result));

        // =========================================================
        // 29. COUNT EVEN NUMBERS
        // =========================================================

        int[] nums = {1, 2, 3, 4, 5, 6};

        int evenCount = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Even count = " + evenCount);

        // =========================================================
        // 30. COUNT ODD NUMBERS
        // =========================================================

        int oddCount = 0;

        for (int n : nums) {
            if (n % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Odd count = " + oddCount);

        // =========================================================
        // 31. LINEAR SEARCH
        // =========================================================

        int target = 40;
        int foundIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Index = " + foundIndex);

        // =========================================================
        // 32. MULTIPLY ALL ELEMENTS
        // =========================================================

        int product = 1;

        for (int n : nums) {
            product *= n;
        }

        System.out.println("Product = " + product);

        // =========================================================
        // 33. AVERAGE
        // =========================================================

        int total = 0;

        for (int n : nums) {
            total += n;
        }

        double average = (double) total / nums.length;

        System.out.println("Average = " + average);

        // =========================================================
        // 34. 2D ARRAY
        // =========================================================

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][1]); // 2

        // =========================================================
        // 35. PRINT 2D ARRAY
        // =========================================================

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // =========================================================
        // 36. Arrays.deepToString()
        // =========================================================

        System.out.println(Arrays.deepToString(matrix));

        // =========================================================
        // 37. Arrays.deepEquals()
        // =========================================================

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.deepEquals(matrix, matrix2));

        // =========================================================
        // 38. JAGGED ARRAY
        // =========================================================

        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};

        for (int[] row : jagged) {
            System.out.println(Arrays.toString(row));
        }

        // =========================================================
        // 39. STREAM - SUM
        // =========================================================

        int streamSum = Arrays.stream(nums).sum();

        System.out.println(streamSum);

        // =========================================================
        // 40. STREAM - MAX
        // =========================================================

        int streamMax = Arrays.stream(nums).max().getAsInt();

        System.out.println(streamMax);

        // =========================================================
        // 41. STREAM - MIN
        // =========================================================

        int streamMin = Arrays.stream(nums).min().getAsInt();

        System.out.println(streamMin);

        // =========================================================
        // 42. STREAM - AVERAGE
        // =========================================================

        double streamAverage = Arrays.stream(nums).average().getAsDouble();

        System.out.println(streamAverage);

        // =========================================================
        // 43. STREAM - FILTER
        // =========================================================

        int[] evenNumbers = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(evenNumbers));
    }
}