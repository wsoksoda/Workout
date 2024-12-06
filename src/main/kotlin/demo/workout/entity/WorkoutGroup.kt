package demo.workout.entity

import jakarta.persistence.*
import java.util.*

@Entity
data class WorkoutGroup(
    @Id
    val id: UUID,
    val name: String,
    @OneToMany
    @JoinTable(
        name = "workout_workout_group",
        joinColumns = [JoinColumn(name = "workout_id")],
        inverseJoinColumns = [JoinColumn(name = "workout_group_id")]
    )
    val workouts: List<Workout>
)
