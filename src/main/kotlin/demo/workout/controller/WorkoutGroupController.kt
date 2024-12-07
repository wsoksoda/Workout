package demo.workout.controller

import demo.workout.entity.WorkoutGroup
import demo.workout.service.WorkoutGroupService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
class WorkoutGroupController(private val workoutGroupService: WorkoutGroupService) {
    @GetMapping("get-all-workout-groups")
    fun getAll(@RequestParam pageNumber: Int?, @RequestParam pageSize: Int?, @RequestParam sort: String?): Page<WorkoutGroup> {
        return workoutGroupService.getAll(
            pageNumber = pageNumber,
            pageSize = pageSize,
            sort = sort
        )
    }
}