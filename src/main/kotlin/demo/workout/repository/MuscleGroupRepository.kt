package demo.workout.repository

import demo.workout.entity.MuscleGroup
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MuscleGroupRepository : PagingAndSortingRepository<MuscleGroup, UUID>