package demo.workout.repository

import demo.workout.entity.WorkoutGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WorkoutGroupRepository : JpaRepository<WorkoutGroup,UUID>