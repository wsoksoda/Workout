package demo.workout.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import java.util.*

@Entity
data class Workout(
    @Id
    val id: UUID,
    val name: String,
    @OneToOne
    val lift: Lift,
    val set: Int,
    val rep: Int
)
