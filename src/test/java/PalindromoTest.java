import br.com.ufg.dominio.Palindromo;
import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

    private static final String PALINDROMO_1 = "Roma me tem amor";
    private static final String PALINDROMO_2 = "Anotaram a data da maratona";
    private static final String PALINDROMO_3 = "Me vê se a panela da moça é de aço Madalena Paes, e vem";
    private static final String PALINDROMO_4 = "Socorram-me, subi no ônibus em Marrocos";
    private static final String PALINDROMO_5 = "Ame o poema";
    private static final String PALINDROMO_6 = "A sacada da casa";
	
    @Test
    public void testaEhPalidromo() {
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_1));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_2));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_3));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_4));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_5));
        Assert.assertTrue(Palindromo.ehPalindromo(PALINDROMO_6));
    }
}
