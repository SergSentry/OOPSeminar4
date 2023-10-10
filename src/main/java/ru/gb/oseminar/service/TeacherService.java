package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.util.Optional;

public interface TeacherService extends UserService<Teacher> {
    Optional<Teacher> getById(Long teacherId);
}
