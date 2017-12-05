package chart;

import javafx.scene.chart.*;

import java.util.ArrayList;

public class Scatter {
    private NumberAxis xAxis;
    private NumberAxis yAxis;
    private ScatterChart scatter;
    private GenerateChart gc;

    public Scatter() {
        setScatter();
    }

    public Scatter (String title, ArrayList<Series> seriesList, ArrayList<Category> catList) {
        setTitle(title);
        setScatter();
        gc.generateChart (seriesList, catList, false);
    }

    public Scatter (String xLabel, String yLabel) {
        setScatter();
        gc.setXYLabel(xLabel, yLabel, false);
    }

    public Scatter (String title, ArrayList<chart.Series> seriesList, ArrayList<Category> catList, String xLabel, String yLabel) {
        setTitle(title);
        setScatter();
        gc.setXYLabel(xLabel, yLabel, false);
        gc.generateChart (seriesList, catList, false);
    }

    private void setScatter() {
        xAxis = new NumberAxis();
        yAxis = new NumberAxis();
        scatter = new ScatterChart<>(xAxis, yAxis);
    }

    public void setTitle (String title) {
        scatter.setTitle (title);
    }
}
