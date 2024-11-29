package demo.workout.factory

import demo.workout.entity.Workout
import demo.workout.entity.WorkoutGroup
import java.util.*
import java.util.UUID.randomUUID

fun workoutGroup(
    id: UUID = randomUUID(),
    name : String = randomUUID().toString(),
    workouts : List<Workout> = emptyList()
): WorkoutGroup {
    return WorkoutGroup(
        id = id,
        name = name,
        workouts = workouts,
    )
}