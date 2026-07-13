// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n<1) {
//             return false;
//         } else if(n==1) {
//             return true;
//         } else {
//             while(n%2==0) {
//                 n = n/2;
//             }
//             if(n==1) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//     }
// }


class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        return (n & (n - 1)) == 0;
    }
}