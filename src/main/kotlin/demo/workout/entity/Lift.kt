package demo.workout.entity

import jakarta.persistence.*
import java.util.*

@Entity
data class Lift(
    @Id
    val id: UUID,
    val name: String,
    @OneToMany
    @JoinTable(
        name = "lift_muscle_group",
        joinColumns = [JoinColumn(name = "lift_id")],
        inverseJoinColumns = [JoinColumn(name = "muscle_group_id")]
    )
    val muscleGroups: List<MuscleGroup>
)
