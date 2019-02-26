import React, { Component } from "react";

class ClientCard extends Component {
  render() {
    const { client } = this.props;
    return (
      <tr>
        <td style={{ width: "100%" }}>
          <div>
            <b>{client.name}</b>
          </div>
          <div>data kolejnego rozliczenia: {client.date}</div>
          <div>
            informacje: <i title="stała umowa serwisowa" className="fa fa-wrench" />
            <i title="faktura nieopłacona" className="fa fa-calendar" />
            <i title="klient z ważnym zadaniem" className="fa fa-warning" />
          </div>
        </td>
        <td className="td-actions text-right">
          <button
            type="button"
            rel="tooltip"
            title="edytuj klienta"
            className="btn btn-info btn-simple btn-link"
          >
            <i className="fa fa-eye" />
          </button>
          <button
            type="button"
            rel="tooltip"
            title="Remove"
            className="btn btn-warning btn-simple btn-link"
          >
            <i className="fa fa-wrench" />
          </button>
        </td>
      </tr>
    );
  }
}

export default ClientCard;
