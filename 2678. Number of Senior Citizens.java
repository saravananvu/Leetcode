class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s : details){
            int age1 = s.charAt(11) - '0';
            int age2 = s.charAt(12) - '0';
            int age = (age1 * 10) + age2;
            if(age > 60) count++;
        }
        return count;
    }
}

// int number = 42;
// String textNum = String.valueOf(number); // Returns "42"

// String nullText = String.valueOf(null);   // Returns "null" safely

// char[] greet = {'h', 'i'};
// String textGreet = String.valueOf(greet); // Returns "hi"
