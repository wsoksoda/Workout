package demo.workout.repository

import demo.workout.entity.Lift
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LiftRepository : PagingAndSortingRepository<Lift, UUID>