package com.example.todolist

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@RestController
//@RequestMapping("tasks")
//class TaskController {
//    @GetMapping("")
//    fun index( model: Model) :String {
//        val tasks = listOf(
//                Task(1,"障子を張り替える",false),
//                Task(2,"定期健診に行く",true)
//        )
//        return tasks.toString()
//    }
//}

@Controller
@RequestMapping("tasks")
class TaskController {
    @GetMapping("")
    fun index( model: Model) :String {
        val tasks = listOf(
                Task(1,"障子を張り替える",false),
                Task(2,"定期健診に行く",true)
        )
        model.addAttribute("tasks",tasks)
        return "tasks/index.html"
    }
}