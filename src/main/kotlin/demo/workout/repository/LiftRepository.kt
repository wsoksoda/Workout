package demo.workout.repository

import demo.workout.entity.Lift
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface LiftRepository : JpaRepository<Lift, UUID>
