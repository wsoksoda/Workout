package demo.workout.repository

import demo.workout.factory.workoutGroup
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
@SpringBootTest
class WorkoutGroupRepositoryTest {

    private val workoutGroupRepository = mockk<WorkoutGroupRepository>()

    @Nested
    inner class GetAllTest(){
        @Test
        fun `Get all returns a list of all workoutGroups`() {
            val existingWorkoutGroups = List(3){workoutGroup()}

            every { workoutGroupRepository.findAll() } returns existingWorkoutGroups

            val workoutGroups = workoutGroupRepository.findAll()

            assertThat(workoutGroups).isEqualTo(existingWorkoutGroups)
        }
    }
}