package demo.workout.controller

import demo.workout.entity.WorkoutGroup
import demo.workout.service.WorkoutGroupService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import java.util.*

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

    @GetMapping("get-workout-group-by-id")
    fun getAllByID(@RequestParam id: UUID): WorkoutGroup? {
        return workoutGroupService.getById(
            id = id
        )
    }
    
    @PostMapping("create-workout-groups")
    fun create(@RequestBody workoutGroups : List<WorkoutGroup>){
        return workoutGroupService.create(workoutGroups)
    }
}