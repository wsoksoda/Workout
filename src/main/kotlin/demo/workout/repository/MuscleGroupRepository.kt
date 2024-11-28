package demo.workout.repository

import demo.workout.entity.MuscleGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MuscleGroupRepository : JpaRepository<MuscleGroup, UUID>