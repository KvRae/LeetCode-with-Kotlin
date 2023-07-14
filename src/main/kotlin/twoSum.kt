


fun twoSum(nums: IntArray, target: Int): IntArray {
    var answer = IntArray(2)
    for (i in 0 until nums.size)
    {
        for (j in i+1 until nums.size)
        {
            if (nums[i]+nums[j] == target)
            {
                answer.set(0,i)
                answer.set(1,j)
                break
            }
        }


    }
    return answer


}