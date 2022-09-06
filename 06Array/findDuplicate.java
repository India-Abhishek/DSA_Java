public class  findDuplicate{

	public static void find(int[] arr) {
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans=ans^arr[i];
        }
        System.out.println("Ans: "+ans);
        for(int i=1; i<arr.length; i++){
            ans=ans^i;
        }
        System.out.println("Final Ans: "+ans);
	}
    public static void main(String args[])
    {
        int arr[] = { 0,2,1,3,1 };
        find(arr);
    }
}
