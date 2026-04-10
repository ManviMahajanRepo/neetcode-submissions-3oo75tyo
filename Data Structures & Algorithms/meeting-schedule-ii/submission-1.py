"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:

        time = []
        for i in intervals:
            time.append((i.start,1))
            time.append((i.end,-1))

        time.sort(key = lambda x:(x[0],x[1]))

        res = count = 0
        for t in time:
            count += t[1]
            res = max(res,count)
        return res

        #example:
        #Meetings: [[9,10], [9,12], [11,13], [10,11]]
        #Meeting [9,10]  → (9, 1) "start" and (10, -1) "end"
#Meeting [9,12]  → (9, 1) "start" and (12, -1) "end"
#Meeting [11,13] → (11, 1) "start" and (13, -1) "end"
#Meeting [10,11] → (10, 1) "start" and (11, -1) "end"
#[(9,1), (10,-1), (9,1), (12,-1), (11,1), (13,-1), (10,1), (11,-1)]
#[(9,1), (9,1), (10,-1), (10,1), (11,-1), (11,1), (12,-1), (13,-1)]
#count: 0 → 1 → 2 → 1 → 2 → 1 → 2 → 1 → 0
#res:   0 → 1 → 2 → 2 → 2 → 2 → 2 → 2 → 2
 #              ↑
  #        Peak reached and remembered!

        