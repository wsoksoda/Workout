package demo.workout.service

import demo.workout.entity.WorkoutGroup
import demo.workout.repository.WorkoutGroupRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.getOrNull

@Service
class WorkoutGroupService(private val workoutGroupRepository: WorkoutGroupRepository) {
    fun getAll(pageNumber: Int?, pageSize: Int?, sort: String?) : Page<WorkoutGroup> {
        val pageRequest = PageRequest.of(pageNumber?: 0, pageSize ?: 10, Sort.by(sort ?: "id"))
        return workoutGroupRepository.findAll(pageRequest)
    }

    fun getById(id : UUID) : WorkoutGroup? {
        return workoutGroupRepository.findById(id).getOrNull()
    }

    fun create(workoutGroups : List<WorkoutGroup>){
        workoutGroupRepository.saveAll(workoutGroups)
    }
}