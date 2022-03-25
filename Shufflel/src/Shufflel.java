 class Shufflel {
     public static void main(String[] args) {
         int x = 3;
         if (x > 2) {
             System.out.print("a");

             while (x > 0) {
                 System.out.print("-");
                 x = x - 1;

                 if (x == 2) {
                     System.out.print("b c");
                 }
                 if (x == 1) {
                     System.out.print("d");
                     x = x - 1;
                 }


             }
         }
     }
 }