import br.com.newwess.codewars.SpinWords
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SpinWordsTest {

    private val spin = SpinWords()

    @BeforeEach
    fun setUp() {}

    @AfterEach
    fun tearDown() {}


    @Test
    fun test1() {
        assertEquals("emocleW", spin.spinWords("Welcome"))
    }

    @Test
    fun test2() {
        assertEquals("Hey wollef sroirraw", spin.spinWords("Hey fellow warriors"))
    }

    @Test
    fun test3() {
        assertEquals("This is a test", spin.spinWords("This is a test"))
    }

    @Test
    fun test4() {
        assertEquals("This is rehtona test", spin.spinWords("This is another test"))
    }

    @Test
    fun test5() {
        assertEquals("You are tsomla to the last test", spin.spinWords("You are almost to the last test"))
    }

    @Test
    fun test6() {
        assertEquals(
            "Just gniddik ereht is llits one more",
            spin.spinWords("Just kidding there is still one more")
        )
    }

    @Test
    fun test7() {
        assertEquals(
            "Spaces before and after",
            spin.spinWords("    secapS erofeb and retfa       ")
        )
    }
}