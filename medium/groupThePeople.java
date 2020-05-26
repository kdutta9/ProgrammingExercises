/** Leetcode 1282. Group the People Given the Group Size They Belong To
	There are n people whose IDs go from 0 to n - 1 and each person belongs exactly to one group. 
	Given the array groupSizes of length n telling the group size each person belongs to, return the 
	groups there are and the people's IDs each group includes.
	You can return any solution in any order and the same applies for IDs. 
	Also, it is guaranteed that there exists at least one solution. 
**/
class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        ht = {}
        res = []
        for i in range(len(groupSizes)):
            if groupSizes[i] in ht:
                ht[groupSizes[i]] = ht[groupSizes[i]] + [i]
            else:
                ht[groupSizes[i]] = [i]
        for i in ht:
            if len(ht[i]) == i:
                res.append(ht[i])
            else:
                for j in range(0, len(ht[i]), i):
                    res.append(ht[i][j:j+i])
        
        return res
		