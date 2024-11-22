package demo.workout.service

import demo.workout.entity.Lift
import demo.workout.repository.LiftRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class LiftService(private val liftRepository: LiftRepository) {
    fun getAll(pageNumber: Int?, pageSize: Int?, sort: String?) : Page<Lift> {
        val pageRequest = PageRequest.of(pageNumber?: 0, pageSize ?: 10, Sort.by(sort ?: "id"))
        return liftRepository.findAll(pageRequest)
    }
}