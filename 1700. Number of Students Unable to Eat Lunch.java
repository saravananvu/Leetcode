class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> student = new Stack<>();
        for(int i = students.length - 1;i >= 0;i--) student.push(students[i]);

        Stack <Integer> sandwich = new Stack<>();
        for(int i = sandwiches.length - 1;i >= 0;i--) sandwich.push(sandwiches[i]);
        
        int count = 0;
        while(count < student.size()){ //count < student.size() because it completed the iteration and enters into another iteration so we stopped here.
            if(student.peek().equals(sandwich.peek())){
                student.pop();
                sandwich.pop();
                count = 0;
            }else{
                int n = student.pop();
                student.add(0,n);
                count++;
            }
        }
        return student.size();
    }
}




// Approach 2:
// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
//         int ones = 0; //count of students who prefer type1
//         int zeros = 0; //count of students who prefer type0
		
//         for(int stud : students){
//             if(stud == 0) zeros++;
//             else ones++;
//         }
        
//         // for each sandwich in sandwiches
//         for(int sandwich : sandwiches){
//             if(sandwich == 0){  // if sandwich is of type0
//                 if(zeros == 0){ // if no student want a type0 sandwich
//                     return ones;
//                 }
//                 zeros--;
//             }
//             else{  // if sandwich is of type1
//                 if(ones == 0){  // if no student want a type1 sandwich 
//                     return zeros;
//                 }
//                 ones--;
//             }
//         }
//         return 0;
//     }
// }
