public class secondsmallest {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,6};
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min1){
                min2=min1;
                min1=i;
            }else if(i<min2){
                min2=i;
            }
        }
        System.out.println(min1+" "+min2);
    }
}
