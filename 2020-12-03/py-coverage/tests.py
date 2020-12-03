from math import pi
import unittest
from area import *

class TestCircleArea(unittest.TestCase): 
    def test_area(self):
        #Test area when radius >= 0
        self.assertAlmostEqual(circle_area(1), pi)

'''
    def test_values(self):
        #Make sure value errors are raised when necessary
        self.assertRaises(ValueError, circle_area, -2)
'''

'''
    def test_type(self):
        #Make sure type errors are raised when necessary
        self.assertRaises(TypeError, circle_area, "-2")
'''



