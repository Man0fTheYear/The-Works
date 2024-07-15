public class Test
{
    public static void main( String[] args )
    {
        int[] a;
        a = new int[ 10 ];
        int[] b = {0,2,4,6,8};
        for ( int i = 0; i < a.length; i++ )
            a[ i ] = i + 2;
        int result = 0;
        for ( int i = 0; i < a.length; i++ )
            result += a[ i ];
        System.out.printf( "Result is: %d\n", result );
        System.out.println(b[2]);
    changeArray(b, b[2]);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static void changeArray( int[] passedArray, int value )
    {
        passedArray[ value ] = 12;
        value = 5;
    } // end method changeArray
    // end main
} // end class Test