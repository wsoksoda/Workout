package demo.workout.service

import demo.workout.entity.MuscleGroup
import demo.workout.repository.MuscleGroupRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class MuscleGroupService(private val muscleGroupRepository: MuscleGroupRepository) {
    fun getAll(pageNumber: Int?, pageSize: Int?, sort: String?) : Page<MuscleGroup> {
        val pageRequest = PageRequest.of(pageNumber?: 0, pageSize ?: 10, Sort.by(sort ?: "id"))
        return muscleGroupRepository.findAll(pageRequest)
    }

    fun create(muscleGroups : List<MuscleGroup>){
        muscleGroupRepository.saveAll(muscleGroups)
    }
}