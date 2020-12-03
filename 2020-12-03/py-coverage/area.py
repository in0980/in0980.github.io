from math import pi
def circle_area(r):
    if type(r) not in [int, float]:
        raise TypeError("The radius must be a non-negative real number.")
    if r < 0:
        raise ValueError("The radius must not be negative.")
    return pi*(r**2)

def rectangle_area(w,l):
    if type(w) not in [int, float]:
        raise TypeError("The width must be a non-negative real number.")
    if w < 0:
        raise ValueError("The width must not be negative.")
    if type(l) not in [int, float]:
        raise TypeError("The length must be a non-negative real number.")
    if l < 0:
        raise ValueError("The length must not be negative.")    
    return w*l

def square_area(a):
    return rectangle_area(a,a)