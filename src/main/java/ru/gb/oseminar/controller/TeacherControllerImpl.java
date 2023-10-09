package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.service.TeacherServiceImpl;
import ru.gb.oseminar.view.TeacherView;
import ru.gb.oseminar.view.TeacherViewImpl;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Optional;

public class TeacherControllerImpl implements TeacherController{

    private final TeacherService dataService = new TeacherServiceImpl();
    private final TeacherView teacherView = new TeacherViewImpl();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    @Override
    public Teacher getTeacher(Long teacherId){
        Optional<Teacher> teacher = dataService.getById(teacherId);
        if (teacher.isPresent())
            return teacher.get();
        else
            throw new NoSuchElementException();
    }

    @Override
    public void setTeacherFirstName(Long teacherId, String firstName){
        Optional<Teacher> teacher = dataService.getById(teacherId);
        if (teacher.isPresent())
            teacher.get().setFirstName(firstName);
        else
            throw new NoSuchElementException();
    }

    @Override
    public void setTeacherSecondName(Long teacherId, String secondName){
        Optional<Teacher> teacher = dataService.getById(teacherId);
        if (teacher.isPresent())
            teacher.get().setSecondName(secondName);
        else
            throw new NoSuchElementException();
    }

    @Override
    public void viewTeacher(Long teacherId){
        Optional<Teacher> teacher = dataService.getById(teacherId);
        if (teacher.isPresent())
            teacherView.sendOnConsole(teacher.get());
        else
            throw new NoSuchElementException();
    }

    @Override
    public void viewAllTeachers(){
        teacherView.sendOnConsole(dataService.getAll());
    }
}
