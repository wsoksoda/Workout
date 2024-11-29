package demo.workout.factory

import demo.workout.entity.Lift
import demo.workout.entity.Workout
import java.util.*
import java.util.UUID.randomUUID
import kotlin.random.Random

fun workout(
    id: UUID = randomUUID(),
    name: String = randomUUID().toString(),
    lift : Lift = lift(),
    set : Int = Random.nextInt(100),
    rep : Int = Random.nextInt(100),
): Workout {
    return Workout(
        id = id,
        name = name,
        lift = lift,
        set = set,
        rep = rep,
    )
}