package demo.workout.entity

import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.util.*

data class WorkoutGroup(
    @Id
    val id: UUID,
    val name: String,
    @OneToMany
    val workouts: List<Workout>
)
