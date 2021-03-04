package array;

public class notAlone {
	public static int [] notAlone(int[] nums, int val) {
		  if(nums.length > 2){
		    for(int i = 1; i < nums.length - 1; i ++){
		      if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1]){
		        if(nums[i - 1] > nums[i + 1]){
		          nums[i] = nums[i - 1];
		        }
		        else if(nums[i - 1] == nums[i + 1]){
		          nums[i] = nums[i + 1];
		        }
		        else{
		          nums[i] = nums[i + 1];
		        }
		      }
		    }
		  }
		  
		  return nums;
		}
	}
