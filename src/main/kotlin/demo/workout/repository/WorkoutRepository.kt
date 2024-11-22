package demo.workout.repository

import demo.workout.entity.Workout
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WorkoutRepository : PagingAndSortingRepository<Workout, UUID>