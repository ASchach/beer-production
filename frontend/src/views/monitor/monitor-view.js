import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';

class MonitorView extends PolymerElement {
  static get template() {
    return html`
    <style>
      :host {
        display: block;
        padding: 1em;
      }
      </style>
    <vaadin-text-field id="currentMachineSpeedTextField"
                       label="current machine speed"
    ></vaadin-text-field>

    <vaadin-text-field id="currentProductTextField"
                       label="current product"
    ></vaadin-text-field>

    <vaadin-text-field id="currentBatchIdTextField"
                       label="current batch ID"
    ></vaadin-text-field>

    <vaadin-text-field id="currentQuantityTextField"
                       label="current quantity"
    ></vaadin-text-field>

    <vaadin-text-field id="productsProducedTextField"
                       label="products produced"
    ></vaadin-text-field>

    <vaadin-text-field id="defectiveProductsProducedTextField"
                       label="defective products produced"
    ></vaadin-text-field>

    <vaadin-text-field id="stopReasonIdTextField"
                       label="stop reason ID"
    ></vaadin-text-field>

    <vaadin-text-field id="vibrationTextField"
                       label="vibration"
    ></vaadin-text-field>

    <vaadin-text-field id="relativeHumidityTextField"
                       label="relative humidity"
    ></vaadin-text-field>

    <vaadin-text-field id="temperatureTextField"
                       label="temperature"
    ></vaadin-text-field>

    <vaadin-text-field id="currentStateTextField"
                       label="current machine state"
    ></vaadin-text-field>
    
    
    `;
  }

  static get is() {
    return 'monitor-view';
  }
}

customElements.define(MonitorView.is, MonitorView);
