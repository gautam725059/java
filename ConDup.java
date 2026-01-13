public class ConDup {
    public boolean  containsDuplicate(int[]nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }        return false;  
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 0, 6, 3, 7, 5};

        ConDup obj = new ConDup(); // object banaya
        boolean result = obj.containsDuplicate(nums); // method call

        System.out.println("containDuplicate: " + result);
    }
    }
    


