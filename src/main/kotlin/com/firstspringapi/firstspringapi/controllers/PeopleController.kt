package com.firstspringapi.firstspringapi

import com.firstspringapi.firstspringapi.models.People
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/people")
class PeopleController{
    private val persons = mutableListOf<People>()

    @GetMapping("/getall")
    fun GetAllPeople() : List<People> {
        return persons
    }

    @PostMapping("/addperson")
    fun addPerson(@RequestBody person : People) : People{
        persons.add(person)
        return person
    }

}