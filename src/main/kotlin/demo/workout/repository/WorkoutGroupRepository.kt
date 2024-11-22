package demo.workout.repository

import demo.workout.entity.WorkoutGroup
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WorkoutGroupRepository : PagingAndSortingRepository<WorkoutGroup,UUID>