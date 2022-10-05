
package GUI.LineChart.src.main.java.linechart;
import com.Algorithims.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button Generate_btn;

    @FXML
    private Button Graph_btn;

    @FXML
    private CheckBox Insertion_checkbox;


    @FXML
    private LineChart<String, Number> LineChart;

    @FXML
    private Button bubble_btn;

    @FXML
    private CheckBox bubble_checkbox;

    @FXML
    private Button counting_btn;

    @FXML
    private CheckBox counting_checkbox;

    @FXML
    private Button heap_btn;

    @FXML
    private CheckBox heap_checkox;

    @FXML
    private Button insertion_btn;

    @FXML
    private Button merge_btn;

    @FXML
    private CheckBox merge_checkbox;

    @FXML
    private Button quick_btn;

    @FXML
    private CheckBox quick_checkbox;

    @FXML
    private Button selection_btn;

    @FXML
    private CheckBox selection_checkbox;

    @FXML
    private TextField tf;

    @FXML
    void GenerateArray(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        ArrayGenerator arrayGenerator=new ArrayGenerator(n);
        arrayGenerator.GenerateArray(n);
    }

    @FXML
    void PlotBubble(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        BubbleSort bubbleSort = new BubbleSort(n);

        //Fill in axis
        String[] xAxis = bubbleSort.Analysis().getArray1();
        long[] yAxis = bubbleSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Bubble Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], Math.pow((double) i, 2)));
        }
        series2.setName("n^2");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void PlotCounting(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        CountingSort countingSort = new CountingSort(n);

        //Fill in axis
        String[] xAxis = countingSort.Analysis().getArray1();
        long[] yAxis = countingSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Counting Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], i));
        }
        series2.setName("n");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void PlotHeap(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        HeapSort heapSort = new HeapSort(n);

        //Fill in axis
        String[] xAxis = heapSort.Analysis().getArray1();
        long[] yAxis = heapSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Heap Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], i * ((Math.log(i)) / Math.log(2))));
        }
        series2.setName("nlgn");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void PlotInsertion(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        InsertionSort insertionSort = new InsertionSort(n);

        //Fill in axis
        String[] xAxis = insertionSort.Analysis().getArray1();
        long[] yAxis = insertionSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Insertion Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], Math.pow((double) i, 2)));
        }
        series2.setName("n^2");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void PlotMerge(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        MergeSort mergeSort = new MergeSort(n);

        //Fill in axis
        String[] xAxis = mergeSort.Analysis().getArray1();
        long[] yAxis = mergeSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Merge Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], i * ((Math.log(i)) / Math.log(2))));
        }
        series2.setName("nlgn");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void PlotQuick(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        QuickSort quickSort = new QuickSort(n);

        //Fill in axis
        String[] xAxis = quickSort.Analysis().getArray1();
        long[] yAxis = quickSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Quick Sort");


        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], i * ((Math.log(i)) / Math.log(2))));
        }
        series2.setName("nlgn");

        LineChart.getData().addAll(series1, series2);

    }

    @FXML
    void PlotSelection(ActionEvent event) {
        String NumofInputs = tf.getText();
        int n = Integer.valueOf(NumofInputs);
        SelectionSort selectionSort = new SelectionSort(n);

        //Fill in axis
        String[] xAxis = selectionSort.Analysis().getArray1();
        long[] yAxis = selectionSort.Analysis().getArray2();

        XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
        }
        series1.setName("Selection Sort");

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        for (int i = 0; i < xAxis.length; i++) {
            series2.getData().add(new XYChart.Data(xAxis[i], Math.pow((double) i, 2)));
        }
        series2.setName("n^2");

        LineChart.getData().addAll(series1, series2);
    }

    @FXML
    void onGraphClicked(ActionEvent event) {
        if (Insertion_checkbox.isSelected()) //Graph Insertion Sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            InsertionSort insertionSort = new InsertionSort(n);

            //Fill in axis
            String[] xAxis = insertionSort.Analysis().getArray1();
            long[] yAxis = insertionSort.Analysis().getArray2();

            XYChart.Series<String, Number> series1 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series1.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series1.setName("Insertion Sort");
            LineChart.getData().addAll(series1);
        }
        if (merge_checkbox.isSelected())    //Graph MergeSort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            MergeSort mergeSort = new MergeSort(n);

            //Fill in axis
            String[] xAxis = mergeSort.Analysis().getArray1();
            long[] yAxis = mergeSort.Analysis().getArray2();

            XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series2.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series2.setName("Merge Sort");
            LineChart.getData().addAll(series2);
        }
        if (quick_checkbox.isSelected())     //Graph Quick Sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            QuickSort quickSort = new QuickSort(n);

            //Fill in axis
            String[] xAxis = quickSort.Analysis().getArray1();
            long[] yAxis = quickSort.Analysis().getArray2();

            XYChart.Series<String, Number> series3 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series3.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series3.setName("Quick Sort");
            LineChart.getData().addAll(series3);
        }
        if (selection_checkbox.isSelected()) //Graph Selection Sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            SelectionSort selectionSort = new SelectionSort(n);

            //Fill in axis
            String[] xAxis = selectionSort.Analysis().getArray1();
            long[] yAxis = selectionSort.Analysis().getArray2();

            XYChart.Series<String, Number> series4 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series4.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series4.setName("Selection Sort");
            LineChart.getData().addAll(series4);
        }
        if (heap_checkox.isSelected())  //Graph Heap Sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            HeapSort heapSort = new HeapSort(n);

            //Fill in axis
            String[] xAxis = heapSort.Analysis().getArray1();
            long[] yAxis = heapSort.Analysis().getArray2();

            XYChart.Series<String, Number> series5 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series5.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series5.setName("Heap Sort");
            LineChart.getData().addAll(series5);
        }
        if (counting_checkbox.isSelected()) //Graph counting sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            CountingSort countingSort = new CountingSort(n);

            //Fill in axis
            String[] xAxis = countingSort.Analysis().getArray1();
            long[] yAxis = countingSort.Analysis().getArray2();

            XYChart.Series<String, Number> series6 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series6.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series6.setName("Counting Sort");
            LineChart.getData().addAll(series6);
        }
        if (bubble_checkbox.isSelected())      //Graph Bubble Sort
        {
            String NumofInputs = tf.getText();
            int n = Integer.valueOf(NumofInputs);
            BubbleSort bubbleSort = new BubbleSort(n);

            //Fill in axis
            String[] xAxis = bubbleSort.Analysis().getArray1();
            long[] yAxis = bubbleSort.Analysis().getArray2();

            XYChart.Series<String, Number> series7 = new XYChart.Series<String, Number>();
            for (int i = 0; i < xAxis.length; i++) {
                series7.getData().add(new XYChart.Data(xAxis[i], yAxis[i]));
            }
            series7.setName("Bubble Sort");
            LineChart.getData().addAll(series7);
        }
    }

}





