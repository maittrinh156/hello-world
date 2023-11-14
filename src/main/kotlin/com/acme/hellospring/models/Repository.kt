package com.acme.hellospring.models

class Repository{
    var owner: String?
//        get() = field
//        set(value) {
//            field = value
//        }
    var name: String?
//        get() = field
//        set(value) {
//            field = value
//        }
    var description: String?
//        get() = field
//        set(value) {
//            field = value
//        }
    var language: String?
//        get() = field
//        set(value) {
//            field = value
//        }

    constructor(
            owner: String?,
            name: String?,
            description: String?,
            language: String?,
    ){
        this.owner = owner
        this.name = name
        this.description = description
        this.language = language
    }
}