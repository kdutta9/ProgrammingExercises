# We have a collection of stones, each stone has a positive integer weight.

# Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

# If x == y, both stones are totally destroyed;
# If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
# At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()
        while len(stones) > 1:
            max1 = stones.pop()
            max2 = stones.pop()
            diff = abs(max1 - max2) 
            if (diff > 0):
                stones.append(diff)
            stones.sort()
        
        if len(stones) > 0:
            return stones[0]
        else:
            return 0
        