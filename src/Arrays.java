public class Arrays {
    public static void main(String[] args) {
        array1();

    }

    private static void array1(){
       /* int a[];   //declaration
        a= new int[]{1,2};  //allocation
        int[] u = new int[2];
        u = new int[]{3,4};

        int e[] = {3,5};   //declaration, allocation and initialization all in one line
        System.out.println("invokes toString instead of printing array " + e );
        int[]f = new int[2];
        System.out.println("f[0] = " + f[0]);
        System.out.println("f[1] = " + f[1]);*/
      // int b[] = {4,5};
      // int x[] = new int[]{1,2}; // works
        //int x1[] = new int[2] {1,2}; // does not work as we are giving size and values at same time

       // int r[] = {1,23};
       // System.out.println(r.length);

        //int x1[][] = new int[4][2];
       // System.out.println(x1[0]);
        //System.out.println(x1[0][0]);
       // System.out.println(x1[0][1]);
       // System.out.println(x1[3]);
       // System.out.println(x1[0][2]);

       /* x1[0]= new int[]{2,3,6};
        x1[1] = new int[]{4,8};
        int x2[][] = new int[][]{{1,2}, {3,4}, {4,5}, {7,9}};
        System.out.println("x2[0] = " + x2[0]);
        int y[] = new int[][] {{1,2}, {3,4}, {4,5},{7,9}}[0];
        System.out.println("value of y[0] == " + y[0]);*/


       String s[][] = new String[4][2];
        System.out.println(s[0]);
        System.out.println(s[0][0]);

        String c[] = {"Hello", "Kundan"};
        System.out.println(c[1]);
        int k[] = new int[2];
        k[0]=5;
        k[1]=8;
        k[2]=9;
        System.out.println(k[2]);
    }

}
