package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

public interface TeacherView  extends UserView<Teacher>{
    void sendOnConsole(Teacher teacher);
}
