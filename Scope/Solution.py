class Difference:
    def __init__(self, a):
        self.__elements = a
        self.maximumDiffernce = 0

    # Add your code here

    def computeDifference(self):
        a.sort()
        self.maximumDifference = a[len(a) - 1] - a[0]


# End of Difference class
_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
