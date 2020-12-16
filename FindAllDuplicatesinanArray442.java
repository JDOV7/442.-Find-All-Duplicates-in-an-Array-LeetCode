package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicatesinanArray442 {

    public void FindAllDuplicatesinanArray442() {
        int[] nums = {1, 1};
        List<Integer> lList = new ArrayList();
        Arrays.sort(nums);
        int iCont = 0;
        if (nums.length == 0) {
            System.out.println(0);
        }
        int iNumActually = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1 && iCont == 1 && nums[i] == iNumActually) {
                lList.add(iNumActually);
            }

            if (nums[i] == iNumActually) {
                iCont++;
            } else {
                if (iCont == 2) {
                    lList.add(iNumActually);
                }
                iNumActually = nums[i];
                iCont = 1;
            }
        }
        for (Integer integer : lList) {
            System.out.println(integer);
        }
    }
}
