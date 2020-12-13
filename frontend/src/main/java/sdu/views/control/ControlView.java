package sdu.views.control;

import Domain.MachineControl;
import Domain.MachineValues;
import Domain.Read;
import Domain.Write;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import sdu.views.main.MainView;

@Route(value = "control", layout = MainView.class)
@PageTitle("Control")
@JsModule("./src/views/control/control-view.js")
@Tag("control-view")
public class ControlView extends PolymerTemplate<TemplateModel> {

    @Id
    private Button resetButton;

    @Id
    private Button startButton;

    @Id
    private Button stopButton;

    @Id
    private Button abortButton;

    @Id
    private Button clearButton;

    @Id
    private Button setMachineSpeedButton;

    @Id
    private TextField machineSpeedInputTextField;

    @Id
    private Button setQuantityButton;

    @Id
    private TextField setQuantityTextField;

    @Id
    private Button setProductIdButton;

    @Id
    private TextField setProductIdTextField;

    @Id
    private Button setBatchIdButton;

    @Id
    private TextField setBatchIdTextField;

    public ControlView() {
        setId("control-view");


        //create objects to call methods from backend
        Write write = new Write();
        MachineValues machineValues = new MachineValues();
        MachineControl machineControl = new MachineControl();

        //functionality for reset button
        resetButton.addClickListener(e ->
                machineControl.machineCntrlCmd(1));

        //functionality for start button
        startButton.addClickListener(e ->
                machineControl.startMachine());

        //functionality for stop
        stopButton.addClickListener(e ->
                machineControl.machineCntrlCmd(3));

        //functionality for abort button
        abortButton.addClickListener(e ->
                machineControl.machineCntrlCmd(4));

        //functionality for clear button
        clearButton.addClickListener(e ->
                machineControl.machineCntrlCmd(5));


        //functionality for setMachineSpeed button
        setMachineSpeedButton.addClickListener(e ->
                write.setMachineSpeed(Integer.parseInt(machineSpeedInputTextField.getValue())));


        //functionality for setQuantity button
        setQuantityButton.addClickListener(e ->
                write.setBatchQuantity(Integer.parseInt(setQuantityTextField.getValue())));

        //functionality for setProductId button
        setProductIdButton.addClickListener(e ->
                write.setProductId(Integer.parseInt(setProductIdTextField.getValue())));

        //functionality for setBatchId button
        setBatchIdButton.addClickListener(e ->
                write.setBatchId(Integer.parseInt(setBatchIdTextField.getValue())));



    }
    }
