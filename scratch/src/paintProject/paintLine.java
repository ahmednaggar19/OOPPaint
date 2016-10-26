package paintProject;

import java.awt.Point;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineJoin;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;

public class paintLine extends Polygon{

	private double length;
	private double width;
	private Point start;
	private Point end;
	private Color color;
	
	public paintLine(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	/**
	 * returns the border color.
	 * @return the border color
	 * */
	@Override
	public Color getBorderColor() {
		// TODO Auto-generated method stub
		return color;
	}
	@Override
	public void setBorderColor(Color color) {
		// TODO Auto-generated method stub
		color = this.color;
	}

	/**
	 * gets the border width value.
	 * @return double value indicating the width color
	 * */
	@Override
	public double getBorderWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	/**
	 * sets the border width with the given value.
	 * @param borderWidth the value to be set as border width
	 * */
	@Override
	public void setBorderWidth(double borderWidth) {
		// TODO Auto-generated method stub
		width = borderWidth;
	}

	/**
	 * draw shape using the canvas.
	 * @param current the canvas to which painted materials will be appended
	 * */
	public void drawShape(Pane paint) {
		Line l = new Line();
		l.setStartX(start.getX());
		l.setStartY(start.getY());
		l.setEndX(end.getX());
		l.setEndY(end.getY());
		paint.getChildren().add(l);
		return;
	}
}