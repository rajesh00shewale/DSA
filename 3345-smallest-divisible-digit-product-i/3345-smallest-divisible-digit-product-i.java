class Solution {
    public int smallestNumber(int n, int t) {
       int ans = Integer.MAX_VALUE,
           i = n;
       
        while( true){
       
            if( DigitProd( i ) % t == 0){
                return i;
            }
            i++;
        }
        
    }
    public int DigitProd( int m ){
        if(m == 0 ) return 0;

        int prod = 1;

        while( m > 0 ){
            prod = prod * (m % 10);
            m = m / 10;
        }    

        return prod;

    }
}