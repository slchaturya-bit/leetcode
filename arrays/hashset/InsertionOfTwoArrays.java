class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
          HashSet<Integer> set1 = new HashSet<>();
          //HashSet<Integer> set2 = new HashSet<>();
          HashSet<Integer> resultSet = new HashSet<>();


          // to find the other unique elemts we do not need a two sets only set1 and resultset

          for(int i=0;i<nums1.length;i++){
             set1.add(nums1[i]);
             
          }
          

          for(int i=0;i<nums2.length;i++){
             //set2.add(nums[j]);
              if(set1.contains(nums2[i])){
                resultSet.add(nums2[i]);
            
          }
          }
          int[] ans = new int[resultSet.size()];
          //int index = 0;
          int index = 0;

for (int num : resultSet) {
    ans[index] = num;
    index++;
}
          return ans;



    }
}

// main concept of using hash set is to find the unique elements in the array and also to find the intersection of two arrays
