package ShapeModels;

import java.awt.Point;

import Controllers.Data;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import jsonShapesProperties.JSONData;

public class CircleModel extends EllipseModel {


	private Color fillInColor;
	private Color borderColor;
	private double borderWidth;
	private double radius;
	private Point firstPt;
	private Point secondPt;
	public CircleModel(double radius, double xCent, double yCent) {
		super(radius , radius , xCent, yCent);
		this.radius = radius;
		
	}
//	public CircleModel(Point firstPt, Point secondPt) {
//		super(firstPt, secondPt);
//	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * get fill color.
	 * @return Color fill in color
	 * */
	public Color getFillInColor() {
		// TODO Auto-generated method stub
		return fillInColor;
	}

	/**
	 * sets the fill-in color of the shape.
	 * @param color the color to be set
	 * */
	public void setFillInColor(Color color) {
		fillInColor = color;
	}


	/**
	 * returns the border color.
	 * @return the border color
	 * */
	public Color getBorderColor() {
		// TODO Auto-generated method stub
		return borderColor;
	}

	/**
	 * sets the border color.
	 * @param color to be set as a border color
	 * */
	public void setBorderColor(Color color) {
		// TODO Auto-generated method stub
		borderColor = color;
	}

	/**
	 * gets the border width value.
	 * @return double value indicating the width color
	 * */
	public double getBorderWidth() {
		return borderWidth;
	}

	/**
	 * sets the border width with the given value.
	 * @param borderWidth the value to be set as border width
	 * */
	public void setBorderWidth(double borderWidth) {
		borderWidth = this.borderWidth;
	}

	/**
	 * draw shape using the canvas.
	 * @param current the canvas to which painted materials will be appended
	 * @param event the mouse event that called the draw method
	 * */
	@Override
	public void drawShape(Pane paint, Canvas canvas, Data shapes, JSONData json) {
		super.setBorderColor(this.borderColor);
		super.setFillInColor(this.fillInColor);
		super.drawShape(paint, canvas, shapes, json);
	}

}
