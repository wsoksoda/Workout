package demo.workout.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class MuscleGroup(
    @Id
    val id: UUID,
    val group: String,
    val subGroup: String
)
