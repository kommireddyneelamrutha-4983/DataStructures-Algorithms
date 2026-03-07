//package Arrays;
import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		
		//printing elements in an array
		/*int arr[]= {7,18,45,8,33};
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	     }*/

	//maximum element in an array
     /*int arr[]= {7,18,45,8,33};
     int max=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]>max)
    	 {
    		 max=arr[i];
    	 }
     }
     System.out.println("the maximum element is :" +max); */
		
     //count frequency of a number
		/*int arr[]= {7,18,45,8,33};
		int count=0;
		int k=45;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]==k)
	    	 {
	    		 count++;
	    	 }
	    	 
	     }
	     System.out.println("frequency is :" +count); */
		
		//insert at ending of an array;
		/*int   arr[] =new int[10];
		int k=46;
		int size=5;
		arr[0]=7;
		arr[0]=18;
		arr[0]=45;
		arr[0]=8;
		arr[0]=33;
		arr[size++]=k;
	     for(int i=0;i<size;i++)
	     {
	    	 System.out.println(arr[i]);
	     }*/
		
		//insert at beginning of an array
		/*int arr[]= {7,18,45,8,33};
		int k=10;
		int newarr[]=new int[arr.length +1];
		newarr[0]=k;
		
	     for(int i=1;i<arr.length;i++)
	     {
	    	 newarr[i+1]=arr[i];
	     }
	    System.out.println(Arrays.toString(newarr));
	    */
		
		//insert at given position
		/*int arr[]= {7,18,45,8,33};
		int k=10;
		int pos=2;
		int newarr[]=new int[arr.length +1];
		 for(int i=0;i<pos;i++)
	     {
	    	 newarr[i]=arr[i];
	     }
		 newarr[pos]=k;
		 for(int i=pos;i<arr.length;i++)
	     {
	    	 newarr[i+1]=arr[i];
	     }
		 
	    System.out.println(Arrays.toString(newarr));
	    */
		
		//insert in sorted array
		/*  
		int arr[]= {10,20,30,40};
		int k=35;
		int newarr[]=new int[arr.length +1];
		int i=0;
		while(i<arr.length && arr[i]<k)
		{
			newarr[i]=arr[i];
			i++;
		}
		newarr[i]=k;
		 for(int j=i;j<arr.length;j++)
	     {
	    	 newarr[j+1]=arr[j];
	     }
		 System.out.println(Arrays.toString(newarr));
		 */
		
		//delete at position
		 /*int arr[] = {10,20,30,40,50};
	        int pos = 2;

	        int newArr[] = new int[arr.length - 1];

	        for(int i=0;i<pos;i++) {
	            newArr[i] = arr[i];
	        }

	        for(int i=pos+1;i<arr.length;i++) {
	            newArr[i-1] = arr[i];
	        }

	        System.out.println(Arrays.toString(newArr));
	        */
		
		//delete by value
		/*int arr[] = {10,20,30,40,50};
        int value = 30;

        int index = -1;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == value) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Value not found");
            return;
        }

        int newArr[] = new int[arr.length - 1];

        for(int i=0;i<index;i++) {
            newArr[i] = arr[i];
        }

        for(int i=index+1;i<arr.length;i++) {
            newArr[i-1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
        */
		
		//delete all occurences
		        int arr[] = {10,20,90,20,40,20};
		        int value = 20;

		        int count = 0;

		        for(int i=0;i<arr.length;i++) {
		            if(arr[i] != value) {
		                count++;
		            }
		        }

		        int newArr[] = new int[count];
		        int index = 0;

		        for(int i=0;i<arr.length;i++) {
		            if(arr[i] != value) {
		                newArr[index++] = arr[i];
		            }
		        }

		        System.out.println(Arrays.toString(newArr));
		    
	     
	     
	}

}
