package ru.gb.oseminar.controller;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class TeacherControllerTest {

    @org.junit.jupiter.api.Test
    void create() {
        var teacherCtrl = new TeacherControllerImpl();
        teacherCtrl.create("firstName", "secondName", "patronymic", LocalDate.now());
    }

    @org.junit.jupiter.api.Test
    void viewTeacher() {
        var teacherCtrl = new TeacherControllerImpl();
        teacherCtrl.create("firstName", "secondName", "patronymic", LocalDate.now());
        teacherCtrl.viewTeacher(1L);
    }

    @org.junit.jupiter.api.Test
    void viewAllTeachers() {
        var teacherCtrl = new TeacherControllerImpl();
        teacherCtrl.create("1firstName", "1secondName", "1patronymic", LocalDate.now());
        teacherCtrl.create("2firstName", "2secondName", "2patronymic", LocalDate.now());
        teacherCtrl.viewAllTeachers();
    }

    @Test
    void setTeacherFirstName() {
        var teacherCtrl = new TeacherControllerImpl();
        teacherCtrl.create("1firstName", "1secondName", "1patronymic", LocalDate.now());
        teacherCtrl.setTeacherFirstName(1L, "changeFirstName");
        teacherCtrl.viewTeacher(1L);
    }

    @Test
    void setTeacherSecondName() {
        var teacherCtrl = new TeacherControllerImpl();
        teacherCtrl.create("1firstName", "1secondName", "1patronymic", LocalDate.now());
        teacherCtrl.setTeacherSecondName(1L, "changeSecondName");
        teacherCtrl.viewTeacher(1L);
    }
}