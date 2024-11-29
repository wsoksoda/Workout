package demo.workout.factory

import demo.workout.entity.Lift
import demo.workout.entity.MuscleGroup
import java.util.*
import java.util.UUID.randomUUID

fun lift(
    id: UUID = randomUUID(),
    name: String = randomUUID().toString(),
    muscleGroups: List<MuscleGroup> = emptyList()
): Lift {
    return Lift(
        id = id,
        name = name,
        muscleGroups = muscleGroups
    )
}
