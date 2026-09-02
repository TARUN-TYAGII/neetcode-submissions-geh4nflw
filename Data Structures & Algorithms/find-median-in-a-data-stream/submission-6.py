class MedianFinder:

    def __init__(self):
        self.array=[]
        

    def addNum(self, num: int) -> None:
        self.array.append(num)
        

    def findMedian(self) -> float:
        self.array.sort()
        size = len(self.array)
        is_even = size % 2==0
        mid = size //2

        if is_even:
            return (self.array[mid] + self.array[mid-1]) /2
        return self.array[mid]
        
        