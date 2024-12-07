package demo.workout.controller

import demo.workout.entity.Workout
import demo.workout.service.WorkoutService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
class WorkoutController(private val workoutService: WorkoutService) {
    @GetMapping("get-all-workouts")
    fun getAll(@RequestParam pageNumber: Int?, @RequestParam pageSize: Int?, @RequestParam sort: String?): Page<Workout> {
        return workoutService.getAll(
            pageNumber = pageNumber,
            pageSize = pageSize,
            sort = sort
        )
    }
}