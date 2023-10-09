package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;

public interface TeacherController extends UserController<Teacher>{
    Teacher getTeacher(Long teacherId);

    void setTeacherFirstName(Long teacherId, String firstName);

    void setTeacherSecondName(Long teacherId, String secondName);

    void viewTeacher(Long teacherId);

    void viewAllTeachers();
}
