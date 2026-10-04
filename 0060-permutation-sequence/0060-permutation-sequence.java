class Solution {
    public String getPermutation(int n, int k) {

        // Store numbers 1 to n
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // factorial = (n-1)!
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }

        // Convert k to 0-based indexing
        k--;

        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {

            // Find which block k belongs to
            int index = k / factorial;

            // Pick that number
            result.append(numbers.get(index));
            numbers.remove(index);

            // Update k
            k = k % factorial;

            // Update factorial
            if (i > 1) {
                factorial = factorial / (i - 1);
            }
        }

        return result.toString();
    }
}