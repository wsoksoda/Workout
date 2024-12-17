package demo.workout.controller

import demo.workout.entity.Lift
import demo.workout.service.LiftService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
class LiftController(private val liftService: LiftService) {
    @GetMapping("get-all-lifts")
    fun getAll(@RequestParam pageNumber: Int?, @RequestParam pageSize: Int?, @RequestParam sort: String?): Page<Lift> {
        return liftService.getAll(
            pageNumber = pageNumber,
            pageSize = pageSize,
            sort = sort
        )
    }

    @PostMapping("create-lifts")
    fun create(@RequestBody lifts : List<Lift>){
        return liftService.create(lifts)
    }
}