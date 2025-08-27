package CollectionsQues;

import java.util.HashMap;

public class HashMap6 {

    public static void main(String[] args) {
        int nums[]={1,2,3,1,1,2,2,4,5,3,1};
        HashMap<Integer,Integer>m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
if(m.containsKey(nums[i]) ){
    m.put(nums[i],m.get(nums[i])+1);
            }
else{
    m.put(nums[i],1);
}
        }
        for(int i:m.keySet()){
            int value=m.get(i);
            //System.out.println(value);
            if(value>=2){
                System.out.println(i);
            }
        }
    }
}
