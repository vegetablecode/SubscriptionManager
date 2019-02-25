import React, { Component } from "react";

class ClientCard extends Component {
  render() {
    const { client } = this.props;
    return (
      <tr>
        <td>
          <div className="form-check">{client.name}</div>
        </td>
        <td>Data wystawienia: {client.date}</td>
        <td>Data czegoś tam: {client.date}</td>
        <td className="td-actions text-right">
          <button
            type="button"
            rel="tooltip"
            title="Edit Task"
            className="btn btn-info btn-simple btn-link"
          >
            <i className="fa fa-edit" />
          </button>
          <button
            type="button"
            rel="tooltip"
            title="Remove"
            className="btn btn-danger btn-simple btn-link"
          >
            <i className="fa fa-times" />
          </button>
        </td>
      </tr>
    );
  }
}

export default ClientCard;
