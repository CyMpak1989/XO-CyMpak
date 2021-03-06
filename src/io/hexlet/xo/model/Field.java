package io.hexlet.xo.model;

import java.awt.*;

public class Field {

    public static final int FIELD_SIZE = 3;
    public static final int MIN_COORDINAT = 0;
    public static final int MAX_COORDINAT = FIELD_SIZE;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return FIELD_SIZE;
    }

    public Figure getFigure(final Point point){
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure){
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point){
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinat){
        return coordinat >= MIN_COORDINAT && coordinat < MAX_COORDINAT;
    }
}
