// class Solution {
//     public int getWinner(int[] arr, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int winner = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (winner < arr[i]) {
//                 winner = arr[i];
//             }
//             map.put(winner, map.getOrDefault(winner, 0) + 1);
//             if (map.get(winner) == k) {
//                 return winner;
//             }
//         }

//         return winner;
//     }
// }
class Solution {
    public int getWinner(int[] arr, int k) {
        int currentWinner = arr[0];
        int consecutiveWins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentWinner > arr[i])
                consecutiveWins++;
            else {
                currentWinner = arr[i];
                consecutiveWins = 1;
            }

            if (consecutiveWins == k)
                return currentWinner;
        }

        return currentWinner;
    }
}
