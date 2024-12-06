package demo.workout.entity

import jakarta.persistence.*
import java.util.*

@Entity
data class Workout(
    @Id
    val id: UUID,
    val name: String,
    @ManyToOne
    val lift: Lift,
    val set: Int,
    val rep: Int
)
