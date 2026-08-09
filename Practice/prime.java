class isprime {
    public static boolean isPrime2(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime2(4));
    }
}