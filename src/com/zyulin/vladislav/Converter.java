package com.zyulin.vladislav;

import com.digdes.school.DatesToCronConvertException;

import java.util.List;

public class Converter implements DatesToCronConverter{

    @Override
    public String convert(List<String> var1) throws DatesToCronConvertException {

        return "* * * * * *";
    }

    @Override
    public String getImplementationInfo() {
        return "Зюлин Владислав Алексеевич, Converter, DigitalDesign, ВСТАВИТЬ ГИТ";
    }

    public static void main(String[] args) {
        
    }

}
