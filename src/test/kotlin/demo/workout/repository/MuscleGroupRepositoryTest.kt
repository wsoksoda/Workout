package demo.workout.repository

import demo.workout.factory.muscleGroup
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
@SpringBootTest
class MuscleGroupRepositoryTest {

    private val muscleGroupRepository = mockk<MuscleGroupRepository>()

    @Nested
    inner class GetAllTest(){
        @Test
        fun `Get all returns a list of all muscleGroups`() {
            val existingMuscleGroups = List(3){muscleGroup()}

            every { muscleGroupRepository.findAll() } returns existingMuscleGroups

            val muscleGroups = muscleGroupRepository.findAll()

            assertThat(muscleGroups).isEqualTo(existingMuscleGroups)
        }
    }
}