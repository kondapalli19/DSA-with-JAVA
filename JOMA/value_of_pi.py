import random
def estimate(n):
    dots_in_circle=0
    dots_in_square=0
    for _ in range(n):
        value_x=random.uniform(0,1)
        value_y=random.uniform(0,1)
        distance=value_x**2 + value_y**2
        if(distance<=1):
            dots_in_circle+=1
        dots_in_square+=1
    return 4 * (dots_in_circle/dots_in_square)

print(estimate(10000000))