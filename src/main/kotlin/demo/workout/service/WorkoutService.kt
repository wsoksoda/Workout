package demo.workout.service

import demo.workout.entity.Workout
import demo.workout.repository.WorkoutRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class WorkoutService(private val workoutRepository: WorkoutRepository) {
    fun getAll(pageNumber: Int?, pageSize: Int?, sort: String?) : Page<Workout> {
        val pageRequest = PageRequest.of(pageNumber?: 0, pageSize ?: 10, Sort.by(sort ?: "id"))
        return workoutRepository.findAll(pageRequest)
    }

    fun create(workouts : List<Workout>){
        workoutRepository.saveAll(workouts)
    }
}