package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TeacherServiceImpl implements TeacherService {

    private final List<Teacher> teachers;

    public TeacherServiceImpl() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacher.setTeacherId(countMaxId);
        teachers.add(teacher);
    }

    @Override
    public Optional<Teacher> getById(Long teacherId) {
        return teachers.stream().filter(t -> Objects.equals(t.getTeacherId(), teacherId)).findFirst();
    }
}
