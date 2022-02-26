class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
          int i = 0; //updated index of nums1
	        int j = 0; //updated index of nums2
	        int x = 0; //updated index of final array, arr[]
	        
	        int length = nums1.length + nums2.length;
	        
	        double[] arr = new double[length]; //array we are merging into
	        
	        while(i < nums1.length && j < nums2.length)
	        {
	            if(nums1[i] <= nums2[j]) //if updated index of num1 is less than equal to num2
	            {
	                arr[x] = nums1[i];
	                i++;
	            }
	            else if (nums1[i] > nums2[j]) //if nums1 index greater than num2 index
	            {
	                arr[x] = nums2[j];
	                j++;
	            }
	            
	            x++; //updating final array index
	        }
	        
	        while(i < nums1.length) //if nums1 has unused indexes
	        {
	        	arr[x] = nums1[i];
	        	x++;
	        	i++;
	        }

	        while(j < nums2.length) //if nums1 has unused indexes
	        {
	        	arr[x] = nums2[j];
	        	x++;
	        	j++;
	        }
	        
	        double num = 0;
	        
	        if(length % 2 == 1) //finding median if final array is odd number length
	        {
	            num = arr[length / 2];
	            return(num);
	        }
	        else
	        {
	            num = (arr[length / 2 - 1] + arr[length / 2]) / 2; //median if average of 2
	            return(num);
	        }
        
        }
    }
