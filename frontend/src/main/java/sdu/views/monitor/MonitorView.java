package sdu.views.monitor;

import Domain.Read;
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
import com.vaadin.flow.router.RouteAlias;

@Route(value = "monitor", layout = MainView.class)
@PageTitle("Monitor")
@JsModule("./src/views/monitor/monitor-view.js")
@Tag("monitor-view")
@RouteAlias(value = "", layout = MainView.class)
public class MonitorView extends PolymerTemplate<TemplateModel> {


    @Id
    private TextField currentMachineSpeedTextField;

    @Id
    private TextField currentProductTextField;

    @Id
    private TextField currentBatchIdTextField;

    @Id
    private TextField currentQuantityTextField;

    @Id
    private TextField productsProducedTextField;

    @Id
    private TextField defectiveProductsProducedTextField;

    @Id
    private TextField stopReasonIdTextField;

    @Id
    private TextField vibrationTextField;

    @Id
    private TextField relativeHumidityTextField;

    @Id
    private TextField temperatureTextField;

    @Id
    private TextField currentStateTextField;


    public MonitorView() {
        setId("monitor-view");

        //functionality for currentMachineSpeed text field
        currentMachineSpeedTextField.setValue(Read.getMachineSpeed());

        //functionality for currentProduct text field
        currentProductTextField.setValue(Read.getCurrentProduct());

        //functionality for currentBatchId text field
        currentBatchIdTextField.setValue(Read.getCurrentBatchId());

        //functionality for currentQuantity text field
        currentQuantityTextField.setValue(Read.getCurrentQuantity());

        //functionality for productsProduced text field
        productsProducedTextField.setValue(Read.getProductsProduced());

        //functionality for defectiveProductsProduced text field
        defectiveProductsProducedTextField.setValue(Read.getFailedProductsProduced());

        //functionality for stopReasonId text field
        stopReasonIdTextField.setValue(Read.getStopReasonId());

        //functionality for vibration text field
        vibrationTextField.setValue(Read.getVibration());

        //functionality for relativeHumidity text field
        relativeHumidityTextField.setValue(Read.getHumidity());

        //functionality for temperature text field
        temperatureTextField.setValue(Read.getTemperature());

        //functionality for currentState text field
        currentStateTextField.setValue(Read.getCurrentState());


    }
    }

