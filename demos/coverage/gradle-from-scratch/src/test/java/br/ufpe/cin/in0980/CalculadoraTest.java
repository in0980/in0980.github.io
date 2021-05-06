package br.ufpe.cin.in0980;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    Calculadora calc;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Executado antes de qualquer teste rodar.");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Executado após todos os testes rodarem.");
    }

    //Em JUnit5 é @BeforeEach
    @Before
    public void setUp() {
        System.out.println("Isto é executado antes de cada teste.");
        calc = new Calculadora();
    }

    @After
    public void tearDown() {
        System.out.println("Executado após cada teste.");
        //libera algum recurso
    }

    @Test
    public void testarSoma() {
        double resultado = calc.somar(2,2);
        if (resultado == 4.0) {
            System.out.println("Tudo certo!");
        }
        else {
            Assert.fail();
        }
    }

    @Test
    public void testarSubtracao() {
        assertEquals(
                "Esperava que o resultado fosse 3",
                3.0,
                calc.subtrair(10,7),
                0.1);
    }

    @Test
    public void testarMultiplicacao() {

        assertEquals("Esperava por 25", 25.0, calc.multiplicar(5,5),0.01);
    }

    @Test
    public void testarDivisao() {
        assertEquals("Esperava por 5", 5.0, calc.dividir(10,2),0.01);
    }

    @Test
    public void testarAvaliar() {
        assertEquals("Esperava por 3", 3.0, calc.avaliar("    10  + 5 - (4 * 3)"),0.01);
    }//"sin(30)"
    

    @Test(expected = ArithmeticException.class)
    public void testarDivisaoPorZero() {
        calc.dividir(10,0);
    }

    @Test(timeout = 1000)
    public void testarTempo() throws InterruptedException {
         System.out.println("Passa pois é muito rápido rodar isso.");
         //Thread.sleep(2000);
    }
}
