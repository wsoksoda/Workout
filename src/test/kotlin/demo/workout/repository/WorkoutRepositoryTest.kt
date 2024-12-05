package demo.workout.repository

import demo.workout.factory.workout
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
@SpringBootTest
class WorkoutRepositoryTest {

    private val workoutRepository = mockk<WorkoutRepository>()

    @Nested
    inner class GetAllTest(){
        @Test
        fun `Get all returns a list of all Workouts`() {
            val existingWorkouts = List(3){workout()}

            every { workoutRepository.findAll() } returns existingWorkouts

            val workouts = workoutRepository.findAll()

            assertThat(workouts).isEqualTo(existingWorkouts)
        }
    }
}