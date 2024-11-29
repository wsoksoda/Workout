package demo.workout.factory

import demo.workout.entity.MuscleGroup
import java.util.*
import java.util.UUID.randomUUID

fun muscleGroup(
    id: UUID = randomUUID(),
    group: String = randomUUID().toString(),
    subGroup: String = randomUUID().toString()
): MuscleGroup {
    return MuscleGroup(
        id = id,
        group = group,
        subGroup = subGroup
    )
}