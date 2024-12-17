package demo.workout.controller

import demo.workout.entity.MuscleGroup
import demo.workout.service.MuscleGroupService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
class MuscleGroupController(private val muscleGroupService: MuscleGroupService) {
    @GetMapping("get-all-muscle-groups")
    fun getAll(@RequestParam pageNumber: Int?, @RequestParam pageSize: Int?, @RequestParam sort: String?): Page<MuscleGroup> {
        return muscleGroupService.getAll(
            pageNumber = pageNumber,
            pageSize = pageSize,
            sort = sort
        )
    }

    @PostMapping("create-muscle-groups")
    fun create(@RequestBody muscleGroups : List<MuscleGroup>){
        return muscleGroupService.create(muscleGroups)
    }
}