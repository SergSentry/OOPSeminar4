package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherViewImpl implements TeacherView{
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(Teacher teacher) {
            logger.info(teacher.toString());
    }

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher : teachers){
            logger.info(teacher.toString());
        }
    }
}
