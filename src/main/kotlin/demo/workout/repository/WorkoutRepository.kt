package demo.workout.repository

import demo.workout.entity.Workout
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WorkoutRepository : JpaRepository<Workout, UUID>