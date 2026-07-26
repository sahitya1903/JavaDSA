public class secondlargest{
    public static void main(String[] args) {
        int arr[]={1,4,2,5,6};
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max1){
                max2=max1;
                max1=i;
            }else if(i>max2){
                max2=i;
            }
        }
        System.out.println(max1+" "+max2);
    }
}