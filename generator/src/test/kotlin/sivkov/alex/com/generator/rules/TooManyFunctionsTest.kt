package sivkov.alex.com.generator.rules

import io.gitlab.arturbosch.detekt.test.assertThat
import io.gitlab.arturbosch.detekt.test.lint
import org.junit.Test

class TooManyFunctionsTest {

    private val rule = TooManyFunctions()
    private val path = Case.TooManyFunctions.path()

    @Test
    fun testIfElseComplicated() {
        assertThat(rule.lint(path)).hasSize(1)
    }
}