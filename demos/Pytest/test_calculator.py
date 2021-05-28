import pytest
from calculator import Calculator

class TestCalculator():

    def setup_class(self):
        print("Setup executado uma vez para toda a classe")
        self.calc = Calculator()

    def teardown_class(self):
        print("Teardown executado uma vez para toda a classe")
 
    def setup_method(self):
        print("Setup executado antes de cada teste")        
    
    def teardown_method(self):
        print("Teardown executado após cada teste")

    def test_addition(self):
        #self.calc = Calculator()
        assert self.calc.addition(2,4) == 6

    @pytest.mark.skip(reason="Duplicated test!")
    def test_addition2(self):
        #self.calc = Calculator()
        assert self.calc.addition(10,4) == 14

    def test_subtraction(self):
        #self.calc = Calculator()
        assert self.calc.subtraction(6,2) == 4

    def test_multiplication(self):
        #self.calc = Calculator()
        assert self.calc.multiplication(2,5) == 10
    
    def test_division(self):
        #self.calc = Calculator()
        assert self.calc.division(10,5) == 2

    def test_division_by_zero(self):
        with pytest.raises(ZeroDivisionError):
            self.calc.division(10, 0)