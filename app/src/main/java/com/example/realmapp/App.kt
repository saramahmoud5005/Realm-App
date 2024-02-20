package com.example.realmapp

import android.app.Application
import com.example.realmapp.models.Address
import com.example.realmapp.models.Course
import com.example.realmapp.models.Student
import com.example.realmapp.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class App:Application() {

    companion object{
        lateinit var realm:Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}