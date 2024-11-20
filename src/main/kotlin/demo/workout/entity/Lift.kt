package demo.workout.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.util.*

@Entity
data class Lift(
    @Id
    val id: UUID,
    val name: String,
    @OneToMany
    val muscleGroups: List<MuscleGroup>
)
