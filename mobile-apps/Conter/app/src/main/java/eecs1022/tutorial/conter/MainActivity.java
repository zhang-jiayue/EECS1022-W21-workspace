package eecs1022.tutorial.conter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import eecs1022.tutorial.conter.model.Counter;

public class MainActivity extends AppCompatActivity {

    Counter c;

    /*
    constructor for the app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = new Counter(0);
    }

    /* this mutator sets the output label */
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /* this accessor retrieves input entered on the text view  */
    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    /* this accessor retrieves input chosen from some spinner (drop-down menu) */
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    public void computeButtonCreateCounterClicked(View view){
        // retrieve input from GUI
        String textInitValue = getInputOfTextField(R.id.inputInitValue);
        //e.g. d = Double.parseDouble(textInitValue)
        int initValue = Integer.parseInt(textInitValue);

        //execute effects on model objects
        c = new Counter(initValue);

        // output to the device screen
        setContentsOfTextView(R.id.outputCounterValue, "Counter Value: " + c.getValue());
    }

    public void computeButtonIncrementClicked(View view){
        //execute effects on model objects
        c.increment();
        setContentsOfTextView(R.id.outputCounterValue, "Counter Value: " + c.getValue());

    }

    public void computeButtonDecrementClicked(View view) {
        //execute effects on model objects
        c.decrement();
        setContentsOfTextView(R.id.outputCounterValue, "Counter Value: " + c.getValue());
    }


    }