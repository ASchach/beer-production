import { PolymerElement } from '@polymer/polymer/polymer-element.js';
import { html } from '@polymer/polymer/lib/utils/html-tag.js';

class ControlView extends PolymerElement {
  static get template() {
    return html`
    <style>
      :host {
        display: block;
        padding: 1em;
      }
      </style>
    <vaadin-button id="resetButton">reset</vaadin-button>

    <vaadin-button id="startButton">start</vaadin-button>

    <vaadin-button id="stopButton">stop</vaadin-button>

    <vaadin-button id="abortButton">clear</vaadin-button>

    <vaadin-button id="clearButton">clear</vaadin-button>

    <vaadin-button id="setMachineSpeedButton">set machine speed</vaadin-button>

    <vaadin-text-field id="machineSpeedInputTextField"
                       label="set machine speed to"
    ></vaadin-text-field>

    <vaadin-button id="setQuantityButton">set batch quantity</vaadin-button>

    <vaadin-text-field id="setQuantityTextField"
                       label="set batch quantity to"
    ></vaadin-text-field>

    <vaadin-button id="setProductIdButton">set product ID</vaadin-button>

    <vaadin-text-field id="setProductIdTextField"
                       label="set product ID to"
    ></vaadin-text-field>

    <vaadin-button id="setBatchIdButton">set batch ID</vaadin-button>

    <vaadin-text-field id="setBatchIdTextField"
                       label="set batch ID to"
    ></vaadin-text-field>
    `;
  }

  static get is() {
    return 'control-view';
  }
}

customElements.define(ControlView.is, ControlView);
