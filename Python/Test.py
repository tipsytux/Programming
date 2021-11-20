class A:
    def __init__(self, x=1):
        self.x = x
class B(A):
    def __init__(self,y =2):
        super().__init__()
        self.y = y

def main():
    b = B()
    print(b.x,b.y)
main()