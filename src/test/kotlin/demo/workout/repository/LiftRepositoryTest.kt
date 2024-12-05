package demo.workout.repository

import demo.workout.factory.lift
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
@SpringBootTest
class LiftRepositoryTest {

    private val liftRepository = mockk<LiftRepository>()

    @Nested
    inner class GetAllTest(){
        @Test
        fun `Get all returns a list of all lifts`() {
            val existingLifts = List(3){lift()}

            every { liftRepository.findAll() } returns existingLifts

            val lifts = liftRepository.findAll()

            assertThat(lifts).isEqualTo(existingLifts)
        }
    }
}